package com.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Entity.Bank;
import com.Bank.Service.BankService;

@RestController
public class BankController {
@Autowired
BankService bs;
@PostMapping(value="/postAll")
public List<Bank> postAll(@RequestBody List<Bank> b)
{
	return bs.postAll(b);
}
@GetMapping(value="/getBranchByIfsc/{n}")
public String getBranch(@PathVariable String n)
{
return bs.getBranch(n);
}
}
