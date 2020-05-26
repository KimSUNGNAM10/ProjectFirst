package com.yedam.collection.set;

import java.util.List;

public class BoardIn implements BoardService {



	public int findIndex(List<Board> list, String title) {
		for (int idx = 0; idx < list.size(); idx++) {
			Board tempBoard = list.get(idx);
			if (tempBoard.Title.equals(title))
				return idx;
		}
		return -1;
	}

	@Override
	public void insertBoard(List<Board> list, Board board) {
		list.add(board);

	}

	@Override
	public void changeBoard(List<Board> list, Board board) {
		int idx = findIndex(list, board.Title);
		if (idx >= 0)
			list.set(idx, board);
		//for (int i= 0; i<list.size(); i++) {
		//if (list.get(i).getTitle().equals(board.getTitle())) {
		//list.get(i).setContent(board.getContent());
		//}
		//}
	}

	@Override
	public void removeBoard(List<Board> list, String Title) {
		int idx = findIndex(list, Title);
		if (idx >=0)
			list.remove(idx);
		// for (int i=0; i<list.size(); i++) {
		//if (list.get(i).getTitle().equals(title()) {
		//list.remove(i);
		//}
		//}
	}

	@Override
	public void boardList(List<Board> list) {
		for(Board board : list) {
			System.out.println(board.toString());
		}
	}

}
