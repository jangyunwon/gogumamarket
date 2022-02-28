package com.stone.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stone.springmvc.common.Book;
import com.stone.springmvc.dataservice.도서DAO;

@Service // 업무처리(서비스제공)
public class 도서관리 {
	
	
	@Autowired
	도서DAO 도서DAO;
	public void 도서등록을준비하다() {
		//현재 업무 규칙이 없음
	}
	public List<Book> 도서목록을수집하다() {
		//(업무)
		//현재 업무 규칙이 없음
		//(DB)
		return 도서DAO.모두수집하다();
		
	}
	public void 도서를등록하다(Book 새도서) {
		//(업무)
		//현재 업무 규칙이 없음
		//(DB)
		도서DAO.저장하다(새도서);
		
	}
	public Book 도서를조회하다(int 도서번호) {
		//(업무)
		//현재 업무 규칙이 없음
		//(DB)
		return 도서DAO.찾는다By번호(도서번호);
		}
	

	
	public void 도서물을삭제하다(int 삭제번호) {
		//(업무)
		//현재 업무 규칙이 없음
		//(DB)
		
		도서DAO.삭제하다(삭제번호);
		}

}
