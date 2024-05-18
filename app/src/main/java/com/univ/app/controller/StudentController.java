package com.univ.app.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.univ.app.entity.Student;
import com.univ.app.service.StudentService;
@RestController
public class StudentController {
 @Autowired
 StudentService service;
 @PostMapping("/add-student")
 public Student saveStudent(@RequestBody Student student) {
 return service.saveStudent(student);
 }
 @PostMapping("/add-students")
 public Iterable<Student> saveStudent(@RequestBody Iterable<Student> students) {
 return service.saveStudent(students);
 }
 @PutMapping("/update-student")
 public Student updateStudent(@RequestBody Student student) {
 return service.saveorUpdateStudent(student);
 }
 @GetMapping("/students")
 public Iterable<Student> getStudents() {
 return service.getStudents();
 }
 @GetMapping("/student/{id}")
 public Optional<Student> getStudent(@PathVariable("id") long id) {
 return service.getStudent(id);
 }
 @GetMapping("/student-fname/{firstname}")
 public Iterable<Student> getStudentbyFirstName(@PathVariable("firstname") String firstName) {
 return service.getStudentByFirstName(firstName);
 }
 @GetMapping("/student-course/{course}")
 public Iterable<Student> getStudentByCourse(@PathVariable("course") String course) {
 return service.getStudentByCourse(course);
 }
 @GetMapping("/student-semester/{semester}")
 public Iterable<Student> getStudentBySemester(@PathVariable("semester") String semester) {
 return service.getStudentBySemester(semester);
 }
 @GetMapping("/student-update-mail/{id}/{emailId}")
 public int updateStudentMail(@PathVariable("emailId") String emailId, @PathVariable("id") Long id) {
 return service.UpdateEmailId(emailId, id);
 }
 @GetMapping("/student-update-mobile/{id}/{mobileNo}")
 public int updateStudentMobile(@PathVariable("mobileNo") String mobileNo, @PathVariable("id") Long id) {
 return service.updateMobileNo(mobileNo, id);
 }
 @DeleteMapping("/remove-student/{id}")
 public void deleteById(@PathVariable("id") long id) {
 service.deleteById(id);
 }
}