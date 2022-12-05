package com.resucreator.webservices.repositories;

import com.resucreator.webservices.collections.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResumeRepository extends MongoRepository<Resume, String> {}
