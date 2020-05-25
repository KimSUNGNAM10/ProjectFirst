package com.yedam.collection.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		List<Board> list = new ArrayList<>();
		BoardService service = (BoardService) new BoardIn();

		while (true) {
			System.out.println("================================");
			System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("================================");
			System.out.println("선택");

			int menu = scn.nextInt(); scn.nextLine();
			switch (menu) {

			case 1: {
				System.out.println("제목 입력 : ");
				String Title = scn.nextLine();
				System.out.println("내용 입력 : ");
				String contents = scn.nextLine();
				System.out.println("작성자 입력 : ");
				String Editor = scn.nextLine();

				Board board = new Board(Title, contents, Editor);
				service.insertBoard(list, board);
				break;
			}
			case 2: {
				System.out.println("수정 게시판 제목 : ");
				String Title = scn.nextLine();
				System.out.println("내용 입력 : ");
				String contents = scn.nextLine();
				System.out.println("작성자 입력 : ");
				String Editor = scn.nextLine();

				Board board = new Board(Title, contents, Editor);
				service.changeBoard(list, board);
				break;
			}
			case 3: {
				System.out.println("삭제 게시판");
				String title = scn.nextLine();
				service.removeBoard(list, title);
				break;
			}
			case 4:
				service.boardList(list);
				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
