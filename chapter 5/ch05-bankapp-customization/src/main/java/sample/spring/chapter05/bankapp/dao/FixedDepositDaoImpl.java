package sample.spring.chapter05.bankapp.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import sample.spring.chapter05.bankapp.domain.FixedDepositDetails;

public class FixedDepositDaoImpl implements FixedDepositDao {
	private static Logger logger = LogManager.getLogger(FixedDepositDaoImpl.class);
	private DatabaseConnection connection;

	public FixedDepositDaoImpl() {
		logger.info("FixedDepositDaoImpl's constructor invoked");
	}

	public void initializeDbConnection() {
		logger.info("FixedDepositDaoImpl's initializeDbConnection method invoked");
		connection = DatabaseConnection.getInstance();
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		logger.info("FixedDepositDaoImpl's createFixedDeposit method invoked");
		// -- save the fixed deposits and then return true
		return true;
	}

	public void releaseDbConnection() {
		System.out.println("FixedDepositDaoImpl's releaseDbConnection method invoked");
		connection.releaseConnection();
	}
}
