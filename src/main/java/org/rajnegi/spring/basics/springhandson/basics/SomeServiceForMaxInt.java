package org.rajnegi.spring.basics.springhandson.basics;

public class SomeServiceForMaxInt {

	private SomeDataService someDataService;
	
	public SomeServiceForMaxInt(SomeDataService someDataService) {
		super();
		this.someDataService = someDataService;
	}

	public int findGreatestOfAll() {
		
		int[] data = someDataService.retrieveAllData();
		int max = Integer.MIN_VALUE;
		
		for(int value : data) {
			if(value > max) {
				max = value;
			}
		}
		
		return max;
	}
	
	
}


