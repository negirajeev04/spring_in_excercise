package org.rajnegi.spring.basics.springhandson.basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
@Primary
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] arr) {
		System.out.println("BubbleSortAlgorithm Called");
		return arr;
	}
	
	@PostConstruct
	public void postConsturction() {
		System.out.println("BubbleSortAlgorithm construction complete");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("BubbleSortAlgorithm about to destroy");
	}

}
