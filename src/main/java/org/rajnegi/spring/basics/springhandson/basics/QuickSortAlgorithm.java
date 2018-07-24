package org.rajnegi.spring.basics.springhandson.basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class QuickSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] arr) {
		System.out.println("QuickSortAlgorithm Called");
		return arr;
	}
	
	@PostConstruct
	public void postConsturction() {
		System.out.println("QuickSortAlgorithm construction complete");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("QuickSortAlgorithm about to destroy");
	}

}
