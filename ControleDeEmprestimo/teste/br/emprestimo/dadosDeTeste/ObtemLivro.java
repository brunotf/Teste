package br.emprestimo.dadosDeTeste;

import br.emprestimo.modelo.Livro;

public class ObtemLivro {
	public static Livro comDadosValidos() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		return livro;
	}

	public static Livro comDadosValidosISBNDiferente() {
		Livro livro = new Livro();
		livro.setIsbn("333666");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		return livro;
	}

	public static Livro comDadosValidosTituloDiferente() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("UML Aplicada");
		livro.setAutor("Pressman");
		return livro;
	}

	public static Livro comDadosValidosTituloISBNDiferente() {
		Livro livro = new Livro();
		livro.setIsbn("555666");
		livro.setTitulo("Como Programar");
		livro.setAutor("Pressman");
		return livro;
	}

	public static Livro comISBNInvalido_branco() {
		Livro livro = new Livro();
		livro.setIsbn("");
		return livro;
	}

	public static Livro comISBNInvalido_nulo() {
		Livro livro = new Livro();
		livro.setIsbn(null);
		return livro;
	}
}
