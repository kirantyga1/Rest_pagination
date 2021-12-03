package com.nilesh.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nilesh.demo.model.Student;

@Service
public interface IStudentService {
	List<Student> findPaginated(int pageNo,int pageSize);
}
