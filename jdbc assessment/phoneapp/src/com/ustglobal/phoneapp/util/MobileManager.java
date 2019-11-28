<<<<<<< HEAD
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
=======
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
>>>>>>> 80032c7ba614f434a2688f7e014378d7bdb0a765
