package in.nit.service;

import java.util.List;

import in.nit.model.Student;

public interface IStudentService {
public Integer saveStudent(Student  student);
public List<Student> getAllStudent();
public Student getOneStudent(Integer id);
public void deleteStudent(Integer id);
public void updateStudnet(Student student);
public boolean isStudentExsit(Integer id);
}
