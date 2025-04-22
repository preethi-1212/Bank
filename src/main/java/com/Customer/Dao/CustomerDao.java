package com.Customer.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Customer.Entity.Customer;
import com.Customer.Repository.CustomerRepository;

@Repository
public class CustomerDao {
@Autowired
CustomerRepository cr;
public String postObj(List<Customer> c)
{
	cr.saveAll(c);
	return "Success";
}
}
