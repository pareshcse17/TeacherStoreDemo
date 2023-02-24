package com.example.demo.teacher.service;

import com.example.demo.teacher.pojo.Teacher;

public interface TeacherService {
	
	public Teacher saveOrUpdateTeacher(Teacher teacher);
	public String deleteTeacherById(String id);
	

}
 