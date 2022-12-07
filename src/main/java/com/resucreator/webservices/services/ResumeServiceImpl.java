package com.resucreator.webservices.services;

import com.resucreator.webservices.collections.Resume;
import com.resucreator.webservices.repositories.ResumeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService{
    private final ResumeRepository resumeRepository;

    public ResumeServiceImpl(ResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }

    @Override
    public String createResume(Resume resume) {
        return resumeRepository.save(resume).getId();
    }

    @Override
    public List<Resume> getResumes() {
        return resumeRepository.findAll();
    }
}
