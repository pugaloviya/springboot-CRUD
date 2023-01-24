package com.xadmin.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.xadmin.demo.model.Teacher;
import com.xadmin.demo.service.TeacherService;



public class TeacherController {
	@Autowired
	private TeacherService services;
	
	@PostMapping("/addteacher")
	public Teacher addTeacher(@RequestBody Teacher teacher)
	{
		return services.saveTeacher(teacher);
	}
	@PostMapping("/addteachers")
	public List<Teacher> addTeachers(@RequestBody List<Teacher>teachers)
	{
		return services.saveTeachers(teachers);
	}
	@GetMapping("teachers")
	public List<Teacher> FindTeachers()
	{
		return services.getTeachers();
	}
	@GetMapping("teachers/{tid}")
	public Teacher FindTeacherById(@PathVariable long id)
	{
		return services.getTeacherById(id);
	}
	@PutMapping("/update")
    public Teacher updateTeacher(@RequestBody Teacher teacher) {
        return services.updateTeacher(teacher);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable long id) {
        return services.deleteTeacher(id);
    }

}
