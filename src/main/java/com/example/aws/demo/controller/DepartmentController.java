package com.example.aws.demo.controller;

import com.example.aws.demo.dto.DepartmentRequestDTO;
import com.example.aws.demo.model.Department;
import com.example.aws.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAll() {
        return departmentService.getAll();
    }

    @PostMapping
    public Department create(@RequestBody DepartmentRequestDTO departmentRequestDTO) {
        return departmentService.create(departmentRequestDTO);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        departmentService.deleteById(id);
        return "success";
    }


}
