package br.emprestimo.modelo;

import java.util.Objects;

public class Usuario {
	private String ra;

	private String nome;

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		if (ra == "" | ra == null) {
			throw new RuntimeException("RA inválido.");
		}
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == "" | nome == null) {
			throw new RuntimeException("Usuário inválido.");
		}
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
			// self check
			if (this == obj)
				return true;
			// null check
			if (obj == null)
				return false;
			// type check and cast
			if (getClass() != obj.getClass())
				return false;
			// field comparison
			Usuario usuario = (Usuario) obj;
			return Objects.equals(nome, usuario.nome) && Objects.equals(ra, usuario.ra);
	}

}
