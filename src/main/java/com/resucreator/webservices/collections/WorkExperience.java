package com.resucreator.webservices.collections;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "work_experiences")
public class WorkExperience {
    @Id
    private String id;

    @NotEmpty
    @NotBlank
    @NotNull
    private String companyName;

    @NotEmpty
    @NotBlank
    @NotNull
    private String designation;

    @NotEmpty
    @NotBlank
    @NotNull
    private String startDate;

    private String endDate;

    @NotEmpty
    @NotBlank
    @NotNull
    private String description;
}
