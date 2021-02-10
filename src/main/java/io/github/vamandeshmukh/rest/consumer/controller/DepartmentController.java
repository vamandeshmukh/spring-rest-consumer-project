package io.github.vamandeshmukh.rest.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.github.vamandeshmukh.rest.consumer.model.Department;
import io.github.vamandeshmukh.rest.consumer.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService service;

	private static final Logger log = LoggerFactory.getLogger(DepartmentService.class);

	@GetMapping("/department/{id}")
	private Department getDepartment(@PathVariable("id") int id) {
		log.info("getDepartment controller");
		return service.getDepartmentById(id);
	}

}
