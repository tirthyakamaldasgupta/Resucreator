package com.resucreator.resucreator.collections;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "candidates")
public class Candidate {
    @Id
    private String id;

    @NotBlank
    private String firstName;
    private String middleName;

    @NotBlank
    private String lastName;

    @NotEmpty
    private List<String> emailAddresses;

    @NotEmpty
    private List<Long> phoneNumbers;

    @NotBlank
    private String profileSummary;

    @NotEmpty
    private List<String> skills;

    @NotEmpty
    @Valid
    private List<WorkExperience> workExperiences;
}
