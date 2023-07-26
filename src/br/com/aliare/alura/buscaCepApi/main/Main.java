package br.com.aliare.alura.buscaCepApi.main;

import br.com.aliare.alura.buscaCepApi.api.BuscaCepApi;
import br.com.aliare.alura.buscaCepApi.dto.EnderecoDTO;
import br.com.aliare.alura.buscaCepApi.util.TransformaJsonEmEntidade;

public class Main {

	public static void main(String[] args) {
		BuscaCepApi api = new BuscaCepApi();
		
		String json = api.buscaCep("85810150");
		
		TransformaJsonEmEntidade transforma = new TransformaJsonEmEntidade();
		
		EnderecoDTO dto = new EnderecoDTO();
				
		transforma.transforma(json, dto);
		
		System.out.println(json);

	}

}
