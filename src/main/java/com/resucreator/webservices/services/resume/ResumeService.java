package com.resucreator.webservices.services.resume;

import com.resucreator.webservices.collections.Resume;

import java.util.List;
import java.util.Optional;

public interface ResumeService {
    String createResume(Resume resume);

    List<Resume> getResumes();

    Optional<Resume> getResume(String id);
}
