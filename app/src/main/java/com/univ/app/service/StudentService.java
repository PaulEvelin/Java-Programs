package com.univ.app.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.univ.app.dao.StudentDAO;
import com.univ.app.entity.Student;
@Service
public class StudentService {
 @Autowired
 StudentDAO dao;
 
 public Student saveStudent(Student student) {
 return dao.save(student);
 }
 
 public Iterable<Student> saveStudent(Iterable<Student> students) {
 return dao.saveAll(students);
 }
 
 
 public Student saveorUpdateStudent(Student student) 
 {
 Optional<Student> fetched = dao.findById(student.getId());
 Student s = fetched.get();
 s.setFirstName(student.getFirstName());
 s.setMiddleName(student.getMiddleName());
 s.setLastName(student.getLastName());
 s.setDob(student.getDob());
 s.setAdmissionDate(student.getAdmissionDate());
 s.setMailId(student.getMailId());
 s.setMobileNo(student.getMobileNo());
 s.setSemester(student.getSemester());
 s.setCourse(student.getCourse());
 s.setSemester(student.getSemester());
 return dao.save(s);
 }
 
 
 public Iterable<Student> getStudents() {
 return dao.findAll();
 }
 
 public Optional<Student> getStudent(long id) {
 return dao.findById(id);
 }
 
 public Iterable<Student> getStudentByFirstName(String firstName) {
 return dao.findStudentByFisrtName(firstName);
 }
 
 public Iterable<Student> getStudentByCourse(String course) {
 return dao.findStudentByCourse(course);
 }
 
 public Iterable<Student> getStudentBySemester(String semester) {
 return dao.findStudentBySemester(semester);
 }
 
 public void deleteById(long id) {
 dao.deleteById(id);
 }
 
 public int UpdateEmailId(String emailId, Long id) {
 return dao.updateEmailid(emailId, id);
 }
 public int updateMobileNo(String mobileNo, Long id) {
 return dao.updateMobileNo(mobileNo, id);
 }
}