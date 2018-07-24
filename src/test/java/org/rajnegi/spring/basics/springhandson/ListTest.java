package org.rajnegi.spring.basics.springhandson;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	public void testSize() {
		
		List list = Mockito.mock(List.class);
		Mockito.when(list.size()).thenReturn(10);
		assertEquals(10, list.size());
	}
	
	@Test
	public void testMultipleReturns() {
		List list = Mockito.mock(List.class);
		Mockito.when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, list.size());
		assertEquals(20, list.size());
	}
	
	@Test
	public void testGet() {
		List listMock = Mockito.mock(List.class);
		Mockito.when(listMock.get(0)).thenReturn("Rajeev Negi");
		assertEquals("Rajeev Negi", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	public void testGet_GenericParameter() {
		List listMock = Mockito.mock(List.class);
		Mockito.when(listMock.get(Mockito.anyInt())).thenReturn("Rajeev Negi");
		assertEquals("Rajeev Negi", listMock.get(0));
		assertEquals("Rajeev Negi", listMock.get(34));
	}

}
