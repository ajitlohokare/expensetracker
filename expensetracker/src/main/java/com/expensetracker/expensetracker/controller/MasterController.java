package com.expensetracker.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MasterController {

	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView("home");
		List<Expense> expense = expenseService.findall();
		mav.addObject("expenses", expenses);
		return mav;
		/*neeraj added*/
		
		
		
		/*ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "List of expenese");
		return mav;*/
	}
}
