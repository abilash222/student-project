package com.pack.junitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.elizabetht.service.StudentServiceImpl;

public class SampleTest {
	@Test
	public void testMethod() throws Exception {
		StudentServiceImpl studentServImpl = new StudentServiceImpl();
		// studentServImpl.getValue(1, 2);
		assertEquals(4, studentServImpl.getValue(2, 2));
	}
	@Test
	public void testMethod1() throws Exception {
		StudentServiceImpl studentServImpl = new StudentServiceImpl();
		// studentServImpl.getValue(1, 2);
		assertEquals(4, studentServImpl.getValue1(2, 2));
	}
	@Test
	public void testMethod2() throws Exception {
		StudentServiceImpl studentServImpl = new StudentServiceImpl();
		// studentServImpl.getValue(1, 2);
		assertEquals(4, studentServImpl.getValue2(2, 2));
	}
	@Test
	public void testMethod3() throws Exception {
		StudentServiceImpl studentServImpl = new StudentServiceImpl();
		// studentServImpl.getValue(1, 2);
		assertEquals(4, studentServImpl.getValue3(2, 2));
	}
	
}
