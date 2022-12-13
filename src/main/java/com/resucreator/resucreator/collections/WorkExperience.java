package com.resucreator.resucreator.collections;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Builder
@Document(collection = "work_experiences")
public class WorkExperience {
    @Id
    private String id;

    @NotBlank
    private String companyName;

    @NotBlank
    private String designation;

    @NotNull
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date startDate;

    private Date endDate;

    @NotBlank
    private String description;
}
