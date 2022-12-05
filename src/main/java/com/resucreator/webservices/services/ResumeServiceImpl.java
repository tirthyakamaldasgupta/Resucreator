package com.resucreator.webservices.services;

import com.resucreator.webservices.collections.Resume;
import com.resucreator.webservices.repositories.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService{
    @Autowired
    private ResumeRepository repository;

    @Override
    public String createResume(Resume resume) {
        return repository.save(resume).getId();
    }

    @Override
    public List<Resume> getResumes() {
        return repository.findAll();
    }
}
