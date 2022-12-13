package com.resucreator.resucreator.repositories;

import com.resucreator.resucreator.collections.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResumeRepository extends MongoRepository<Resume, String> {}
