package gws.api.aplication.services;

import gws.api.aplication.models.ClientesModel;
import gws.api.aplication.repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
        private ClientesRepository clientesRepository;

        @Autowired
        public ClientesService(ClientesRepository clientesRepository) {

            this.clientesRepository = clientesRepository;
        }

        public ClientesModel criarCliente(ClientesModel cliente) {

            return clientesRepository.save(cliente);
        }


}
