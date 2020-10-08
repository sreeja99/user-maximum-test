package com.usermaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserMaximumTest {
	UserMaximum obj;
	@Test
	void CheckMaxIntegerAtFirstPosition() {
		UserMaximum<Integer> obj=new UserMaximum <Integer>();
		obj.findMaximum(9,8,7);
		Assert.assertEquals(9,(int)obj.toPrint());
	}
	@Test
	void CheckMaxIntegerAtSecondPosition() {
		UserMaximum<Integer> obj=new UserMaximum <Integer>();
		obj.findMaximum(8,9,7);
		Assert.assertEquals(9,(int)obj.toPrint());
	}
	@Test
	void CheckMaxIntegerAtThirdPosition() {
		UserMaximum<Integer> obj=new UserMaximum <Integer>();
		obj.findMaximum(5,8,9);
		Assert.assertEquals(9,(int)obj.toPrint());
	}
	@Test
	void checkForMoreThanThreeEntries() {
		UserMaximum<Integer> obj=new UserMaximum <Integer>();
		obj.findMaximum(5,8,9,4,5);
		Assert.assertEquals(9,(int)obj.toPrint());
	}
	@Test
	void CheckMaxFloatAtFirstPosition() {
		UserMaximum<Float> obj=new UserMaximum <Float>();
		obj.findMaximum(9.4f,8.5f,7.6f);
		Assert.assertEquals(9.4f,(float)obj.toPrint());
	}
	@Test
	void CheckMaxFloatAtSecondPosition() {
		UserMaximum<Float> obj=new UserMaximum <Float>();
		obj.findMaximum(8.4f,9.5f,7.6f);
		Assert.assertEquals(9.5f,(float)obj.toPrint());
	}
	@Test
	void CheckMaxFloatAtThirdPosition() {
		UserMaximum<Float> obj=new UserMaximum <Float>();
		obj.findMaximum(2.4f,8.5f,9.4f);
		Assert.assertEquals(9.4f,(float)obj.toPrint());
	}
	@Test
	void CheckFloatForMoreThanThreeValues() {
		UserMaximum<Float> obj=new UserMaximum <Float>();
		obj.findMaximum(9.4f,8.5f,7.6f,6.3f,7.8f);
		Assert.assertEquals(9.4f,(float)obj.toPrint());
	}
	@Test
	public void CheckMaxStringAtFirstPosition1() {
		UserMaximum<String> obj=new UserMaximum <String>();
		obj.findMaximum("Peach","Apple","Banana");
		Assert.assertEquals("Peach",obj.toPrint());
	}

	@Test
	public void CheckMaxStringAtSecondPosition() {
		UserMaximum<String> obj=new UserMaximum <String>();
		obj.findMaximum("Apple","Peach","Banana");
		Assert.assertEquals("Peach",obj.toPrint());
	}

	@Test
	public void CheckMaxStringAtThirdPosition() {
		UserMaximum<String> obj=new UserMaximum <String>();
		obj.findMaximum("Banana","Apple","Peach");
		Assert.assertEquals("Peach",obj.toPrint());
	}
	@Test
	public void CheckForMoreThanThreeValuesStrings() {
		UserMaximum<String> obj=new UserMaximum <String>();
		obj.findMaximum("Banana","Apple","Peach","Orange","Kiwi");
		Assert.assertEquals("Peach",obj.toPrint());
	}

}
