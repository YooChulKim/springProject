package com.day.one.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day.one.dao.BoardDao;
import com.day.one.vo.BoardVO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao bDao;
	
	@Override
	public List<BoardVO> getAll() {
		// TODO Auto-generated method stub
		return bDao.listAll();
	}
}
