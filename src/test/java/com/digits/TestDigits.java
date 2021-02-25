package com.digits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * junit测试类
 * @author yangd
 * @date 2021年2月23日
 */
@SuppressWarnings("static-access")
public class TestDigits {

	private Digits digits = new Digits();

	/**
	 * 测试
	 * @author yangd
	 * @see update_name:yangd update_time:2021-02-23
	 */
	@Test
	public void test() {
		/*
		 * 输入：7
		 * 结果：p q r s
		 * 
		 * 输入：56
		 * 结果：jm jn jo km kn ko lm ln lo
		 * 
		 */
		assertEquals("p q r s", digits.printMethod("7"));
	}
}
