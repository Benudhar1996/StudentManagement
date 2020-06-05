package in.nit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.model.Student;
import in.nit.repo.StudentRepositary;
import in.nit.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService{
	@Autowired
	private StudentRepositary repo;
	@Override
	public Integer saveStudent(Student student) {
		Integer id=repo.save(student).getStdId();
		return id;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student>list=repo.findAll();
		return list;
	}

	@Override
	public Student getOneStudent(Integer id) {
		Student std = null;
		Optional<Student>	opt=repo.findById(id);
		if(opt.isPresent()) {
			std = opt.get();
		}
		return std;
	}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void updateStudnet(Student student) {
		repo.save(student);
	}

	@Override
	public boolean isStudentExsit(Integer id) {
		boolean status=	repo.existsById(id);
		return status;
	}

}
