package com.univ.app.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.univ.app.entity.Student;
import jakarta.transaction.Transactional;
@Repository
public interface StudentDAO extends JpaRepository<Student, Long> {
	
 @Query("SELECT s FROM Student s WHERE s.firstName = ?1")
 Iterable<Student> findStudentByFisrtName(String firstName);
 
 @Query("SELECT s FROM Student s WHERE s.course = ?1")
 Iterable<Student> findStudentByCourse(String course);
 
 @Query("SELECT s FROM Student s WHERE s.semester = ?1")
 Iterable<Student> findStudentBySemester(String semester);
 
 @Transactional
 @Modifying
 @Query("UPDATE Student s set s.mailId = ?1 where s.id=?2")
 int updateEmailid(String emailId, long id);
 
 @Transactional
 @Modifying
 @Query("UPDATE Student s set s.mobileNo = ?1 where s.id=?2")
 int updateMobileNo(String mobileNo, long id);
}