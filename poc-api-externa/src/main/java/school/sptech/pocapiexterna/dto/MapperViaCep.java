package school.sptech.pocapiexterna.dto;

public class MapperViaCep {

    public static EnderecoListagemDto fromEnderecoRecebidoToEnderecoListagem(EnderecoRecebidoDto endReceb){
        if (endReceb == null) return null;

        EnderecoListagemDto dto = new EnderecoListagemDto();
        dto.setBairro(endReceb.getBairro());
        dto.setCep(endReceb.getCep());
        dto.setCidade(endReceb.getCidade());
        dto.setEstado(endReceb.getEstado());
        dto.setRua(endReceb.getRua());

        return dto;
    }
}
