package org.example.lionboard.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
public class Board {
    @Id
    private Long id;

    private String name;

    private String password;

    private String content;

    private String title;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
