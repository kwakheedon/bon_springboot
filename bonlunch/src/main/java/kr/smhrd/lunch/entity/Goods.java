package kr.smhrd.lunch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="goods")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	
	@Id // GerneratedValue 는 이미 넣어놓은 데이터를 가지고올때
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String price;
	
	@Column(name="is_new", nullable = false)
	private String isNew;
	
	@Column(name="is_best", nullable = false)
	private String isBest;
	
	@Column(nullable = false)
	private String main_thumb;
}
