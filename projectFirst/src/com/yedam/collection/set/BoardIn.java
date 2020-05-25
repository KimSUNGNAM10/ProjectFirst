package com.yedam.collection.set;

import java.util.List;

public class BoardIn implements BoardService {

	private static final String Title = null;

	public int findIndex(List<Board> list, String title) {
		for (int idx = 0; idx < list.size(); idx++) {
			Board tempBoard = list.get(idx);
			if (tempBoard.Title.equals(Title))
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
		int idx = findIndex(list, Title);
		if (idx >= 0)
			list.set(idx, board);

	}

	@Override
	public void removeBoard(List<Board> list, String Title) {
		int idx = findIndex(list, Title);
		if (idx >=0)
			list.remove(idx);
	}

	@Override
	public void boardList(List<Board> list) {
		for(Board board : list) {
			System.out.println(board.toString());
		}
	}

}
