package school.sptech.pocapiexterna.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AnaliseApiRecebidoDto {
    private String nome;
    private Double preco;
    private String link;
    private LocalDate dataTime;
}
