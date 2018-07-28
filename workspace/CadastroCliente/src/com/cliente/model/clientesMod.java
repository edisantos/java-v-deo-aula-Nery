package com.cliente.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class clientesMod implements Serializable {

	
	private static final long serialVersionUID = 1L;
	/*Nossa class cliente*/
	String Nome;
    String Endereco;
    String Bairro;
    String Cidade;
    String UF;
    /*Agora vamos criar nosso metodo contrutor*/
    public clientesMod()
    {
    	/*O metodo contrutor tem o mesmo nome da class*/
    	/*Agora vamos criar alguns dados*/
    	/*Para isso vamos para ALT+SHIFT + S > Generate Constructor using fields*/
    	
    }
    public clientesMod(String nome, String endereco, String bairro, String cidade, String uF) {
		/*Metodo contrutor criado usando compos*/
    	Nome = nome;
		Endereco = endereco;
		Bairro = bairro;
		Cidade = cidade;
		UF = uF;
	}
	/*Para criar os Get e Set abaixo automaticamente podemo usar o comando: ALT + SHIFT + S */
    public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	/*Também criamos os dois metodos abaixo, onde nos facilita nas pesquisas*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Bairro == null) ? 0 : Bairro.hashCode());
		result = prime * result + ((Cidade == null) ? 0 : Cidade.hashCode());
		result = prime * result + ((Endereco == null) ? 0 : Endereco.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((UF == null) ? 0 : UF.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		clientesMod other = (clientesMod) obj;
		if (Bairro == null) {
			if (other.Bairro != null)
				return false;
		} else if (!Bairro.equals(other.Bairro))
			return false;
		if (Cidade == null) {
			if (other.Cidade != null)
				return false;
		} else if (!Cidade.equals(other.Cidade))
			return false;
		if (Endereco == null) {
			if (other.Endereco != null)
				return false;
		} else if (!Endereco.equals(other.Endereco))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (UF == null) {
			if (other.UF != null)
				return false;
		} else if (!UF.equals(other.UF))
			return false;
		return true;
	}
	
}
