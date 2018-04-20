package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.dadosDeTeste.ObtemUsuario;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;

public class UC03CadastrarUsuario {

	public static Usuario usuario;
	public static Usuario usuario2;
	public static Usuario usuarioNome;
	public static Usuario usuarioRa;
	public static Usuario usuarioNomeRa;
	public static Livro livro;
	public static Object o;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = ObtemUsuario.obtemUsuarioDadosValidos();
		usuario2 = ObtemUsuario.obtemUsuarioDadosValidos();
		usuarioNome = ObtemUsuario.obtemUsuarioNomeValidoDiferente();
		usuarioRa = ObtemUsuario.obtemUsuarioRaValidoDiferente();
		usuarioNomeRa = ObtemUsuario.obtemUsuarioNomeRaValidoDiferente();
		
		o = new Object(); 

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
		assertTrue(usuario.equals(usuario));
	}
	
	@Test
	public void CT08UC02CadastrarUsuario_com_objeto_invalido() {
		assertFalse(usuario.equals(null));
	}
	
	@Test
	public void CT09UC02CadastrarUsuario_com_objeto_invalido() {
		assertFalse(usuario.equals(o));
	}
	
	@Test
	public void CT10UC02CadastrarUsuario_com_objetos_valido_nome_diferente() {
		assertFalse(usuario.equals(usuarioNome));
	}
	
	@Test
	public void CT11UC02CadastrarUsuario_com_objetos_validos_ra_diferente() {
		assertFalse(usuario.equals(usuarioRa));
	}
	
	@Test
	public void CT12UC02CadastrarUsuario_com_objetos_validos_nome_ra_diferente() {
		assertFalse(usuario.equals(usuarioNomeRa));
	}
	
	@Test
	public void CT13UC02CadastrarUsuario_com_objetos_validos_nome_ra_diferente() {
		assertTrue(usuario.equals(usuario2));
	}
	
}
