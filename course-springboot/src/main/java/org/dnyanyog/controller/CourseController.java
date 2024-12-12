package org.dnyanyog.controller;

import java.util.List;

import org.dnyanyog.entity.Course;
import org.dnyanyog.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {

	@Autowired
	private CourseService service;

	@GetMapping("/home")

	public String home() {
		return "Welcome to course application ";

	}

	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.service.addCourses(course);

	}

}
