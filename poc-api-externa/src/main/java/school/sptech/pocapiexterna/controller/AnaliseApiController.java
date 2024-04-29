package school.sptech.pocapiexterna.controller;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import school.sptech.pocapiexterna.dto.AnaliseApiListagemDto;
import school.sptech.pocapiexterna.dto.AnaliseApiRecebidoDto;
import school.sptech.pocapiexterna.dto.MapperAnalise;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/analises")
public class AnaliseApiController {

    @GetMapping
    public ResponseEntity<List<AnaliseApiListagemDto>> buscar(@RequestParam String nome) {
        RestTemplate restTemplate = new RestTemplate();

        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        ResponseEntity<List<AnaliseApiRecebidoDto>> responseEntity = restTemplate.exchange(
                "http://127.0.0.1:8000/consulta?query=" + nome,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<AnaliseApiRecebidoDto>>() {});

        List<AnaliseApiRecebidoDto> analises = responseEntity.getBody();

        if (analises == null || analises.isEmpty()) return ResponseEntity.noContent().build();

        return ResponseEntity.ok(MapperAnalise.toListagem(analises));

    }



}
