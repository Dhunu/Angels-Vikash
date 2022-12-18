package com.angel.dao;

import com.angel.exceptions.GPMExceptions;
import com.angel.model.GPM;

public interface GPMDao {
	
	public String insertGPM(GPM gpm) throws GPMExceptions;

}
