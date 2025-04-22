package com.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.Customer.Dao.CustomerDao;
import com.Customer.Entity.Customer;
@Service
public class CustomerService {
	@Autowired
	CustomerDao cd;
	

	public String postObj( List<Customer> b)
	{
		
		return cd.postObj(b);
	}

}
