package com.stone.springmvc.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stone.springmvc.common.Book;
import com.stone.springmvc.service.도서관리;

@Controller
public class 도서관리컨트롤러 {
	
	@Autowired //빈 풀에 있는 객체끼리 자동으로 참조를 해줌 
	도서관리 도서관리;
	
	@RequestMapping("list")
	ModelAndView 게시물목록을출력하다(/*데이터*/) {
		List<Book> 수집된도서물들 = 도서관리.도서목록을수집하다();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("도서물목록창");
		mv.addObject("books" ,수집된도서물들);
		return mv;
	}

	@RequestMapping("add")
	ModelAndView 도서를등록하다(Book book) {
		도서관리.도서를등록하다(book);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("forward:/list");
		return mv;
	}
	
	@RequestMapping("prepare")
	ModelAndView 도서등록을준비하다() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("도서물등록창");
		return mv;
	}
	
	@RequestMapping("detail")
	ModelAndView 상세내용을출력하다(int bookid) {
		Book 찾은도서 = 도서관리.도서를조회하다(bookid);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("도서물상세창");
		mv.addObject("book",찾은도서 );
		return mv;
	}
	
	
	@RequestMapping("delete")
	ModelAndView 도서물을삭제하다(int bookid) {
		도서관리.도서물을삭제하다(bookid);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("forward:/list");
		return mv;
	}
	
	@RequestMapping("main")
	ModelAndView 도서관메인창(Book board) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("메인창");
		return mv;
	}
}
