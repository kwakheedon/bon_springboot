package kr.smhrd.lunch.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.lunch.entity.User;

@RestController 
public class HelloController {
	
	@GetMapping("/Hello/{id}")
	public User HelloRest(@PathVariable("id")int id) {
		String result ="Hello Spring";
		
		User user1 = new User("이민수", 25, "남");
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(new User("박수현",20,"남"));
		userList.add(new User("김주아",20,"여"));
		userList.add(new User("구사이",20,"남"));
		
		System.out.println(id);
		

		  return userList.get(id); 
	}
	
	//  @RestController 해당컨트롤러는 무조건 데이터만 반환하는 컨트롤러 
	// 데이터를 주로 JSON 객체 형태로 반환
	// data-bind 데이터를 map 혹은 list 형태로 리턴
	// json 객체 형태로 반환하여  화면에 View에 리턴
	// front와 개발이 완전히 분리된다 
	
	
	// 리엑트에서 / goods_deail/4 :id 값이 4인 Json을 서버로 요청하면 
	// @GetMapping("/goods_detail/{id}") get매핑으로 잡고
	// 매개변수를 통해 값을 가지고올수 있다
	// 메소드명(@PathVariable("id") int id)
	
	

}
