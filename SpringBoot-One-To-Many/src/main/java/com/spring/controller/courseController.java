package com.spring.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Course;
import com.spring.repository.CourseRepository;
import com.spring.repository.InstructorRepository;

@RestController
public class courseController {

@Autowired
    private CourseRepository courseRepository;

    @Autowired
    private InstructorRepository instructorRepository;


    @PutMapping("/instructors/{instructorId}/courses/{courseId}")
    public Course updateCourse(@PathVariable(value = "instructorId") Long instructorId,@PathVariable(value = "courseId") Long courseId, @RequestBody Course courseRequest)
      {
       

            return courseRepository.save(courseRequest);
  
    }


}
