package com.expensetracker.expensetracker.services;
import com.expensetracker.expensetracker.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService{
	
	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findall();{
	return expenseRepository.findall();
	}
}
