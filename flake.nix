{
  description = "Fun_with_Java_Swing";

  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs?ref=nixos-unstable";
    systems.url = "github:nix-systems/x86_64-linux";
  };

  outputs = {
    self,
    nixpkgs,
    systems,
    ...
  }: let
    forEachSystem = nixpkgs.lib.genAttrs (import systems);
    pkgsFor = forEachSystem (system: import nixpkgs {inherit system;});
  in {
    formatter = forEachSystem (system: pkgsFor.${system}.alejandra);

    devShells = forEachSystem (system: {
      default = pkgsFor.${system}.mkShell {
        packages = with pkgsFor.${system}; [
          hello
        ];
      };
    });

    packages = forEachSystem (system: let
      runnableJar = name:
        pkgsFor.${system}.stdenv.mkDerivation rec {
          inherit name;
          version = "1.0";
          src = ./${name};
          nativeBuildInputs = [pkgsFor.${system}.jdk8];
          buildPhase = ''
            # Make build folder
            mkdir build

            # Compile Java JPanel class and Runner
            javac ${src}/${name}*.java -d build

            # Create manifest file
            printf "Main-Class: ${name}Runner\n" > manifest.mf

            # Create runnable jar
            jar cmf manifest.mf ${name}.jar -C build .
          '';

          installPhase = ''
            mkdir -p $out/bin
            cp ${name}.jar $out/bin/
          '';
        };

      runnableExecutable = name: let
        jar = runnableJar name;
      in
        pkgsFor.${system}.stdenv.mkDerivation rec {
          inherit name;
          src = ./${name};
          propagatedBuildInputs = [pkgsFor.${system}.jdk8 jar];
          installPhase = ''
            mkdir -p $out/bin

            cat > $out/bin/${name} <<EOF
            #!/bin/sh
            exec ${pkgsFor.${system}.jdk8}/bin/java -jar ${jar}/bin/${name}.jar "\$@"
            EOF

            chmod +x $out/bin/${name}
          '';
        };
    in {
      Abstract = runnableExecutable "Abstract";
      Skyline = runnableExecutable "Skyline";
      Emoji = runnableExecutable "Emoji";
    });

    apps = forEachSystem (system: let
      app = name: {
        type = "app";
        program = "${self.packages.${system}.${name}}/bin/${name}";
      };
    in {
      Abstract = app "Abstract";
      Skyline = app "Skyline";
      Emoji = app "Emoji";
    });
  };
}
