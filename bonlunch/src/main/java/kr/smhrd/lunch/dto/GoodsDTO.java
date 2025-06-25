package kr.smhrd.lunch.dto;

import kr.smhrd.lunch.entity.GoodsDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDTO {

	private Integer id;
	private String name;
	private String price;
	private String isNew;
	private String isBest;
	private String main_thumb;
	
	
	//리엑트에서 이중객체의 형태로 반환하기를 바라기때문에 
	// GoodsDetail 엔티티 클래스를 만들고 DTO클래스에 선언
	private GoodsDetail detail;
	
}
