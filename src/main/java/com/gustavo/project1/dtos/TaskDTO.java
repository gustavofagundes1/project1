package com.gustavo.project1.dtos;

import com.gustavo.project1.enums.StatusEnum;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDTO {

    @NotBlank(message = "Title is mandatory")
    private String title;

    private String description;

    @NotBlank(message = "Status is mandatory")
    private StatusEnum statusEnum;

}
