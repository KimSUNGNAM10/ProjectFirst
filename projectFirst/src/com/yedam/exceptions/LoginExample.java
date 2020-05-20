package com.yedam.exceptions;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws WrongPasswordException, NotExistIDException {

		if (!id.contentEquals("blue")) {
			throw new NotExistIDException("없는 id");
		}
		if (!password.equals("12345")) {
			throw new WrongPasswordException(" 비밀");
		}
	}
}