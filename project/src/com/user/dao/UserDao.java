package com.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.user.constants.Constants;
import com.user.manage.User;
import com.user.util.CP;


public class UserDao {

	public static boolean insertUserIntoDB(User user) {
		
		boolean status= false;
		try {
			Connection con = CP.createConnection();
			
			//Prepared Statement
			PreparedStatement pstmt =con.prepareStatement(Constants.query);
			//Setting values to parameter
			pstmt.setString(1, user.getFname());
			pstmt.setString(2, user.getLname());
			pstmt.setString(3, user.getUid());
			pstmt.setDate(4, user.getDob());
			pstmt.setString(5, user.getMobile());
			pstmt.setString(6, user.getEmail());
			pstmt.setString(7, user.getUpwd());
			pstmt.setTimestamp(8, user.getCreated_tmstmp());
			pstmt.setTimestamp(9, user.getUpdated_tmstmp());
			
			//Execute
			pstmt.executeUpdate();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
}
