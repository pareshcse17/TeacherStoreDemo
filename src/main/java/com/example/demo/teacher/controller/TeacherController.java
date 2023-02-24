package com.example.demo.teacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.teacher.pojo.Teacher;
import com.example.demo.teacher.service.TeacherService;

@CrossOrigin
@Controller
@RequestMapping("/teacherInsert/")
public class TeacherController {

	@Autowired
	TeacherService teacherService;

	public TeacherController() {
		super();
		System.out.println("TeacherController constructor");
	}

	@GetMapping
	@ResponseBody
	@RequestMapping(value = "greet")
	public String greetTeacher() {
		return "Welcome teacher";
	}

	@PostMapping
	@ResponseBody
	@RequestMapping(value = "saveOrUpdateTeacher")
	public Teacher saveOrUpdateTeacher(@RequestBody Teacher teacher) {
		try {
			return teacherService.saveOrUpdateTeacher(teacher);
		} catch (Exception e) {
			System.out.println("Exception occured" + e);
		}
		return null;
	}
	
	@ResponseBody
	@DeleteMapping(value = "delIdentity/{id}")
	public String deleteTeacherById(@PathVariable String id) {
		return teacherService.deleteTeacherById(id);
	}

}
