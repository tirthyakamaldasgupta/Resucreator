package com.resucreator.webservices.services.resume;

import com.resucreator.webservices.collections.Resume;
import com.resucreator.webservices.exceptions.NoSuchElementFoundException;
import com.resucreator.webservices.repositories.ResumeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResumeServiceImpl implements ResumeService {
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

    @Override
    public Optional<Resume> getResume(String id) {
        Optional<Resume> resume = resumeRepository.findById(id);

        if (resume.isPresent()) {
            return resume;
        }

        throw new NoSuchElementFoundException("No resume with an id " + id + " was found");
    }
}
