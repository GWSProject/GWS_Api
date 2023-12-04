package com.gws.api.apigws.DTOs;

import com.gws.api.apigws.models.TipoUsuarioModel;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public record UsuariosDTOs(
        @NotBlank String nome,
        TipoUsuarioModel tipo_usuario,
        @NotBlank String sobrenome,
        @NotBlank String telefone,
        @NotBlank String email,
        @NotBlank String senha,
        @NotBlank String dataDaferias,
        @NotBlank String designacao,
        @NotBlank String cidade,
        @NotBlank String estado,
        @NotBlank String horasDaSemana,
        MultipartFile foto,
        String descricao,

        List<String> id_demandas,
        List<String> id_hardskills,
        List<String> id_softSkills

        ) {

}
