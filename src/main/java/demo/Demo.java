package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {

	private static final Logger log = LoggerFactory.getLogger(Demo.class);

	public static void main(String[] args) throws Exception {

		log.info("Hello world");

		while (true) {
			log.info("Something happened at {}", System.currentTimeMillis());
			Thread.sleep(1000);
		}
	}
}
