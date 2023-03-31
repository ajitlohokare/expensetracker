package com.expensetracker.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseReporsitory extends JpaRepository<Expense,Long>{

}
