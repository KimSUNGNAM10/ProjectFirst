package com.yedam.exceptions;

public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {
		System.out.println("잔고 부족");
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
}
