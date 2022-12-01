package com.enigmacamp.api;

import com.enigmacamp.model.Subject;
import com.enigmacamp.model.request.SubjectReq;
import com.enigmacamp.service.ISubjectService;
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
@RequestMapping("/subjects")
public class SubjectController {
	@Autowired
	private ISubjectService subjectService;
	@Autowired
	private ModelMapper modelMapper;

	@PostMapping
	public Subject addSubject(@RequestBody SubjectReq req) {
		Subject subject = modelMapper.map(req, Subject.class);
		return subjectService.add(subject);
	}

	@GetMapping
	public List<Subject> list() {
		return subjectService.list();
	}
}
