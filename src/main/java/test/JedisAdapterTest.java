package test;

import com.wgs.mailSender.util.JedisAdapter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wanggenshen_sx on 2017/5/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class JedisAdapterTest {

	@Autowired
	JedisAdapter jedisAdapter;

	@Test
	public void test1(){
		jedisAdapter.lpush("111", "111222");
	}



}
