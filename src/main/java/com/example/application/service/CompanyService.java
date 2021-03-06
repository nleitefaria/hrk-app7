package com.example.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.application.entity.Company;
import com.example.application.repository.CompanyRepository;

@Service
public class CompanyService {

	private CompanyRepository companyRepository;

	public CompanyService(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	public List<Company> findAll() {
		return companyRepository.findAll();
	}

}