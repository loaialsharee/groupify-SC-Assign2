package com.example.demo.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
//// responsible for data access
//public interface StudentRepository extends JpaRepository<Student, Long> {
//
//    @Query("SELECT s FROM Student s WHERE s.email = ?1")
//    Optional<Student> findStudentByEmail(String email);
//
//}

import java.util.List;


@Repository
public interface ITaskDAO extends JpaRepository<Task, Integer> {

    List<Task> findByDescription(String description);
}
