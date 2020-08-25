package com.telstra.backend.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.backend.demo.data.CandidateApplication;
import com.telstra.backend.demo.data.CandidateApplicationListOutput;
import com.telstra.backend.demo.exception.DBexception;
import com.telstra.backend.demo.service.ImplCandidateApplicationService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class CandidateApplicationController {
	@Autowired
	private ImplCandidateApplicationService applicationService;
	
	@GetMapping(value = "/get-applications")
	@ApiOperation(value = "This API retrieves all the data from db",response = CandidateApplicationListOutput.class)
	public CandidateApplicationListOutput getApplications() throws DBexception {
		CandidateApplicationListOutput op = new CandidateApplicationListOutput();
		op.setCandidatelist(applicationService.getCandidateApplications());
		return op;
	}

	@GetMapping(value = "/get-applications/{id}")
	@ApiOperation(value = "This API retrieves all the data from db by id",response = CandidateApplication.class)
	public Optional<CandidateApplication> getApplicationsById(@PathVariable String id) throws DBexception {
		return applicationService.getCandidateApplicationById(id);
	}

	@PostMapping(value = "/post-applications")
	@ApiOperation(value = "This API creates new canditate",response = String.class)
	public String postApplicationsById(@RequestBody CandidateApplication app) {

		return applicationService.createCandidateApplication(app);

	}

	@PutMapping(value = "/put-applications/{id}")
	@ApiOperation(value = "This API updates canditate's status",response = String.class)
	public String putApplicationsById(@RequestBody CandidateApplication app, @PathVariable String id) {

		return applicationService.updateCandidateApplication(app, id);

	}
}
