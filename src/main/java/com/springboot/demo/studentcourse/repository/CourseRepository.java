package com.springboot.demo.studentcourse.repository;

import com.springboot.demo.studentcourse.entity.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course,Integer> {

}
