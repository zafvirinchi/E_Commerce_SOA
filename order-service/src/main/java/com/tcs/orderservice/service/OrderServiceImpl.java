package com.tcs.orderservice.service;

import com.tcs.orderservice.domain.Order;
import com.tcs.orderservice.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    


	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

}
