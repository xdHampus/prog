{
  description = "prog";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-23.05";
    utils.url = "github:numtide/flake-utils";
    utils.inputs.nixpkgs.follows = "nixpkgs";
  };

  outputs = { self, nixpkgs, utils, ... }@inputs:
    utils.lib.eachDefaultSystem (system:
      let
        pkgs = import nixpkgs {
          inherit system;
          config.allowUnfree = true;
        };

        leetcode = import ./leetcode/default.nix { inherit pkgs; };
      in rec {
        devShells.default = pkgs.mkShell rec {
          name = "prog";
          packages = with pkgs; [ jdk17 clang gdb python310 ];
        };

        packages = leetcode;
      });
}
