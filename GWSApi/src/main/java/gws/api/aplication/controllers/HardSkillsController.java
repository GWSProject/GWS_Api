package gws.api.aplication.controllers;


import gws.api.aplication.DTOs.HardSkillsDTOs;
import gws.api.aplication.models.HardSkillsModel;
import gws.api.aplication.repositories.HardSkillsRepository;
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
@RequestMapping(value = "/hardskills")
public class HardSkillsController {
    @Autowired
    HardSkillsRepository hardSkillsRepository;

    @GetMapping
    public ResponseEntity<List<HardSkillsModel>> ListarHardSkills(){
        return ResponseEntity.status(HttpStatus.OK).body(hardSkillsRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> BuscarhardSkills(@PathVariable(value = "id") UUID id){
        Optional<HardSkillsModel> buscandohardSkills = hardSkillsRepository.findById(id);

        if (buscandohardSkills.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("hardSkill não encontrado");
        }


        return ResponseEntity.status(HttpStatus.OK).body(buscandohardSkills.get());
    }

    @PostMapping
    public ResponseEntity<Object> criarCliente(@RequestBody @Valid HardSkillsDTOs hardSkillsDTOs){
        if (hardSkillsRepository.findByNome(hardSkillsDTOs.nome()) != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("hardSkills já cadastrado");
        }

        HardSkillsModel novaHardSkills = new HardSkillsModel();
        BeanUtils.copyProperties(hardSkillsDTOs, novaHardSkills);

        return ResponseEntity.status(HttpStatus.CREATED).body(hardSkillsRepository.save(novaHardSkills));
    }
}
