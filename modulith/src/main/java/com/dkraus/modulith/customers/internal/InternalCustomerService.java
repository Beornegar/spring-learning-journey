package com.dkraus.modulith.customers.internal;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dkraus.modulith.customers.CustomerDTO;

@Service
public class InternalCustomerService {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public List<CustomerDTO> customers() {
		logger.info("InternalCustomerService::customers");
		
		return Arrays.asList(new CustomerDTO(1L, "Wilfried"), new CustomerDTO(2L, "Berndt"));
	}
	
}
