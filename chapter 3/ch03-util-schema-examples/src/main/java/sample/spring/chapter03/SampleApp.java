package sample.spring.chapter03;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.chapter03.beans.BankDetails;
import sample.spring.chapter03.beans.DataTypesExample;

public class SampleApp {
	private static Logger logger = LogManager.getLogger(SampleApp.class);

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext.xml");
		BankDetails bankDetails = context.getBean(BankDetails.class);
		logger.info(bankDetails);
		
		DataTypesExample dataTypesExample = context.getBean(DataTypesExample.class);
		logger.info(dataTypesExample);
		
		dataTypesExample.setDateType(new Date());
		
		logger.info("dataTypesExample dateType is : {}", dataTypesExample.getDateType());
		logger.info("bankDetails dateOfInception is : {}", bankDetails.getDateOfInception());
		BankDetails bankDetails2 = context.getBean(BankDetails.class);
		logger.info("bankDetails2 dateOfInception is : {}", bankDetails2.getDateOfInception());
		
		logger.info("Created context successfully");
	}
}
