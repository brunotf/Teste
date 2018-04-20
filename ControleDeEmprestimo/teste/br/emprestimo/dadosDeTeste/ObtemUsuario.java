package br.emprestimo.dadosDeTeste;

import br.emprestimo.modelo.Usuario;

public class ObtemUsuario {
	public static Usuario obtemUsuarioDadosValidos() {
		Usuario usuario = new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Jose da Silva");
		return usuario;
	}
	
	public static Usuario obtemUsuarioNomeValidoDiferente() {
		Usuario usuario = new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Luiz Paulo");
		return usuario;
	}
	
	public static Usuario obtemUsuarioRaValidoDiferente() {
		Usuario usuario = new Usuario();
		usuario.setRa("11211");
		usuario.setNome("Jose da Silva");
		return usuario;
	}
	
	public static Usuario obtemUsuarioNomeRaValidoDiferente() {
		Usuario usuario = new Usuario();
		usuario.setRa("11211");
		usuario.setNome("Luiz Paulo");
		return usuario;
	}
	
	public static Usuario comNomeInvalido_branco() {
		Usuario usuario = new Usuario();
		usuario.setNome("");
		return usuario;
	}

	public static Usuario comNomeInvalido_nulo() {
		Usuario usuario = new Usuario();
		usuario.setNome("");
		return usuario;
	}
}
