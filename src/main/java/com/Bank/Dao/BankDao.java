package com.Bank.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.Bank.Entity.Bank;
import com.Bank.Repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository br;
	public List<Bank> postAll(List<Bank> b)
	{
		 br.saveAll(b);
		 return b;
	}
	public String getBranch( String n)
	{
	return br.getBranch(n);
	}
}
