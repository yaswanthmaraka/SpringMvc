package com.spring.hellocontroller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentInfoRestApiController {
	
	
	@RequestMapping(value="/students", method=RequestMethod.GET ,produces=MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Student>getStudentsList(){
		Student student1=new Student();
		student1.setStudentName("yashwanth");
		
		Student student2=new Student();
		student2.setStudentName("Rohit");
		
		Student student3=new Student();
		student3.setStudentName("Shashi");
		
		ArrayList<Student>StudentsList=new ArrayList<Student>();
		StudentsList.add(student1);
		StudentsList.add(student2);
		StudentsList.add(student3);
		
		return StudentsList;
		
	}
    
	@RequestMapping(value="/students/{name}",method=RequestMethod.GET)
	public Student getstudent(@PathVariable("name") String studentName ) {
		Student student=new Student();
		student.setStudentName(studentName);
		//student.setstudentCourse(studentCourse);
		return student;
		
	}
	

}
