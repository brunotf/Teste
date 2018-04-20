package br.emprestimo.dadosDeTeste;

import br.emprestimo.modelo.Livro;

public class ObtemLivro {
	public Livro comDadosValidos() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		return livro;
	}

	public Livro comDadosValidosISBNDiferente() {
		Livro livro = new Livro();
		livro.setIsbn("333666");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		return livro;
	}

	public Livro comDadosValidosTituloDiferente() {
		Livro livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("UML Aplicada");
		livro.setAutor("Pressman");
		return livro;
	}

	public Livro comDadosValidosTituloISBNDiferente() {
		Livro livro = new Livro();
		livro.setIsbn("555666");
		livro.setTitulo("Como Programar");
		livro.setAutor("Pressman");
		return livro;
	}

	public Livro comISBNInvalido_branco() {
		Livro livro = new Livro();
		livro.setIsbn("");
		return livro;
	}

	public Livro comISBNInvalido_nulo() {
		Livro livro = new Livro();
		livro.setIsbn(null);
		return livro;
	}
}
