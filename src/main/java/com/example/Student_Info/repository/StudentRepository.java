package com.example.Student_Info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student_Info.domain.Student;

@Repository
public interface  StudentRepository extends JpaRepository<Student, Long> {
	 
	}
