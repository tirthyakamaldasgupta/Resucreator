package com.resucreator.webservices.collections;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

    @NotEmpty
    @NotBlank
    @NotNull
    private String firstName;
    private String middleName;

    @NotEmpty
    @NotBlank
    @NotNull
    private String lastName;

    @NotNull
    private List<String> emailAddresses;

    @NotNull
    private List<Integer> phoneNumbers;

    @NotEmpty
    @NotBlank
    @NotNull
    private String profileSummary;

    @NotNull
    private List<String> skills;

    @NotNull
    @Valid
    private List<WorkExperience> workExperiences;
}
