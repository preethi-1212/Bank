package com.Bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Bank.Dao.BankDao;
import com.Bank.Entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bd;
	public List<Bank> postAll( List<Bank> b)
	{
		return bd.postAll(b);
	}
	public String getBranch( String n)
	{
	return bd.getBranch(n);
	}
}
