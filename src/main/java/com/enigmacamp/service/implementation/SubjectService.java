package com.enigmacamp.service.implementation;

import com.enigmacamp.model.Subject;
import com.enigmacamp.repo.IBaseRepo;
import com.enigmacamp.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

@Service
public class SubjectService implements IBaseService<Subject> {
 @Autowired
 IBaseRepo<Subject> subjectRepo;

 @Override
 public Subject add(Subject subject) {
  return subjectRepo.save(subject);
 }

 @Override
 public List<Subject> list() {
  return subjectRepo.findAll();
 }
}
