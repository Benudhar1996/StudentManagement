package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.nit.model.Student;
import in.nit.service.IStudentService;

@Controller
public class StudentController {
	@Autowired
	private IStudentService service;
	@RequestMapping("/show")
	public String showPage() {
		return "index";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student,Model model) {
		Integer id=	service.saveStudent(student);
		String msg ="student save with"+id;
		model.addAttribute(msg, HttpStatus.OK);
		return"index";
	}
	@RequestMapping("/all")
	public String getAllStudent(Model model) {
		List<Student> list=	service.getAllStudent();
		model.addAttribute("list", list);
		return "student-list";
	}
}
