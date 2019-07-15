package com.cuiyubing.commonn.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
/**
 * 
 * @ClassName: AssertUtilTest 
 * @Description: 在src/test/java中编写测试代码，
 * 测试上面的方法。如果会用Junit框架就用Junit单元测试，
 * 如果还没学就在main方法测试
 * @author:cyb 
 * @date: 2019年7月15日 上午9:00:02
 */
public class AssertUtilTest {
	/**
	 * 
	 * @Title: testIsTrue 
	 * @Description: 测试AssertUtil.isTrue()方法，
	 * 通过断言测一次（2分），
	 * 不能通过断言测一次（2分）。
	 * @return: void
	 */
	@Test
	public void testIsTrue() {
//		AssertUtil.isTrue(2>1, "断言为真");
		AssertUtil.isTrue(1>3, "断言为真");
	}
	/**
	 * 
	 * @Title: testIsFalse 
	 * @Description: 测试AssertUtil.isFalse()方法，
	 * 通过断言测一次（2分），不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testIsFalse() {
//		AssertUtil.isFalse(2>1, "断言为假");
		AssertUtil.isFalse(1>3, "断言为假");
	}
	/**
	 * 
	 * @Title: testNotNull 
	 * @Description: 测试AssertUtil.notNull()方法，通过断言测一次（2分），不能通过断言测一次
	 * @return: void
	 */
	@Test
	public void testNotNull() {
//		AssertUtil.notNull(null, "断言对象不能为空");
		AssertUtil.notNull("你好", "断言对象不能为空");
	}
	/**
	 * 
	 * @Title: testIsNull 
	 * @Description: 测试AssertUtil.isNull()方法，通过断言测一次（2分），不能通过断言测一次
	 * @return: void
	 */
	@Test
	public void testIsNull() {
//		AssertUtil.isNull("你好", "断言对象为空");
		AssertUtil.isNull(null, "断言对象为空");
	}
	/**
	 * 
	 * @Title: testNotEmptyCollectionOfQString 
	 * @Description: 用List对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次
	 * @return: void
	 */
	@Test
	public void testNotEmptyCollectionOfQString() {
		List<Integer> list=new ArrayList<Integer>();
//		AssertUtil.notEmpty(list, "断言集合不为空");
		list.add(1);
		AssertUtil.notEmpty(list, "断言集合不为空");
	}
	/**
	 * 
	 * @Title: testNotEmptyMapOfQQString 
	 * @Description: 用Map对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次
	 * @return: void
	 */
	@Test
	public void testNotEmptyMapOfQQString() {
		Map<String,Object> map=new HashMap<String,Object>();
//		AssertUtil.notEmpty(map, "断言Map集合不为空，对象不能空");
		map.put("姓名", "冰冰");
		AssertUtil.notEmpty(map, "断言Map集合不为空，对象不能空");
	}
	/**
	 * 
	 * @Title: testHasText 
	 * @Description: 用String对象测试AssertUtil.hasText()方法，通过断言测一次（2分），
	 * 不能通过断言测一次
	 * @return: void
	 */
	@Test
	public void testHasText() {
//		AssertUtil.hasText(" ", "断言字符串必须有值");
		AssertUtil.hasText("123", "断言字符串必须有值");
	}
	/**
	 * 
	 * @Title: testGreaterThanZero 
	 * @Description: 测试AssertUtil. greaterThanZero()方法，通过断言测一次（2分），
	 * 不能通过断言测一次
	 * @return: void
	 */
	@Test
	public void testGreaterThanZero() {
		
//		AssertUtil.greaterThanZero(BigDecimal.valueOf(33), "断言值必须大于0");
		AssertUtil.greaterThanZero(BigDecimal.valueOf(-33), "断言值必须大于0");
	}

}
