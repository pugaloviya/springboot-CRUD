package com.xadmin.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.xadmin.demo.model.Subject;
import com.xadmin.demo.service.SubjectService;

public class SubjectController {
	
	@Autowired
	private SubjectService service;
	
	@PostMapping("/add")
	public Subject addSubject(@RequestBody Subject subject)
	{
		return service.saveSubject(subject);
	}
	@PostMapping("/addsubjects")
	public List<Subject> addSubjects(@RequestBody List<Subject>subjects)
	{
		return service.saveSubjects(subjects);
	}
	@GetMapping("/subjects")
	public List<Subject> FindSubjects()
	{
		return service.getSubjects();
	}
	@GetMapping("/subjects/{id}")
	public Subject FindSubjectById(@PathVariable long id)
	{
		return service.getSubjectById(id);
	}
	@PutMapping("/update")
    public Subject updateSubject(@RequestBody Subject subject) {
        return service.updateSubject(subject);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSubject(@PathVariable int id) {
        return service.deleteSubject(id);
    }
	

}
