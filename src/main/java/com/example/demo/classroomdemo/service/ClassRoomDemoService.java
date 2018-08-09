package com.example.demo.classroomdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.classroomdemo.dao.ClassRoomDemoDao;
import com.example.demo.classroomdemo.entity.Student;

@Service
public class ClassRoomDemoService {

	@Autowired
	private ClassRoomDemoDao classRoomDao;
	
	public List<Student> getAllStudents(){
		return classRoomDao.getAllStudents();
	}
	
	public Student createStudent(Student stu) {
		return classRoomDao.createStudent(stu);
	}
	
	public Student updateStudent(Student stu) {
		return classRoomDao.updateStudent(stu);
	}

	public Student getStudentByRoll(Integer rollNum) {
		return classRoomDao.getStudentByRoll(rollNum);
	}
	
}
