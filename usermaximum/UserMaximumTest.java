package com.usermaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserMaximumTest {

	@Test
	void CheckMaxIntegerAtFirstPosition() {
		int max =UserMaximum.findMaximum(8,4,7);
		Assert.assertEquals(8,max);
	}
	@Test
	void CheckMaxIntegerAtSecondPosition() {
		int max =UserMaximum.findMaximum(8,9,7);
		Assert.assertEquals(9,max);
	}
	@Test
	void CheckMaxIntegerAtThirdPosition() {
		int max =UserMaximum.findMaximum(7,4,8);
		Assert.assertEquals(8,max);
	}

}
