package com.gws.api.apigws.DTOs;

import com.gws.api.apigws.models.ClientesModel;
import com.gws.api.apigws.models.SegmentosModel;
import com.gws.api.apigws.models.UsuarioModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

public record DemandasDTOs(
        @NotBlank String titulo,
        @NotBlank String logo,
        @NotBlank String descricao,
        @NotBlank String prioridade,
        @NotNull boolean privacidade,
        @NotBlank String status,
        @NotBlank String data_final,
        @NotNull int custo,
        MultipartFile copy_anexo,

        Set<UUID> id_segmento,
        UUID id_cliente,
        Set<UUID> id_usuario

) {

}
