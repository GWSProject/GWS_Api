package gws.api.aplication.DTOs;

import jakarta.validation.constraints.NotBlank;

public record HardSkillsDTOs(
        @NotBlank String nome
) {

}
