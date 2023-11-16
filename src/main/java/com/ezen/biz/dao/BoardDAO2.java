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
	
	// 게시글 작성
	public void insertBoard(BoardVO vo) {
		System.out.println("===> JDBC로 insertBoard() 처리222");
		
		mybatis.insert("BoardMapper.insertBoard", vo);
	}
	
	// 게시글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> JDBC로 updateBoard() 처리222");
		
		mybatis.update("BoardMapper.updateBoard", vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC로 deleteBoard() 처리222");
		
		mybatis.delete("BoardMapper.deleteboard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> JDBC로 getBoard() 처리222");
		
		return mybatis.selectOne("BoardMapper.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {

		
		return mybatis.selectList("BoardMapper.getBoardList_D", vo);
	}

}
















