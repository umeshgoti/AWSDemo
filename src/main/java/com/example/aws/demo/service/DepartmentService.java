package com.example.aws.demo.service;

import com.example.aws.demo.dto.DepartmentRequestDTO;
import com.example.aws.demo.model.Department;
import com.example.aws.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    public Department create(DepartmentRequestDTO departmentRequestDTO) {

        Department department = new Department();
        department.setName(departmentRequestDTO.getName());

        return departmentRepository.save(department);
    }

    public void deleteById(Long id) {
        departmentRepository.deleteById(id);
    }
}
