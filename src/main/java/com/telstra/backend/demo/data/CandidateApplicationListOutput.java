package com.telstra.backend.demo.data;

import java.util.ArrayList;

public class CandidateApplicationListOutput {
	private ArrayList<CandidateApplication> candidatelist;

	
	public CandidateApplicationListOutput() {
		this.candidatelist = new ArrayList<>();
	}

	public ArrayList<CandidateApplication> getCandidatelist() {
		return candidatelist;
	}

	public void setCandidatelist(ArrayList<CandidateApplication> candidatelist) {
		this.candidatelist = candidatelist;
	}
	
	
}
