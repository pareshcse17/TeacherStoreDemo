package com.example.demo.teacher.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.teacher.pojo.Teacher;
import com.example.demo.teacher.repo.TeacherRepository;
import com.example.demo.teacher.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepository teacherRepository;
	
	public TeacherServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Teacher saveOrUpdateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	@Transactional
	public String deleteTeacherById(String id) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(id);
		return "Teacher deleted";
	}
	
	

}
