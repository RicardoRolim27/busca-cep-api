package br.com.aliare.alura.buscaCepApi.adapters;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import br.com.aliare.alura.buscaCepApi.dto.EnderecoDTO;

public class EnderecoDTOTypeAdapter extends TypeAdapter<EnderecoDTO> {

    @Override
    public void write(JsonWriter out, EnderecoDTO enderecoDTO) throws IOException {
        // Implemente a lógica de serialização aqui, se necessário
        // Neste exemplo, vamos apenas escrever o objeto diretamente em JSON
        out.beginObject();
        out.name("cep").value(enderecoDTO.getCep());
        out.name("logradouro").value(enderecoDTO.getRua());
        out.name("bairro").value(enderecoDTO.getBairro());
        out.name("localidade").value(enderecoDTO.getCidade());
        out.name("uf").value(enderecoDTO.getEstado());
        out.name("pais").value(enderecoDTO.getPais());
        out.endObject();
    }

    @Override
    public EnderecoDTO read(JsonReader in) throws IOException {
        EnderecoDTO enderecoDTO = new EnderecoDTO();
        in.beginObject();
        while (in.hasNext()) {
            String name = in.nextName();
            switch (name) {
                case "cep":
                    enderecoDTO.setCep(in.nextString());
                    break;
                case "logradouro":
                    enderecoDTO.setRua(in.nextString());
                    break;
                case "bairro":
                    enderecoDTO.setBairro(in.nextString());
                    break;
                case "localidade":
                    enderecoDTO.setCidade(in.nextString());
                    break;
                case "uf":
                    enderecoDTO.setEstado(in.nextString());
                    break;
                case "pais":
                    enderecoDTO.setPais(in.nextString());
                    break;
                default:
                    in.skipValue();
                    break;
            }
        }
        in.endObject();
        return enderecoDTO;
    }
}
