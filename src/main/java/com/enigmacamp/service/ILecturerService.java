package com.enigmacamp.service;

import com.enigmacamp.model.Lecturer;
import com.enigmacamp.model.Student;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

public interface ILecturerService {
	Lecturer add(Lecturer lecturer);
	List<Lecturer> list();
}
