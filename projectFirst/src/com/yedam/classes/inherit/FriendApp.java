package com.yedam.classes.inherit;

import java.util.Scanner;

import com.yedam.classes.Account;

public class FriendApp {

	private Scanner scn = new Scanner(System.in); // private
	private Friend[] accfriend = new Friend[100]; // Friend 상속받은것들을 담을수 배열 ,[저장공간]

	private void createFriend() {
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("번호를 입력하세요.");
		String num = scn.nextLine();
		Friend f = new Friend(name, num);
		for (int i = 0; i < accfriend.length; i++) {
			if (accfriend[i] == null) {
				accfriend[i] = f; // accounts[0] = acnt;
				break;
			}
		}
	}

	private void createUN() {
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("번호를 입력하세요.");
		String num = scn.nextLine();
		System.out.println("전공을 입력하세요");
		String maj = scn.nextLine();
		Friend r = new UN(name, num, maj);
		for (int i = 0; i < accfriend.length; i++) {
			if (accfriend[i] == null) {
				accfriend[i] = r; // accounts[0] = acnt;
				break;
			}
		}
	}

	private void createCom() {
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		System.out.println("번호를 입력하세요.");
		String num = scn.nextLine();
		System.out.println("부서을 입력하세요");
		String dep = scn.nextLine();
		Friend e = new Com(name, num, dep);
		for (int i = 0; i < accfriend.length; i++) {
			if (accfriend[i] == null) {
				accfriend[i] = e; // accounts[0] = acnt;
				break;
			}
		}

	}

	private void selCreateFriend() {
		System.out.println("생성할 친구를 선택하세요. 1.친구 2.대학 3.회사");
		int menu = scn.nextInt();
		scn.nextLine();
		if (menu == 1) {
			createFriend();
		} else if (menu == 2) {
			createUN();
		} else if (menu == 3) {
			createCom();
		}
	}

	public void FriendList() {
		System.out.println("친구목록 선택.");
		// 전체 배열중에 값이 있는 경우에만 출력(null 제외)
		for (Friend acc : accfriend) {
			if (acc != null) {
				acc.showInfo();
			}
		}

	}

	private Friend inquiry() {
		System.out.println("조회");
		System.out.println("이름입력하세요");
		String name = scn.nextLine();
		for (Friend acc : accfriend) {
			if (acc != null && acc.getname().equals(name)) {
				String result = acc.getname();
				acc.showInfo();
			}
		}

		return null;
	}

	public void execute() {
		while (true) {
			System.out.println("====================================");
			System.out.println("1.주소추가 2.주소목록 3.조회 4.종료");
			System.out.println("====================================");
			System.out.println("선택");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				selCreateFriend();
			} else if (menu == 2) {
				FriendList();
			} else if (menu == 3) {
				inquiry();
			} else if (menu == 4) {
				break;
			}
		}
	}
}
