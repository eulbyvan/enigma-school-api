package com.enigmacamp.service.implementation;

import com.enigmacamp.model.Student;
import com.enigmacamp.repo.IStudentRepo;
import com.enigmacamp.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

@Service
public class StudentService implements IStudentService {
	@Autowired
	IStudentRepo studentRepo;

	@Override
	public Student add(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public List<Student> list() {
		return studentRepo.findAll();
	}
}
