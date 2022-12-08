package com.resucreator.webservices.controllers.resume;

import com.resucreator.webservices.collections.Resume;
import com.resucreator.webservices.services.resume.ResumeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ResumeController {
    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @GetMapping(path = "/resumes")
    public List<Resume> getResumes() {
        return resumeService.getResumes();
    }

    @GetMapping(path = "/resume/{id}")
    public Optional<Resume> getResume(@PathVariable String id) {
        return resumeService.getResume(id);
    }

    @PostMapping(path = "/resume")
    public String createResume(@RequestBody Resume resume) {
        return resumeService.createResume(resume);
    }
}
