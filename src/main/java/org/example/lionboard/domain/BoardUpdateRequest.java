package org.example.lionboard.domain;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class BoardUpdateRequest {

    @NotEmpty
    private String title;

    @NotEmpty
    private String name;

    @NotEmpty
    private String content;

    @NotEmpty
    private String password;
}
