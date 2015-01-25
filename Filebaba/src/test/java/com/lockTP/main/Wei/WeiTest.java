package com.lockTP.main.Wei;

import org.junit.Test;

import junit.framework.TestCase;

public class WeiTest extends TestCase {
	@Test
	public void testAdd(){
		Wei wei = new Wei();
		int c = wei.add(3, 2);
		assertEquals(8,c);
	}

}
