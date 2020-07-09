package com.mike.sharding.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mike.sharding.entity.Order;
import com.mike.sharding.entity.OrderVo;
import com.mike.sharding.mapper.OrderMapper;

@Service
public class DemoService {
	private static final Logger logger = LoggerFactory.getLogger(DemoService.class);
	@Resource
	private OrderMapper orderRepository;
 
	public void insert() {
		for (int i = 0; i < 10; i++) {
			Order order = new Order();
			order.setOrderId(i+1);
			order.setUserId(i+2);
			order.setStatus("Tinko" + i);
			orderRepository.insert(order);
		}
		System.out.println("Insert Success");
	}
	
	public void query() {
		List<Order> list = orderRepository.query();
		logger.info("query order all data.");
		for(Order or : list) {
			System.out.println(or.toString());
		}
	}

	public void queryJoin() {
		List<OrderVo> list = orderRepository.queryJoin();
		logger.info("query order left join user.");
		for(OrderVo or : list) {
			System.out.println(or.toString());
		}
	}
	
	public void queryDistinct() {
		List<Integer> list = orderRepository.queryDistinct();
		logger.info("query order distinct user.");
		for(Integer or : list) {
			System.out.println(or.toString());
		}
	}
}
