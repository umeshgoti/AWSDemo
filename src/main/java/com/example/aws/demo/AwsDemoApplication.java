package com.example.aws.demo;

import com.example.aws.demo.model.Department;
import com.example.aws.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AwsDemoApplication implements CommandLineRunner {

	@Autowired
	private DepartmentRepository departmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(AwsDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		departmentRepository.deleteAll();

		List<Department> departments = Arrays.asList(
				new Department("Computer Science"),
				new Department("Agriculture")
		);

		departmentRepository.saveAll(departments);


	}
}
