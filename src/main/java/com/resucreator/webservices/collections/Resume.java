package com.resucreator.webservices.collections;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "resumes")
public class Resume {
    @Id
    private String id;

    @NotBlank
    private String title;
    @NotNull
    @Valid
    private Candidate candidate;
}
