package school.sptech.pocapiexterna.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EnderecoRecebidoDto {
    private String cep;

    @JsonProperty(value = "uf")
    private String estado;

    @JsonProperty(value = "localidade")
    private String cidade;

    private String bairro;

    @JsonProperty(value = "logradouro")
    private String rua;
}
