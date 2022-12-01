package com.enigmacamp.service;

import com.enigmacamp.model.Student;
import com.enigmacamp.model.Subject;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

public interface ISubjectService {
	Subject add(Subject subject);
	List<Subject> list();
}
