package gws.api.aplication.DTOs;

import jakarta.validation.constraints.NotBlank;

public record SoftSkillsDTOs(
        @NotBlank String nome
) {

}
