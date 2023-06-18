package com.dkraus.modulith.customers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dkraus.modulith.customers.internal.InternalCustomerService;

@Service
public class CustomerService {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private final InternalCustomerService internalCustomerService;
	
	CustomerService(InternalCustomerService internalCustomerService) {
		this.internalCustomerService = internalCustomerService;
		
		logger.info("----------------------------");
		logger.info("----------------------------");
		logger.info("------ Customer Service ----");
		logger.info("----------------------------");
		logger.info("----------------------------");
	}
	
	public List<CustomerDTO> callInternalCustomersService() {
		return internalCustomerService.customers();
	}
}
