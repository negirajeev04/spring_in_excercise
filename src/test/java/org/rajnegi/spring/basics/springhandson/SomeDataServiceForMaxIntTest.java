package org.rajnegi.spring.basics.springhandson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.rajnegi.spring.basics.springhandson.basics.SomeDataService;
import org.rajnegi.spring.basics.springhandson.basics.SomeServiceForMaxInt;

@RunWith(MockitoJUnitRunner.class)
public class SomeDataServiceForMaxIntTest {

	@InjectMocks
	private SomeServiceForMaxInt someService;
	@Mock
	private SomeDataService mock;

	@Test
	public void test1() {
		Mockito.when(mock.retrieveAllData()).thenReturn(new int[] {12,23,32,10});
		assertEquals(32, someService.findGreatestOfAll());
	}
	
	@Test
	public void test2() {
		Mockito.when(mock.retrieveAllData()).thenReturn(new int[] {12});
		assertEquals(12, someService.findGreatestOfAll());
	}

}
