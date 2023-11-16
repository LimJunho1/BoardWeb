package com.ezen.biz.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.biz.dto.BoardVO;

@Repository
public class BoardDAO2 {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// �Խñ� �ۼ�
	public void insertBoard(BoardVO vo) {
		System.out.println("===> JDBC�� insertBoard() ó��222");
		
		mybatis.insert("BoardMapper.insertBoard", vo);
	}
	
	// �Խñ� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> JDBC�� updateBoard() ó��222");
		
		mybatis.update("BoardMapper.updateBoard", vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC�� deleteBoard() ó��222");
		
		mybatis.delete("BoardMapper.deleteboard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> JDBC�� getBoard() ó��222");
		
		return mybatis.selectOne("BoardMapper.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {

		
		return mybatis.selectList("BoardMapper.getBoardList_D", vo);
	}

}
















