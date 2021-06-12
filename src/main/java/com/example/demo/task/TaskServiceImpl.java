package com.example.demo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//public class StudentService {
//
//    private final StudentRepository studentRepository;
//
//    @Autowired
//    public StudentService(StudentRepository studentRepository){
//        this.studentRepository = studentRepository;
//    }
//
//    public List<Student> getStudents(){
//        return studentRepository.findAll();
//    }
//
//    public void addNewStudent(Student student) {
//        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
//
//        if(studentOptional.isPresent()){
//            throw new IllegalStateException("email taken");
//        }
//
//        studentRepository.save(student);
//    }
//
//    public void deleteStudent(Long studentId) {
//        boolean exists = studentRepository.existsById(studentId);
//        if (!exists) {
//            throw new IllegalStateException("student with id " + studentId + " does not exist");
//        }
//
//        studentRepository.deleteById(studentId);
//    }
//
//    @Transactional
//    public void updateStudent(Long studentId, String name, String email) {
//        Student student = studentRepository.findById(studentId)
//                .orElseThrow(() -> new IllegalStateException(
//                        "student with id " + studentId + " does not exist"
//                ));
//        if (name != null && name.length()> 0 && !Objects.equals(student.getName(), name)){
//            student.setName(name);
//        }
//
//        if (name != null && name.length()> 0 && !Objects.equals(student.getEmail(), email)){
//            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
//            if(studentOptional.isPresent()){
//                throw new IllegalStateException("email taken");
//            }
//            student.setEmail(email);
//        }
//
//    }
//}


import java.util.ArrayList;
import java.util.Arrays;

@Service
public class TaskServiceImpl implements ITaskService {


    @Autowired
    private ITaskDAO daoRef;

    @Override
    public List<Task> getAllTasks() {
        // TODO Auto-generated method stub
        //return empList;
        return daoRef.findAll();
    }

    @Override
    public Task getTaskById(int taskId) {
        return daoRef.getOne(taskId);
    }

    @Override
    public void addTask(Task task) {
        // TODO Auto-generated method stub
        daoRef.save(task);
    }

    @Override
    public void updateTask(Task task, int taskId) {

        daoRef.save(task);
    }

    @Override
    public void deleteTask(int taskId) {
        // TODO Auto-generated method stub

        daoRef.deleteById(taskId);
    }

    @Override
    public List<Task> getTaskByDesc(String description) {
        // TODO Auto-generated method stub
        return daoRef.findByDescription(description);
    }




}

