package br.com.aliare.alura.buscaCepApi.dto;

import com.google.gson.annotations.SerializedName;

public class EnderecoDTO {
	@SerializedName("cep")
	public String cep;
	@SerializedName("logradouro")
	private String rua;
	@SerializedName("bairro")
	private String bairro;
	@SerializedName("localidade")
	private String cidade;
	@SerializedName("uf")
	private String estado;
	@SerializedName("pais")
	private String pais;
	
	public EnderecoDTO() {
		
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}
