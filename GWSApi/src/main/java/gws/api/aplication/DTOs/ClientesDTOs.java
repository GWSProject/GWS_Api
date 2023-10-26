package gws.api.aplication.DTOs;

import jakarta.validation.constraints.NotBlank;

public record ClientesDTOs(
        @NotBlank String nomeDaEmpresa,
        @NotBlank String nomeDoCliente,
        @NotBlank String telefoneCliente,
        @NotBlank String emailCliente

) {

}
