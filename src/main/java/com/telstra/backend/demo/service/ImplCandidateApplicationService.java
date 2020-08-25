package com.telstra.backend.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telstra.backend.demo.data.CandidateApplication;
import com.telstra.backend.demo.exception.DBexception;
import com.telstra.backend.demo.repo.CandidateApplicationRepo;

@Service
public class ImplCandidateApplicationService {
	@Autowired
	CandidateApplicationRepo candidateApplicationRepo;

	public ArrayList<CandidateApplication> getCandidateApplications() throws DBexception {
		ArrayList<CandidateApplication> res = null;
		try {
			res = (ArrayList<CandidateApplication>) candidateApplicationRepo.findAll();
		} catch (Exception e) {
			throw new DBexception();
		}
		return res;
	}

	public Optional<CandidateApplication> getCandidateApplicationById(String id) throws DBexception {
		Optional<CandidateApplication> res = null;
		try {
			res = candidateApplicationRepo.findById(id);
		} catch (Exception e) {
			throw new DBexception();
		}
		return res;
	}

	public String createCandidateApplication(CandidateApplication app) {
		try {
			candidateApplicationRepo.save(app);
		} catch (Exception e) {
			return "error";
		}
		return "success";

	}

	public String updateCandidateApplication(CandidateApplication app, String id) {
		try {
			candidateApplicationRepo.save(app);
		} catch (Exception e) {
			return "error";
		}
		return "success";

	}

}
