package in.nit.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer>{


}
