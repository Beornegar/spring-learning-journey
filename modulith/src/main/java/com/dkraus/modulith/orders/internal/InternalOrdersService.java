package com.dkraus.modulith.orders.internal;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dkraus.modulith.orders.OrderDTO;

@Service
public class InternalOrdersService {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public List<OrderDTO> orders() {
		logger.info("InternalOrdersService::orders");
		
		return Arrays.asList(new OrderDTO(1L, "Shampoo Bottle", 3L, 1L));
	}
	
}
