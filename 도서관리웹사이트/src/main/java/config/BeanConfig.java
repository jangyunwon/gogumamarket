package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stone.springmvc.dataservice.도서DAO;
import com.stone.springmvc.presentation.도서관리컨트롤러;
import com.stone.springmvc.service.도서관리;

@Configuration
public class BeanConfig {
	@Bean
	public 도서관리컨트롤러 게시물관리컨트롤러( ) { //@Controller
		return new 도서관리컨트롤러( );
	}
	
	@Bean
	public 도서관리 게시물관리( ) { //@Service 서비스제공
		return new 도서관리( );
	}
	@Bean
	public 도서DAO 게시물DAO( ) { //@Repository 저장소
		return new 도서DAO( );
	}
	
	
}
