package gws.api.aplication.DTOs;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DemandasDTOs(
        @NotBlank String titulo,
        @NotBlank String logo,
        @NotBlank String descricao,
        @NotBlank String prioridade,
        @NotBlank boolean privacidade,
        @NotBlank String status,
        @NotBlank LocalDate dataInicio,
        @NotBlank LocalDate dataFinal,
        @NotBlank int custo,
        @NotBlank String anexo

) {

}
