package com.yedam.collection.set;

import java.util.List;

public interface BoardService {
	
	void insertBoard(List<Board> list, Board board); //입력
	void changeBoard(List<Board> list, Board board); //수정
	void removeBoard(List<Board> list, String Title); // 삭제
	void boardList (List<Board> list);
}
