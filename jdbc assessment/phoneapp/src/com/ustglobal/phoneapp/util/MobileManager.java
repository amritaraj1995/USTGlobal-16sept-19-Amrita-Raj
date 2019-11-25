package com.ustglobal.jdbcassesmentutil;

import com.ustglobal.jdbcassesment.dao.MobileDAO;
import com.ustglobal.jdbcassesment.dao.MobileDAOImpl;

public class MobileManager {

	private MobileManager() {
		
	}
	
	public static MobileDAO getInstance() {
		return new MobileDAOImpl();
	}
	
}
