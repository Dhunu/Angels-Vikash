package com.angel.dao;

import com.angel.exceptions.BDOExceptions;
import com.angel.model.BDO;

public interface BDODao {
	
	public String insertBDO (BDO bdo) throws BDOExceptions;

}
