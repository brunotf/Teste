package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.dadosDeTeste.ObtemLivro;
import br.emprestimo.modelo.Livro;

public class UC06CadastrarLivro {

	public static Livro livro;
	public static Livro livro2;
	public static Livro livroISBN;
	public static Livro livroTitulo;
	public static Livro livroTituloISBN;
	public static ObtemLivro obtemLivro;
	public static Object o;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		livro = obtemLivro.comDadosValidos();
		livro2 = obtemLivro.comDadosValidos();
		livroISBN = obtemLivro.comDadosValidosISBNDiferente();
		livroTitulo = obtemLivro.comDadosValidosTituloDiferente();
		livroTituloISBN = obtemLivro.comDadosValidosTituloISBNDiferente();
		
		o = new Object();
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC06CadastrarLivro_com_isbn_invalido_branco() {
		try {
			livro.setIsbn("");
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("ISBN inválido.", e.getMessage());
		}
	}

	@Test
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

	@Test
	public void CT04UC06CadastrarLivro_com_titulo_invalido_branco() {
		try {
			livro.setTitulo("");
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("Título inválido.", e.getMessage());
		}
	}

	@Test
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

	@Test
	public void CT07UC06CadastrarLivro_com_autor_invalido_branco() {
		try {
			livro.setAutor("");
			fail("Deveria lançar uma exceção.");
		} catch (RuntimeException e) {
			assertEquals("Autor inválido.", e.getMessage());
		}
	}

	@Test
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
	
	@Test
	public void CT10UC06CadastrarLivro_com_objeto_valido() {
		assertTrue(livro.equals(livro));
	}
	
	@Test
	public void CT11UC06CadastrarLivro_com_objeto_invalido_nulo() {
		assertFalse(livro.equals(null));
	}
	
	@Test
	public void CT12UC06CadastrarLivro_com_objeto_invalido_object() {
		assertFalse(livro.equals(o));
	}
	
	@Test
	public void CT13UC06CadastrarLivro_com_objeto_valido_ISBN_diferente() {
		assertFalse(livro.equals(livroISBN));
	}
	
	@Test
	public void CT14UC06CadastrarLivro_com_objeto_valido_titulo_diferente() {
		assertFalse(livro.equals(livroTitulo));
	}
	
	@Test
	public void CT15UC06CadastrarLivro_com_objeto_valido_titulo_ISBN_diferente() {
		assertFalse(livro.equals(livroTituloISBN));
	}
	
	@Test
	public void CT16UC06CadastrarLivro_com_objeto_validos_iguais_diferentes() {
		assertTrue(livro.equals(livro2));
	}

}
