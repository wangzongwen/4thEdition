package sample.spring.chapter05.bankapp.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import sample.spring.chapter05.bankapp.dao.FixedDepositDaoImpl;

public class MyApplicationContext implements ApplicationContextAware {
	
	private static Logger logger = LogManager.getLogger(MyApplicationContext.class);
	
	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		logger.info("myApplicationContext set ApplicaitonContext : {}", applicationContext);
		this.applicationContext = applicationContext;
	}
	
	public <T> T getBean(Class<T> klass) {
		return applicationContext.getBean(klass);
	}
}
