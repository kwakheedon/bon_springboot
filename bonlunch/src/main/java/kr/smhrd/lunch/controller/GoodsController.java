package kr.smhrd.lunch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.service.GoodsService;

// 연결할 리엑트 port주소연결 
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api") //리엑트 설정한 경로 동일설정
public class GoodsController {
	@Autowired
	GoodsService goodsService;

	@GetMapping("/goods_list")
	public List<GoodsDTO> getGoodsList(Model model) {
		List<GoodsDTO> goodsList = goodsService.AllGetList();

        System.out.println("[list 출력 컨트롤러]");
        return goodsList;   
 }		
	
	
	
	@GetMapping("/goods_list/{id}")
	public GoodsDTO getGoodsDEail(@PathVariable("id")int id) {
	 GoodsDTO getGoodsImg=goodsService.getGoodsDetail(id);
		return getGoodsImg;
	}
}