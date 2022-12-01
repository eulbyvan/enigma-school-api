package com.enigmacamp.api;

import com.enigmacamp.model.Lecturer;
import com.enigmacamp.model.request.LecturerReq;
import com.enigmacamp.service.ILecturerService;
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
@RequestMapping("/lecturers")
public class LecturerController {
 @Autowired
 private ILecturerService lecturerService;
 @Autowired
 private ModelMapper modelMapper;

 @PostMapping
 public Lecturer addLecturer(@RequestBody LecturerReq req) {
  Lecturer lecturer = modelMapper.map(req, Lecturer.class);
  return lecturerService.add(lecturer);
 }

 @GetMapping
 public List<Lecturer> list() {
  return lecturerService.list();
 }
}
