package br.com.aliare.alura.buscaCepApi.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.aliare.alura.buscaCepApi.adapters.EnderecoDTOTypeAdapter;
import br.com.aliare.alura.buscaCepApi.dto.EnderecoDTO;
import br.com.aliare.alura.buscaCepApi.modelos.Endereco;

public class TransformaJsonEmEntidade {
	
	public void transforma(String json, EnderecoDTO dto) {
		
		try {
			
			EnderecoDTOTypeAdapter enderecoDTOTypeAdapter = new EnderecoDTOTypeAdapter();

            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(EnderecoDTO.class, enderecoDTOTypeAdapter)
                    .create();
            
            dto = gson.fromJson(json, EnderecoDTO.class);

            if (dto != null) {
				// Criar o objeto Endereco usando o construtor que aceita EnderecoDTO
                Endereco endereco = new Endereco(dto);

				System.out.println(endereco);
			} else {
				System.out.println("Erro ao desserializar o JSON. Objeto EnderecoDTO é nulo.");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
