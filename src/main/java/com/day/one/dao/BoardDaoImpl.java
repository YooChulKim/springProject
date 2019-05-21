package com.day.one.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.day.one.vo.BoardVO;

@Repository("BoardDao")
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

	@Override
	public List<BoardVO> listAll() {
		return sqlSession.selectList("listAll");
	}
	
	
}
