package com.spring.hellocontroller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView formmv=new ModelAndView("AdmissionForm");
		
		formmv.addObject("HeaderMessage","Sathyabama university,india");
		return formmv;
		
	}
	@RequestMapping(value="/SubmitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1,BindingResult result) {
		if(result.hasErrors()) {
			ModelAndView mv=new ModelAndView("AdmissionForm");
			return mv;
		}
		
	                                        
	                                         
		//String studentName=reqPar.get("studentName");
		//String college=reqPar.get("studentCollege");
		ModelAndView successmv=new ModelAndView("AdmissionSuccess");
		successmv.addObject("HeaderMessage","Sathyabama university,india");
		//mv.addObject("Student1",student1);
		return successmv;
		
	}
	

}
