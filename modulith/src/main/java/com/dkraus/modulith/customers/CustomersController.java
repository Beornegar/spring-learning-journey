package com.dkraus.modulith.customers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomersController {

	private final CustomerService customerService;
	
	CustomersController(CustomerService customerService) {
		this.customerService = customerService;}
	
	@GetMapping
	public List<CustomerDTO> callCustomers() {
		return customerService.callInternalCustomersService();
	}
	
}
