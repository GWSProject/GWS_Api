package gws.api.aplication.controllers;

import gws.api.aplication.DTOs.DemandasDTOs;
import gws.api.aplication.models.DemandasModel;
import gws.api.aplication.repositories.DemandasRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/demandas")
public class DemandasController {
    @Autowired
    DemandasRepository demandasRepository;

    @GetMapping
    public ResponseEntity<List<DemandasModel>> ListarDemandas(){
        return ResponseEntity.status(HttpStatus.OK).body(demandasRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> BuscarDemandas(@PathVariable(value = "id") UUID id){
        Optional<DemandasModel> buscandoDemandas = demandasRepository.findById(id);

        if (buscandoDemandas.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Demanda não encontrado");
        }


        return ResponseEntity.status(HttpStatus.OK).body(buscandoDemandas.get());
    }

    @PostMapping
    public ResponseEntity<Object> criarCliente(@RequestBody @Valid DemandasDTOs DemandasDTOs){
        if (demandasRepository.findByTitulo(DemandasDTOs.titulo()) != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Titulo já cadastrado");
        }

        DemandasModel novaDemanda = new DemandasModel();
        BeanUtils.copyProperties(DemandasDTOs, novaDemanda);

        return ResponseEntity.status(HttpStatus.CREATED).body(demandasRepository.save(novaDemanda));
    }
}
