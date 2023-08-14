package com.ust.skillhive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.skillhive.model.Instructor;



@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
