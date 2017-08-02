package com.cwj.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cwj.dao.StudentDao;
import com.cwj.pojo.Student;

@Controller
public class StudentController {
	
	private static Logger log=LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentDao studentService;
	
	@RequestMapping(value="/test")
	public String test(HttpServletRequest request){
		Student student = studentService.queryStuById("2");
		request.setAttribute("stu", student);
		log.info("stu:"+student.toString());
		return "com/test";
	}
}
