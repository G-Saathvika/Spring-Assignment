package com.springboot.demo.studentcourse.repository;

import com.springboot.demo.studentcourse.entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student,Integer> {
}
