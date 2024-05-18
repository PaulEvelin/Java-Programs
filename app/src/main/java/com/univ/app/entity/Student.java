package com.univ.app.entity;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "student")
public class Student {
	
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "id")
 private Long id;
 
 @Column(name = "roll_no", nullable = false)
 private long rollNo;
 
 @Column(name = "fname", nullable = false)
 private String firstName;
 
 @Column(name = "mname", nullable = false)
 private String middleName;
 
 @Column(name = "lname", nullable = false)
 private String lastName;
 
 @Column(name = "dob", nullable = false)
 private Date dob;
 
 @Column(name = "admission_date", nullable = false)
 private Date admissionDate;
 
 @Column(name = "mail_id", nullable = false)
 private String mailId;
 
 @Column(name = "mobile_no", nullable = false)
 private String mobileNo;
 
 @Column(name = "semester", nullable = false)
 private String semester;
 
 @Column(name = "course", nullable = false)
 private String course;
 
 @Column(name = "add_date")
 private Timestamp addDate;
 
 public Student() {
 
 }
 
 public Student(Long id, long rollNo, String firstName, String middleName, String lastName, Date dob,
 Date admissionDate, String mailId, String mobileNo, String semester, String course, Timestamp addDate) {
 super();
 this.id = id;
 this.rollNo = rollNo;
 this.firstName = firstName;
 this.middleName = middleName;
 this.lastName = lastName;
 this.dob = dob;
 this.admissionDate = admissionDate;
 this.mailId = mailId;
 this.mobileNo = mobileNo;
 this.semester = semester;
 this.course = course;
 this.addDate = addDate;
 }
 
 @Override
 public int hashCode() {
 return Objects.hash(addDate, admissionDate, course, dob, firstName, id, lastName, mailId, middleName, mobileNo,
 rollNo, semester);
 }
 
 @Override
 public boolean equals(Object obj) {
 if (this == obj)
 return true;
 if (obj == null)
 return false;
 if (getClass() != obj.getClass())
 return false;
 Student other = (Student) obj;
 return Objects.equals(addDate, other.addDate) && Objects.equals(admissionDate, other.admissionDate)
         && Objects.equals(course, other.course) && Objects.equals(dob, other.dob)
         && Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
         && Objects.equals(lastName, other.lastName) && Objects.equals(mailId, other.mailId)
         && Objects.equals(middleName, other.middleName) && Objects.equals(mobileNo, other.mobileNo)
         && rollNo == other.rollNo && Objects.equals(semester, other.semester);
}
 
 @Override
 public String toString() {
 return "Student [id=" + id + ", rollNo=" + rollNo + ", firstName=" + firstName + ", middleName=" + middleName
 + ", lastName=" + lastName + ", dob=" + dob + ", admissionDate=" + admissionDate + ", mailId=" + mailId
 + ", mobileNo=" + mobileNo + ", semester=" + semester + ", course=" + course + ", addDate=" + addDate
 + "]";
 }
 
 public Long getId() {
 return id;
 }
 
 public void setId(Long id) {
 this.id = id;
 }
 
 public long getRollNo() {
 return rollNo;
 }
 
 public void setRollNo(long rollNo) {
 this.rollNo = rollNo;
 }
 
 public String getFirstName() {
 return firstName;
 }
 
 public void setFirstName(String firstName) {
 this.firstName = firstName;
 }
 
 public String getMiddleName() {
 return middleName;
 }
 
 public void setMiddleName(String middleName) {
 this.middleName = middleName;
 }
 
 public String getLastName() {
 return lastName;
 }
 
 public void setLastName(String lastName) {
 this.lastName = lastName;
 }
 
 public Date getDob() {
 return dob;
 }
 
 public void setDob(Date dob) {
 this.dob = dob;
 }
 
 public Date getAdmissionDate() {
 return admissionDate;
 }
 
 public void setAdmissionDate(Date admissionDate) {
 this.admissionDate = admissionDate;
 }
 
 public String getMailId() {
 return mailId;
 }
 
 public void setMailId(String mailId) {
 this.mailId = mailId;
 }
 
 public String getMobileNo() {
 return mobileNo;
 }
 
 public void setMobileNo(String mobileNo) {
 this.mobileNo = mobileNo;
 }
 
 public String getSemester() {
 return semester;
 }
 
 public void setSemester(String semester) {
 this.semester = semester;
 }
 
 public String getCourse() {
 return course;
 }
 
 public void setCourse(String course) {
 this.course = course;
 }
 
 public Timestamp getAddDate() {
 return addDate;
 }
 
 public void setAddDate(Timestamp addDate) {
 this.addDate = addDate;
 }
 
}

