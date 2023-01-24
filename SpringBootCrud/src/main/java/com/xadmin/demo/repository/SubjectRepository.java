package com.xadmin.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xadmin.demo.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject,Long>
{
	

}
