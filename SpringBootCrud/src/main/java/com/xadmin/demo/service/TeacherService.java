package com.xadmin.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.demo.model.Teacher;
import com.xadmin.demo.repository.TeacherRepository;


@Service
public class TeacherService {

	@Autowired
	private TeacherRepository Teacherrepo;

	public Teacher saveTeacher(Teacher teacher) {
		return Teacherrepo.save(teacher);
	}

	public List<Teacher> saveTeachers(List<Teacher> teachers) {
		return Teacherrepo.saveAll(teachers);
	}

	public Teacher getTeacherById(long id) {
		return Teacherrepo.findById(id).orElse(null);
	}

	public List<Teacher> getTeachers() {
		return Teacherrepo.findAll();
	}

	public String deleteTeacher(long id) {
		Teacherrepo.deleteById(id);
		return "Teacher removed";
	}

	public Teacher updateTeacher(Teacher teacher) {
		Teacher existingTeacher = Teacherrepo.findById(teacher.getId()).orElse(null);
		existingTeacher.setId(teacher.getId());
		existingTeacher.setName(teacher.getName());
		return Teacherrepo.save(existingTeacher);

	}
}



