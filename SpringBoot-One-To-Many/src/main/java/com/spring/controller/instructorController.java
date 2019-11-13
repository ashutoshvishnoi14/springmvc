package com.spring.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Instructor;
import com.spring.repository.InstructorRepository;



@RestController
@RequestMapping("/api/v1")
public class instructorController {
	@Autowired
    private InstructorRepository instructorRepository;

    @PutMapping("/instructors/{id}")
    public ResponseEntity < Instructor > updateUser(@PathVariable(value = "id") Long instructorId,@RequestBody Instructor userDetails){
        return ResponseEntity.ok(instructorRepository.save(userDetails));
    }

}