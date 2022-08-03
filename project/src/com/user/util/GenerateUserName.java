package com.user.util;

public class GenerateUserName {

	public static String generateUserName(String fname, String idproof) {

		StringBuilder sb = new StringBuilder();
		sb.append(fname);
		sb.append(idproof.toUpperCase().substring(6));
		return sb.toString();
	}

}
