package com.resucreator.webservices.services;

import com.resucreator.webservices.collections.Resume;

import java.util.List;

public interface ResumeService {
    String createResume(Resume resume);

    List<Resume> getResumes();

}
