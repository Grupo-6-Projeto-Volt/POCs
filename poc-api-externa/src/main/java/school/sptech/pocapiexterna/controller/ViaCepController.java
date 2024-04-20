package school.sptech.pocapiexterna.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import school.sptech.pocapiexterna.dto.EnderecoListagemDto;
import school.sptech.pocapiexterna.dto.EnderecoRecebidoDto;
import school.sptech.pocapiexterna.dto.MapperViaCep;

@RestController
@RequestMapping("/ruas")
public class ViaCepController {

    @GetMapping
    public ResponseEntity<EnderecoListagemDto> buscar(@RequestParam String cep) {


        // Ideia do GitHub disponibilizado
        RestClient client = RestClient.builder().baseUrl("https://viacep.com.br/ws/")
                .messageConverters(httpMessageConverters -> httpMessageConverters.add(new MappingJackson2HttpMessageConverter()))
                .build();

        // Ideia do GitHub disponibilizado
        String raw = client.get().uri(cep + "/json").retrieve().body(String.class);

        // Ideia do GitHub disponibilizado
        EnderecoRecebidoDto endereco = client.get().uri(cep + "/json").retrieve()
                .body(EnderecoRecebidoDto.class);

        if (endereco == null) return ResponseEntity.noContent().build();

        return ResponseEntity.ok(MapperViaCep.fromEnderecoRecebidoToEnderecoListagem(endereco));
    }
}
