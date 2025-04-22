package com.Customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Customer.Entity.Customer;

import com.Customer.Service.CustomerService;

@RestController
@RequestMapping(value="/rest/bankk")
public class CustomerController {
@Autowired
CustomerService cs;
@Autowired
RestTemplate rt;
@PostMapping (value="/postAllBranch")
public String postObj(@RequestBody List<Customer> c)
{
	String url1="http://localhost:8092/getBranchByIfsc/";
	c.forEach(x->{
		String a=x.getIfscCode();
		ResponseEntity<String> re2=rt.exchange(url1+a, HttpMethod.GET,null,String.class);
		String det=re2.getBody();
		x.setBranch(det);
	});
	
	return cs.postObj(c);
}
}
