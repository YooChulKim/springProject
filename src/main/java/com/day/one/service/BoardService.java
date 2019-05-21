package com.day.one.service;

import java.util.List;

import com.day.one.vo.BoardVO;

public interface BoardService {
	
	//public void register(BoardVO review);
	
	public List<BoardVO> getAll();
	
	//public int modify(BoardVO board);
	
	//public int remove(int progSeq, int userNumber);
}
