package com.enigmacamp.service.implementation;

import com.enigmacamp.model.Lecturer;
import com.enigmacamp.repo.ILecturerRepo;
import com.enigmacamp.service.ILecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

@Service
public class LecturerService implements ILecturerService {
 @Autowired
 ILecturerRepo lecturerRepo;

 @Override
 public Lecturer add(Lecturer lecturer) {
  return lecturerRepo.save(lecturer);
 }

 @Override
 public List<Lecturer> list() {
  return lecturerRepo.findAll();
 }
}