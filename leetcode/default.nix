{ pkgs, baseFiles ? true, ... }:

let
  createPackageForSubdir = with pkgs;
    pkgName:
    stdenv.mkDerivation rec {
      pname = "leetcode-${pkgName}";
      version = "1.0";
      src = ./. + "/${pkgName}";
      installPhase = ''
        mkdir -p $out/
        cp *.md out.md
        md_file="out.md"; if [ -f "$md_file" ]; then for file in *[^.md]; do extension=$(echo "$file" | cut -d'.' -f2); content="\`\`\`$extension"; echo "$content" >> "$md_file"; cat "$file" >> "$md_file"; content="\`\`\`"; echo "$content" >> "$md_file"; done; echo "Files appended successfully."; else echo "Target .md file does not exist."; fi
        cp -r . $out/
      '';
    };
  lak = field: list:
    builtins.listToAttrs (map (v: {
      name = v.${field};
      value = v;
    }) list);
  directoryNames = with pkgs;
    builtins.filter (i: i != "default.nix")
    (builtins.attrNames (builtins.readDir ./.));

in with pkgs; lak "pname" (map (dir: createPackageForSubdir dir) directoryNames)
