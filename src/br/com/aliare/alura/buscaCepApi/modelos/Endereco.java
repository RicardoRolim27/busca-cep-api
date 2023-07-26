package br.com.aliare.alura.buscaCepApi.modelos;

import br.com.aliare.alura.buscaCepApi.dto.EnderecoDTO;
import br.com.aliare.alura.buscaCepApi.records.EnderecoRecord;

public class Endereco {

	private String cep;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;

	public Endereco(String cep, String rua, int numero, String bairro, String cidade, String estado, String pais) {
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	
	public Endereco(EnderecoRecord enderecoRecord){
		this.cep = enderecoRecord.cep();
		this.rua = enderecoRecord.rua();
		this.bairro = enderecoRecord.bairro();
		this.cidade = enderecoRecord.cidade();
		this.pais = enderecoRecord.pais();
		this.estado = enderecoRecord.estado();
	}
	
	public Endereco(EnderecoDTO dto){
		this.cep = dto.getCep();
		this.rua = dto.getRua();
		this.bairro = dto.getBairro();
		this.cidade = dto.getCidade();
		this.pais = dto.getPais();
		this.estado = dto.getEstado();
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
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

	

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade="
				+ cidade + ", estado=" + estado + ", pais=" + pais + "]";
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
