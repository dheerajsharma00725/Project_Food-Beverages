package login;

import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import com.user.constants.Constants;
import com.user.dao.UserDao;
import com.user.manage.User;
import com.user.util.GeneratePwd;
import com.user.util.GenerateUserName;


public class Main {

	public static void main(String[] args) throws Exception {
	
		System.out.println("Welcome to our Portal...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter First Name : ");
		String fname = br.readLine();
		
		System.out.println("Enter Last Name : ");
		String lname = br.readLine();
		
		System.out.println("Enter Mobile : ");
		String mobile = br.readLine();
		
		System.out.println("Enter user Id : ");	
		String uid = br.readLine();
		
		System.out.println("Enter ID Proof : ");
		String idproof = br.readLine();
		
		System.out.println("Enter DOB : " + "in (yyyy-mm-dd) format");
		String dob = br.readLine();
		
		System.out.println("Enter Email : ");
		String email = br.readLine();

		String uname =GenerateUserName.generateUserName(fname,idproof);
//		System.out.println("User Name is : " + uname);
		
		String upwd = GeneratePwd.generatePwd(fname,lname,mobile,dob,idproof);
//		System.out.println("Password is : " + upwd);
		
		Date dateOfBirth = Date.valueOf(dob);
		
		Timestamp createdTimestamp = new Timestamp(System.currentTimeMillis());
		Timestamp updatedTimestamp = new Timestamp(System.currentTimeMillis());
		
		User usr = new User(fname, lname, uid, dateOfBirth, mobile, email, upwd, createdTimestamp, updatedTimestamp);
		
		boolean ans= UserDao.insertUserIntoDB(usr);
		if(ans) {
			System.out.println("User is Added Successfully..");
		}else {
			System.out.println("Something went Wrong..");
		}
//		System.out.println(usr);
		System.out.println("--------------------------------------------------");
		System.out.println("Please Login immediately and change your password.");
//	
	}

}
