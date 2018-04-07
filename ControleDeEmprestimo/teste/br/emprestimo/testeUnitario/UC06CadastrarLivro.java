package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;
import br.emprestimo.servico.ServicoEmprestimo;

public class UC06CadastrarLivro {

	public static Livro livro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(expected = RuntimeException.class)
	public void CT01UC06CadastrarLivro_com_isbn_invalido_branco() {
		try {
			livro.setIsbn("");
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("ISBN inválido.", e.getMessage());
		}
	}

	@Test(expected = RuntimeException.class)
	public void CT02UC06CadastrarLivro_com_isbn_invalido_nulo() {
		try {
			livro.setIsbn(null);
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("ISBN inválido.", e.getMessage());
		}
	}

	@Test
	public void CT03UC06CadastrarLivro_com_isbn_valido() {
		assertEquals("121212", livro.getIsbn());
	}

	@Test(expected = RuntimeException.class)
	public void CT04UC06CadastrarLivro_com_titulo_invalido_branco() {
		try {
			livro.setTitulo("");
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("Título inválido.", e.getMessage());
		}
	}

	@Test(expected = RuntimeException.class)
	public void CT05UC06CadastrarLivro_com_titulo_invalido_nulo() {
		try {
			livro.setTitulo(null);
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("Título inválido.", e.getMessage());
		}
	}

	@Test
	public void CT06UC06CadastrarLivro_com_titulo_valido() {
		assertEquals("Engenharia de Software", livro.getTitulo());
	}

	@Test(expected = RuntimeException.class)
	public void CT07UC06CadastrarLivro_com_autor_invalido_branco() {
		try {
			livro.setAutor("");
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("Autor inválido.", e.getMessage());
		}
	}

	@Test(expected = RuntimeException.class)
	public void CT08UC06CadastrarLivro_com_autor_invalido_nulo() {
		try {
			livro.setAutor(null);
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("Autor inválido.", e.getMessage());
		}
	}

	@Test
	public void CT09UC06CadastrarLivro_com_autor_valido() {
		assertEquals("Pressman", livro.getAutor());
	}

}
