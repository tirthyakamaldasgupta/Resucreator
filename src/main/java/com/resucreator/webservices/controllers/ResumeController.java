package com.resucreator.webservices.controllers;

import com.resucreator.webservices.collections.Resume;
import com.resucreator.webservices.services.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @GetMapping(path = "/resumes")
    public List<Resume> getResumes() {
        return resumeService.getResumes();
    }

    @PostMapping(path = "/resume")
    public String createResume(@RequestBody Resume resume) {
        return resumeService.createResume(resume);
    }
}
