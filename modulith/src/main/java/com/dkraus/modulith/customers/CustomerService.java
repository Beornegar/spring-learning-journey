package com.dkraus.modulith.customers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dkraus.modulith.customers.internal.InternalCustomerService;

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
	
}
