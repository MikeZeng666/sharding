package com.mike.sharding.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mike.sharding.entity.Order;
import com.mike.sharding.entity.OrderVo;

@Mapper
public interface OrderMapper {
	
	Long insert(Order order);
	
	List<Order> query();
	
	List<OrderVo> queryJoin();
	
	List<Integer> queryDistinct();
}
