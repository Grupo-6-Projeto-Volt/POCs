package school.sptech.pocapiexterna.dto;

import lombok.Data;

@Data
public class EnderecoListagemDto {
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
}
