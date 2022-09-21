package curso.java.david;

import java.util.Date;

public class Aula71Git {
     
	 private String nome;
	 
	 private String sobrenome;
	 
	 private int idade;
	 
	 private Date dataNascimento;
	 
	 private long cpf;
	 
	 private long rg;
	 
	 private long endereço;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public long getEndereço() {
		return endereço;
	}

	public void setEndereço(long endereço) {
		this.endereço = endereço;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	 
	 
}
