package school.sptech.pocapiexterna.dto;

import java.util.List;

public class MapperAnalise {

    public static AnaliseApiListagemDto toListagem(AnaliseApiRecebidoDto entity){
        if (entity == null) return null;

        AnaliseApiListagemDto dto = new AnaliseApiListagemDto();

        dto.setNome(entity.getNome());
        dto.setPreco(entity.getPreco());
        dto.setLink(entity.getLink());

        return dto;
    }

    public static List<AnaliseApiListagemDto> toListagem(List<AnaliseApiRecebidoDto> entities){
        return entities.stream().map(MapperAnalise::toListagem).toList();
    }

}
