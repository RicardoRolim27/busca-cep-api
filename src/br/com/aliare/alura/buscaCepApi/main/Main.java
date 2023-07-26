package br.com.aliare.alura.buscaCepApi.main;

import br.com.aliare.alura.buscaCepApi.api.BuscaCepApi;

public class Main {

	public static void main(String[] args) {
		BuscaCepApi api = new BuscaCepApi();
		
		String json = api.buscaCep("85807750");
		
		System.out.println(json);

	}

}
