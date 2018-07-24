package org.rajnegi.spring.basics.springhandson.launch;

import org.rajnegi.spring.basics.springhandson.basics.BinarySearchImpl;
import org.rajnegi.spring.basics.springhandson.basics.QuickSortAlgorithm;
import org.rajnegi.spring.basics.springhandson.basics.ReadValueFromProperty;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.classic.Logger;

@Configuration
@ComponentScan("org.rajnegi.spring.basics.springhandson.basics")
public class SpringHandsOnApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringHandsOnApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringHandsOnApplication.class)) {

			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

			LOGGER.info("Binary Search - {}; Algo - {}", binarySearchImpl, binarySearchImpl.getSortAlgo());

			BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);
			LOGGER.info("Binary Search - {}; Algo - {}", binarySearchImpl2, binarySearchImpl2.getSortAlgo());

			int result = binarySearchImpl.binarySearch(new int[] { 1, 2, 3, 4 }, 3);
			LOGGER.info("Found at index {}", result);

			applicationContext.getBean(QuickSortAlgorithm.class);
			
			ReadValueFromProperty readValueFromProperty = applicationContext.getBean(ReadValueFromProperty.class);
			
			System.out.println(readValueFromProperty.getUrl());
		}

	}
}
