package org.example.lionboard.domain;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardDeleteRequest {
    private Long id;

    @NotEmpty
    private String password;
}
