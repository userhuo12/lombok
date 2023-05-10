package com.huocompany.lombooktest.dto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCotrollor {
	@RequestMapping(value = "/test")
	public MemberDto test(){
		MemberDto dto = new MemberDto();
		
		
		dto.setName("홍길동");
		dto.setId("tiger");
		dto.setPw("1234");
		dto.setAge(27);
		
		
		return dto;
	}
}

