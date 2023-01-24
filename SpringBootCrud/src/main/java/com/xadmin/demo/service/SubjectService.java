package com.xadmin.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.demo.model.Subject;
import com.xadmin.demo.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	private SubjectRepository subjectrepo;

	public Subject saveSubject(Subject subject) {
		return subjectrepo.save(subject);
	}

	public List<Subject> saveSubjects(List<Subject> subjects) {
		return subjectrepo.saveAll(subjects);
	}

	public Subject getSubjectById(long id) {
		return subjectrepo.findById(id).orElse(null);
	}

	public List<Subject> getSubjects() {
		return subjectrepo.findAll();
	}

	public String deleteSubject(long id) {
		subjectrepo.deleteById(id);
		return "product removed";
	}

	public Subject updateSubject(Subject subject) {
		Subject existingSubject = subjectrepo.findById(subject.getId()).orElse(null);
		existingSubject.setId(subject.getId());
		existingSubject.setName(subject.getName());
		return subjectrepo.save(existingSubject);

	}
}
