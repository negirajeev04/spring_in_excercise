package org.rajnegi.spring.basics.springhandson.basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rajnegi.spring.basics.springhandson.launch.SpringHandsOnApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//Load the context using JAVA Configuration
//Use locations to specify the XML configuration path if you want to load using XML
@ContextConfiguration(classes=SpringHandsOnApplication.class)
@RunWith(SpringRunner.class)
public class BinarySearchTest {

	//Get the binary search bean from the context
	@Autowired
	private BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicSearch() {
		assertEquals(3, binarySearch.binarySearch(new int[] {3,4,5,6,7}, 3));
	}

}
