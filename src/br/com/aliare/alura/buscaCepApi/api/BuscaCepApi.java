package br.com.aliare.alura.buscaCepApi.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.aliare.alura.buscaCepApi.adapters.EnderecoDTOTypeAdapter;
import br.com.aliare.alura.buscaCepApi.dto.EnderecoDTO;
import br.com.aliare.alura.buscaCepApi.modelos.Endereco;

public class BuscaCepApi {

	String Url = "https://viacep.com.br/ws/";

	public String buscaCep(String cep) {

		try {
			HttpClient client = HttpClient.newHttpClient();

			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(Url + cep + "/json/")).build();

			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

			String json = response.body();

            EnderecoDTOTypeAdapter enderecoDTOTypeAdapter = new EnderecoDTOTypeAdapter();

            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(EnderecoDTO.class, enderecoDTOTypeAdapter)
                    .create();
            
            EnderecoDTO dto = gson.fromJson(json, EnderecoDTO.class);

			
            if (dto != null) {
				// Criar o objeto Endereco usando o construtor que aceita EnderecoDTO
                Endereco endereco = new Endereco(dto);

				System.out.println(endereco);
			} else {
				System.out.println("Erro ao desserializar o JSON. Objeto EnderecoDTO é nulo.");
			}

			return response.body();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return "";
	}

}
