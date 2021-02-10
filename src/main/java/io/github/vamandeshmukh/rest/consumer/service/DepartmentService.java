package io.github.vamandeshmukh.rest.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.vamandeshmukh.rest.consumer.model.Department;

@Service
public class DepartmentService {

	private static final Logger log = LoggerFactory.getLogger(DepartmentService.class);
	private static final RestTemplateBuilder rtb = new RestTemplateBuilder();
	private static final RestTemplate restTemplate = rtb.build();
	private static final String uri = "http://localhost:8090/";

	public Department getDepartmentById(int id) {
		Department department = restTemplate.getForObject(uri + "department/" + id, Department.class);
		log.info(department.toString());
		return department;
	}

}
