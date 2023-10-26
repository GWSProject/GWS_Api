package gws.api.aplication.DTOs;

import jakarta.validation.constraints.NotBlank;

public record SegmentosDTOs(
        @NotBlank String segmento
) {

}
