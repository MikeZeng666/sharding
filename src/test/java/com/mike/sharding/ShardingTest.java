package com.mike.sharding;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mike.sharding.service.DemoService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShardingApplication.class})
public class ShardingTest {
	@Autowired
    private DemoService service;

    @Test
    public void testInsert() {
//    	service.insert();
    }
    
    @Test
    public void testQuery() {
    	service.query();
    }
    
    @Test
    public void testQueryJoin() {
    	service.queryJoin();
    }
    
    @Test(expected= Exception.class)
    public void testQueryDistinct() {
//    	Assert.
    	service.queryDistinct();
    }
}
