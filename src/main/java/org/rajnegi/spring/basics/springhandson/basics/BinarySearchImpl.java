package org.rajnegi.spring.basics.springhandson.basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Named
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	@Inject
	private SortAlgorithm sortAlgo;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgo = sortAlgorithm;
	}

	public SortAlgorithm getSortAlgo() {
		return sortAlgo;
	}

	public void setSortAlgo(SortAlgorithm sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
	
	public int binarySearch(int[] arr, int toBeSearched) {
		//Sorting Algo
		arr = sortAlgo.sort(arr);
		//Returning a dummy value.
		return 3;
	}
	
	@PostConstruct
	public void postConsturction() {
		System.out.println("BinarySearchImpl construction complete");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("BinarySearchImpl about to destroy");
	}

}
