package com.resucreator.resucreator.services.resume;

import com.resucreator.resucreator.collections.Resume;
import com.resucreator.resucreator.exceptions.NoSuchElementException;
import com.resucreator.resucreator.exceptions.NoSuchElementsException;
import com.resucreator.resucreator.repositories.ResumeRepository;
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
        List<Resume> resumes = resumeRepository.findAll();

        if (!resumes.isEmpty()) {
            return resumes;
        }

        throw new NoSuchElementsException("No resumes were found");
    }

    @Override
    public Optional<Resume> getResume(String id) {
        Optional<Resume> resume = resumeRepository.findById(id);

        if (resume.isPresent()) {
            return resume;
        }

        throw new NoSuchElementException("No resume with an id " + id + " was found");
    }
}
