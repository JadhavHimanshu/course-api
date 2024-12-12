package org.dnyanyog.service;

import java.util.ArrayList;
import java.util.List;

import org.dnyanyog.dao.CourseDao;
import org.dnyanyog.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao coursedao;

	// List<Course> list ;
	public CourseServiceImpl() {
	}

	@Override
	public Course addCourses(Course course) {
		coursedao.save(course);
		return course;
	}

}
