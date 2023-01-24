package com.xadmin.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xadmin.demo.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Long> 
{

}
