package com.usermaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserMaximumTest {
	UserMaximum obj;
	@Test
	void CheckMaxIntegerAtFirstPosition() {
		UserMaximum obj=new UserMaximum <Integer>(9,8,7);
		Assert.assertEquals(9,obj.toPrint());
	}
	@Test
	void CheckMaxIntegerAtSecondPosition() {
		UserMaximum obj=new UserMaximum <Integer>(8,9,7);
		Assert.assertEquals(9,obj.toPrint());
	}
	@Test
	void CheckMaxIntegerAtThirdPosition() {
		UserMaximum obj=new UserMaximum <Integer>(7,8,9);
		Assert.assertEquals(9,obj.toPrint());
	}
	@Test
	void CheckMaxFloatAtFirstPosition() {
		UserMaximum obj=new UserMaximum <Float>(9.3f,8.3f,7.3f);
		Assert.assertEquals(9.3f,obj.toPrint());
	}
	@Test
	void CheckMaxFloatAtSecondPosition() {
		UserMaximum obj=new UserMaximum <Float>(8.1f,9.4f,7.3f);
		Assert.assertEquals(9.4f,obj.toPrint());
	}
	@Test
	void CheckMaxFloatAtThirdPosition() {
		UserMaximum obj=new UserMaximum <Float>(7.3f,4.5f,8.5f);
		Assert.assertEquals(8.5f,obj.toPrint());
	}
	@Test
	public void CheckMaxStringAtFirstPosition1() {
		UserMaximum obj=new UserMaximum <String>("Peach", "Apple", "Banana");
		assertEquals("Peach", obj.toPrint());
	}

	@Test
	public void CheckMaxStringAtSecondPosition() {
		UserMaximum obj=new UserMaximum <String>("Apple", "Peach", "Banana");
		assertEquals("Peach", obj.toPrint());
	}

	@Test
	public void CheckMaxStringAtThirdPosition() {
		UserMaximum obj=new UserMaximum <String>("Apple", "Banana", "Peach");
		assertEquals("Peach", obj.toPrint());
	}

}
