package com.example.backend.entity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student,Integer>
{
//    public Student findByEmail();

}
