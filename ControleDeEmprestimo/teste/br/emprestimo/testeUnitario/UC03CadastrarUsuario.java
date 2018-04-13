package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;

public class UC03CadastrarUsuario {

	public static Usuario usuario;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Jose da Silva");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC02CadastrarUsuario_com_ra_invalido_branco() {
		try {
			usuario.setRa("");
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("RA inválido.", e.getMessage());
		}
	}

	@Test
	public void CT02UC02CadastrarUsuario_com_ra_invalido_nulo() {
		try {
			usuario.setRa(null);
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("RA inválido.", e.getMessage());
		}
	}

	@Test
	public void CT03UC02CadastrarUsuario_com_ra_valido() {
		assertEquals("11111", usuario.getRa());
	}

	@Test
	public void CT04UC02CadastrarUsuario_com_nome_invalido_branco() {
		try {
			usuario.setNome("");
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("Usuário inválido.", e.getMessage());
		}
	}

	@Test
	public void CT05UC02CadastrarUsuario_com_nome_invalido_nulo() {
		try {
			usuario.setNome(null);
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("Usuário inválido.", e.getMessage());
		}
	}
	
	@Test
	public void CT06UC02CadastrarUsuario_com_nome_valido() {
		assertEquals("Jose da Silva", usuario.getNome());
	}
	
	@Test
	public void CT07UC02CadastrarUsuario_com_objeto_valido() {
		assertFalse(usuario.equals(usuario));
	}
	
	@Test
	public void CT08UC02CadastrarUsuario_com_objeto_invalido() {
		assertFalse(usuario.equals(null));
	}
}
