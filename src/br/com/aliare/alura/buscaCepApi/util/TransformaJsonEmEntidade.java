package br.com.aliare.alura.buscaCepApi.util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.aliare.alura.buscaCepApi.dto.EnderecoDTO;
import br.com.aliare.alura.buscaCepApi.modelos.Endereco;

public class TransformaJsonEmEntidade {
	
	public void transforma(String json, EnderecoDTO dto) {
		
		try {
			Gson gson = new GsonBuilder()
					.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
					.create();
			
			//EnderecoRecord enderecoRecord;
			
			//enderecoRecord = gson.fromJson(json, EnderecoRecord.class);
			
			dto = gson.fromJson(json, EnderecoDTO.class);
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
