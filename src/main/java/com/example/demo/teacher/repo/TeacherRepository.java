package com.example.demo.teacher.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.teacher.pojo.Teacher;

public interface TeacherRepository extends MongoRepository<Teacher, String> {
	
	

}
