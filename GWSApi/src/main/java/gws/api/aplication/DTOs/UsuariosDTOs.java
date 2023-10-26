package gws.api.aplication.DTOs;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record UsuariosDTOs(
        @NotBlank String nome,
        @NotBlank String sobrenome,
        @NotBlank String telefone,
        @NotBlank String email,
        @NotBlank String senha,
        @NotBlank LocalDateTime dataCadastro,
        @NotBlank LocalDateTime dataFerias,
        @NotBlank String designacao,
        @NotBlank String cidade,
        @NotBlank String estado,
        @NotBlank LocalDateTime horasSemanais,
        @NotBlank String foto,
        @NotBlank String descricao

) {

}
