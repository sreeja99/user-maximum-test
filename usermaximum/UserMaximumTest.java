package com.usermaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserMaximumTest {

	@Test
	void CheckMaxFloatAtFirstPosition() {
		float max =UserMaximum.findMaximum(8.3f,4.4f,7.1f);
		Assert.assertEquals(8.3f,max);
	}
	@Test
	void CheckMaxFloatAtSecondPosition() {
		float max =UserMaximum.findMaximum(8.1f,9.4f,7.3f);
		Assert.assertEquals(9.4f,max);
	}
	@Test
	void CheckMaxFloatAtThirdPosition() {
		float max =UserMaximum.findMaximum(7.3f,4.5f,8.5f);
		Assert.assertEquals(8.5f,max);
	}

}
