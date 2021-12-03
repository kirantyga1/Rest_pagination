package com.nilesh.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nilesh.demo.model.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

}
