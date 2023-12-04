package com.gws.api.apigws.DTOs;

import com.gws.api.apigws.models.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public record DemandasDTOs(
        @NotBlank String titulo,
        @NotBlank String logo,
        @NotBlank String descricao,
        TipoPrioridadeModel prioridade,
        @NotNull boolean privacidade,
        TipoStatusModel status,
        @NotBlank String data_final,
        @NotNull double custo,
        List<MultipartFile> copy_anexo,

        List<String> id_segmento,
        UUID id_cliente,
        List<String> id_usuario

) {

}
