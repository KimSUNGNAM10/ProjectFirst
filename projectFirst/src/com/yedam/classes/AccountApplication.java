package com.yedam.classes;

import java.util.Scanner;

public class AccountApplication {

	private Scanner scn = new Scanner(System.in); // private
	private Account[] accounts = new Account[100];

	// 생성자
	// 1.계좌생성 2.계좌목록 3.입금 4.출금 5.종료
	private void createAccount() {
		System.out.println("계좌생성 선택.");
		System.out.println("계좌번호를 입력하세요.");
		String ano = scn.nextLine();
		System.out.println("예금주 입력하세요.");
		String owner = scn.nextLine();
		System.out.println("금액을 입력하세요.");
		int balance = scn.nextInt();
		Account acnt = new Account(ano, owner, balance);
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = acnt; // accounts[0] = acnt;
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다.");
	}

	private void accoutList() {
		System.out.println("계좌목록 선택.");
		// 전체 배열중에 값이 있는 경우에만 출력(null 제외)
		for (Account acc : accounts) {
			if (acc != null) {
				System.out.println("계좌번호 : " + acc.getAno() + ", 예금주 : " + acc.getOwner()
				 + "잔액 : " + acc.getBalance());
			}
		}

	}

	private void deposit() {
		System.out.println("예금 선택.");
		System.out.println("계좌번호를 입력하세요.");
		String ano = scn.nextLine();
		System.out.println("예금액 입력하세요.");
		int balance = scn.nextInt();
		// 전체 배열중에 값이 있는 경우 && 입력계좌번호와 동일한 건에 처리
//		for (Account acc : accounts) {
//			if (acc != null && acc.getAno().equals(ano)) { // ??????, equal 문자열 비교
//				int result = acc.getBalance(); // acc != null 없는 값을 가지고 오려다가 error
//				acc.setBalance(balance);
//			}
//		}
		Account acnt = findAccount(ano);
		if (acnt != null) {
			acnt.setBalance(acnt.getBalance() + balance);
			System.out.println("예금 처리가 되었습니다.");
		} else {
			System.out.println("해당 계좌가 없습니다.");
		}

	}

	private void withdraw() {
		System.out.println("출금 선택.");
		System.out.println("계좌번호를 입력하세요.");
		String ano = scn.nextLine();
		System.out.println("출금액 입력하세요.");
		int balance = scn.nextInt();
		// 전체 배열중에 값이 있는 경우 && 입력계좌번호와 동일한 건에 처리
//		for (Account acc : accounts) {
//			if (acc != null && acc.getAno().equals(ano)) {
//				int result = acc.getBalance();
//				acc.setBalance(result - balance);
//			}
//		}
		Account acnt = findAccount(ano);
		if (acnt != null) {
			acnt.setBalance(acnt.getBalance() - balance);
			System.out.println("출금 처리가 되었습니다.");
		} else {
			System.out.println("해당 계좌가 없습니다");
		}
	}

	// 6. 계좌번호를 입력하면 해당 account를 반환해주는 메소드
	private Account findAccount(String ano) {
		for (Account acc : accounts) {
			if (acc != null && acc.getAno().equals(ano)) {
				return acc;
			}
		}

		return null;
	}

	public void execute() {
		while (true) {
			System.out.println("=======================================");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("=======================================");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				accoutList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				break;
			}
		} // end of while()
	}
}// end of class
