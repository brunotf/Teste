package br.emprestimo.modelo;

import java.util.Objects;

public class Livro {
	private String isbn;

	private String titulo;

	private String autor;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		if (isbn == "" | isbn == null) {
			throw new RuntimeException("ISBN inválido.");
		}
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == "" | titulo == null) {
			throw new RuntimeException("Título inválido.");
		}
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor == "" | autor == null) {
			throw new RuntimeException("Autor inválido.");
		}
		this.autor = autor;
	}

	@Override
	public boolean equals(Object obj) {
		// auto comparação
		if (this == obj)
			return true;
		// comparação nula
		if (obj == null)
			return false;
		// comparação de tipo e cast
		if (getClass() != obj.getClass())
			return false;
		// comparação de atributos
		Livro livro = (Livro) obj;
		return Objects.equals(isbn, livro.isbn) && Objects.equals(titulo, livro.titulo);
	}

}
