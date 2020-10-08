package com.usermaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserMaximumTest {

	@Test
	void CheckMaxStringAtFirstPosition() {
		String max =UserMaximum.findMaximum("Peach","Apple","Banana");
		Assert.assertEquals("peach",max);
	}
	@Test
	void CheckMaxStringAtSecondPosition() {
		String max =UserMaximum.findMaximum("Apple", "Peach","Banana");
		Assert.assertEquals("peach",max);
	}
	@Test
	void CheckMaxStringAtThirdPosition() {
		String max =UserMaximum.findMaximum("Apple","Banana", "Peach");
		Assert.assertEquals("peach",max);
	}

}
