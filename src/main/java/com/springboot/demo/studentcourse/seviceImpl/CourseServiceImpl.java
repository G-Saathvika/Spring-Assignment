package com.springboot.demo.studentcourse.seviceImpl;

import com.springboot.demo.studentcourse.entity.Course;
import com.springboot.demo.studentcourse.entity.Student;
import com.springboot.demo.studentcourse.repository.CourseRepository;
import com.springboot.demo.studentcourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(int id) {
//
//        return courseRepository.findById(id).get();
        Optional<Course> course = courseRepository.findById(id);
        return course.orElse(null);
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteById(int id) {
        courseRepository.deleteById(id);
    }


}