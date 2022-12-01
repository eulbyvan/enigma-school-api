package com.enigmacamp.api;

import com.enigmacamp.model.Student;
import com.enigmacamp.model.request.StudentReq;
import com.enigmacamp.service.IStudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	@Autowired
	private ModelMapper modelMapper;

	@PostMapping
	public Student addStudent(@RequestBody StudentReq req) {
		Student student = modelMapper.map(req, Student.class);
		return studentService.add(student);
	}

	@GetMapping
	public List<Student> list() {
		return studentService.list();
	}
}
