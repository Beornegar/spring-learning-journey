package com.dkraus.modulith.orders;

import com.dkraus.modulith.orders.internal.InternalOrdersService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	private Logger logger = LoggerFactory.getLogger(getClass());

	private final InternalOrdersService internalorderService;

	OrderService(InternalOrdersService internalorderService) {
		this.internalorderService = internalorderService;

		logger.info("----------------------------");
		logger.info("----------------------------");
		logger.info("------ Order Service -------");
		logger.info("----------------------------");
		logger.info("----------------------------");
	}

	public List<OrderDTO> callInternalOrdersService() {
		return internalorderService.orders();
	}

}
