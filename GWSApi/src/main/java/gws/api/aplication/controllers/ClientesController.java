package gws.api.aplication.controllers;

import gws.api.aplication.DTOs.ClientesDTOs;
import gws.api.aplication.models.ClientesModel;
import gws.api.aplication.repositories.ClientesRepository;
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
@RequestMapping(value = "/clientes")
public class ClientesController {

    @Autowired
    ClientesRepository clientesRepository;

    @GetMapping
    public ResponseEntity<List<ClientesModel>> ListarClientes(){
        return ResponseEntity.status(HttpStatus.OK).body(clientesRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> BuscarCliente(@PathVariable(value = "id") UUID id){
        Optional<ClientesModel> buscandoCliente = clientesRepository.findById(id);

        if (buscandoCliente.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }


        return ResponseEntity.status(HttpStatus.OK).body(buscandoCliente.get());
    }

    @PostMapping
    public ResponseEntity<Object> criarCliente(@RequestBody @Valid ClientesDTOs clientesDTOs){
        if (clientesRepository.findByEmail(clientesDTOs.emailCliente()) != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cliente já cadastrado");
        }

        ClientesModel novoCliente = new ClientesModel();
        BeanUtils.copyProperties(clientesDTOs, novoCliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(clientesRepository.save(novoCliente));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> editarCliente(@PathVariable(value = "id") UUID id, @RequestBody @Valid ClientesDTOs clientesDTOs){
        Optional<ClientesModel> buscandoCliente = clientesRepository.findById(id);

        if (buscandoCliente.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }

        ClientesModel clienteEditado = new ClientesModel();
        BeanUtils.copyProperties(clientesDTOs, clienteEditado);


        return ResponseEntity.status(HttpStatus.CREATED).body(clientesRepository.save(clienteEditado));
    }

    @DeleteMapping("/{idCliente}")
    public ResponseEntity<Object> deletarCliente(@PathVariable(value = "idCliente") UUID id){

        Optional<ClientesModel> clienteBuscado = clientesRepository.findById(id);

        if (clienteBuscado.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
        }

        clientesRepository.delete(clienteBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cliente deletado com sucesso!");

    }

}


