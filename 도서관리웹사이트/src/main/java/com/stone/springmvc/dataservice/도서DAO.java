package com.stone.springmvc.dataservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.stone.springmvc.common.Book;

//DAO(data access object) == 지속성처리
@Repository
public class 도서DAO {
	public void 저장하다(Book 새도서) {
		// jdbc
		Connection con = null;
		PreparedStatement 명령자 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", // DB
					"root", "1234"); // USER_NAME과 PASSWORD
			// 연결 후 DB 조작 코드 입력 
		명령자=con.prepareStatement("insert into book(bookname,author,contents,price) values(?,?,?,?)");
			
		명령자.setString(1, 새도서.getBookname());
		명령자.setString(2, 새도서.getAuthor());
		명령자.setString(3, 새도서.getContents());
		명령자.setInt(4, 새도서.getPrice());
		
		명령자.executeUpdate();
		con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public List<Book> 모두수집하다() {
		List<Book> 도서물들 = new ArrayList<Book>();
		Connection con = null;
		PreparedStatement 명령자 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", // DB
					"root", "1234"); // USER_NAME과 PASSWORD
		
		명령자=con.prepareStatement("select * from book order by bookid desc");
		//ResultSet은 표 형태로 옴
		ResultSet 도서물표 = 명령자.executeQuery();
		while(도서물표.next()) {
			int 번호 = 도서물표.getInt("bookid");
			String 제목 = 도서물표.getString("bookname");
			String 저자 = 도서물표.getString("author");
			String 책소개 = 도서물표.getString("contents");
			int 가격 = 도서물표.getInt("price");
			
			Book 도서물 = new Book();
			도서물.setBookid(번호);
			도서물.setBookname(제목);
			도서물.setAuthor(저자);
			도서물.setContents(책소개);
			도서물.setPrice(가격);
			
			도서물들.add(도서물);
		}
		con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 도서물들;
	}
	
	public Book 찾는다By번호(int 번호) {
		Book 찾은도서물 = null;
		Connection con = null;
		PreparedStatement 명령자 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", // DB
					"root", "1234"); // USER_NAME과 PASSWORD
			명령자=con.prepareStatement("select * from book where bookid=?");
			명령자.setInt(1, 번호);
			//ResultSet은 표 형태로 옴
			ResultSet 도서물표 = 명령자.executeQuery();
			if(도서물표.next()) {
//불필요			int 게시물번호 = 게시물표.getInt("no");
				String 제목 = 도서물표.getString("bookname");
				String 책소개 = 도서물표.getString("contents");
				String 저자 = 도서물표.getString("author");
				int 가격 = 도서물표.getInt("price");
				
				찾은도서물 = new Book();
				
				찾은도서물.setBookid(번호);
				찾은도서물.setBookname(제목);
				찾은도서물.setContents(책소개);
				찾은도서물.setAuthor(저자);
				찾은도서물.setPrice(가격);
			}
			con.close();
	}catch (Exception ex) {
		ex.printStackTrace();
	}
		return 찾은도서물;
}
	
	
	
	public void 삭제하다(int 삭제번호) {
		Connection con = null;
		PreparedStatement 명령자 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", // DB
					"root", "1234"); // USER_NAME과 PASSWORD
		
		명령자=con.prepareStatement("delete from book where bookid =?");
		
		
		명령자.setInt(1, 삭제번호);
		명령자.executeUpdate();
		con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}