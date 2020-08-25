package com.telstra.backend.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.telstra.backend.demo.data.CandidateApplication;

public interface CandidateApplicationRepo extends CrudRepository<CandidateApplication, String> {

}
