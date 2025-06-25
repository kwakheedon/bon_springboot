package kr.smhrd.lunch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.entity.Goods;
import kr.smhrd.lunch.entity.GoodsDetail;
import kr.smhrd.lunch.repository.GoodsDetailRepository;
import kr.smhrd.lunch.repository.GoodsRepository;

@Service
public class GoodsService {
	@Autowired
	GoodsRepository goodsRepository;

	@Autowired
	GoodsDetailRepository detailRepository;

	public List<GoodsDTO> AllGetList() {

		List<Goods> result = goodsRepository.findAll(); // DB전체조회
		List<GoodsDTO> list = new ArrayList<GoodsDTO>(); // DTO형태로변환

		for (Goods g : result) {
			GoodsDTO dto = new GoodsDTO();
			dto.setId(g.getId());
			dto.setName(g.getName());
			dto.setPrice(g.getPrice());
			dto.setIsNew(g.getIsNew());
			dto.setIsBest(g.getIsBest());
			dto.setMain_thumb(g.getMain_thumb());
			list.add(dto); // 변환된 DTO를 리스트에 추가
		}
		return list; // 최종 리스트 반환
	}

	public GoodsDTO getGoodsDetail(int id) {
		Goods goods = goodsRepository.findById(id).orElse(null); // GoodsRepository 사용
	    GoodsDetail detail = detailRepository.findById(id).orElse(null); // GoodsDetailRepository 사용

			if(goods==null || detail==null ) {
				return null;
			}
			
			GoodsDTO dto = new GoodsDTO();
			dto.setId(goods.getId());
			dto.setPrice(goods.getPrice());
			dto.setName(goods.getName());
			dto.setIsNew(goods.getIsNew());
			dto.setIsBest(goods.getIsBest());
			dto.setMain_thumb(goods.getMain_thumb());
			dto.setDetail(detail); //객체로 선언된것 
		return dto;
	}

}
