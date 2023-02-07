package com.angel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.angel.exceptions.BDOExceptions;
import com.angel.model.BDO;
import com.angel.utility.DBUtils;

public class BDODaoImpl implements BDODao{

	@Override
	public String insertBDO(BDO bdo) throws BDOExceptions {
		String message = "Not inserted";
		
		try(Connection conn = DBUtils.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement
					("insert into BDO(block_Name, BDO_Name) values(?,?)");
			
			ps.setString(1, BDO.getBlock_Name());
			ps.setString(1, BDO.getBDO_Name());
			
			int x = ps.executeUpdate();
			
			if(x>0) message="Data inserted";
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDOExceptions(e.getMessage());
		}
		
		return message;
	}

}
