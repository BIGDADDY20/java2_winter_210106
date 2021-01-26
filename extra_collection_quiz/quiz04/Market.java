package Collection_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market {
 	private List<Goods> goodsList; 

	public Market() {
		this.goodsList = new ArrayList<>();
	}

	// 상품 추가
	public void insert(Goods goods) {
		/*
		 * Iterator<Goods> iter = this.goodsList.iterator(); while (iter.hasNext()) {
		 * Goods savedGoods = iter.next(); if
		 * (savedGoods.getName().equals(goods.getName())) {
		 * System.out.println("등록된 상품이 존재합니다."); return; }
		 * 
		 * }
		 */
		
		//+ 이렇게 하려면, Goods의 equals를 오버라이드 해야한다.
		if (goodsList.contains(goods)) {
			System.out.println("등록된 상품이 존재합니다.");
			return;
		}
		
		// 판매 상태 유효성 확인
		if (isValidState(goods.getState()) == false) {
			System.out.println("판매상태가 유효하지 않습니다.");
			return;
		}
		
		boolean addResult = this.goodsList.add(goods);
		System.out.println(addResult ? "추가되었습니다." : "실패했습니다.");
	}

	// 상품 출력
	public void read() {
		if (this.goodsList.isEmpty()) {
			System.out.println("비어있습니다.");
			return;
		}

		// 1. 이터레이터로 돌리면서 출력하기
// 		Iterator<Goods> iter = this.goodsList.iterator();
// 		while (iter.hasNext()) {
// 			Goods goods = iter.next();
// 			System.out.println("물품명:" + goods.getName() 
// 			+ ", 가격:" + goods.getPrice() + ", 판매상태:" + goods.getState());
// 		}
		
		// toString 오버라이드
		System.out.println(this.goodsList);
	}

	// 상품 가격 수정
	public void updatePrice(String name, int price) {
		boolean exist = false; // 상품 존재여부
		Iterator<Goods> iter = this.goodsList.iterator();
		while (iter.hasNext()) {
			Goods goods = iter.next();
			if (goods.getName().equals(name)) {
				exist = true;
				goods.setPrice(price);
				break;
			}
		}

		if (exist == false) {
			System.out.println("수정할 상품이 존재하지 않습니다.");
		} else {
			System.out.println("수정 되었습니다.");
		}
		
		
		
		// 꼼수
		int idx = this.goodsList.indexOf(new Goods(name, 0, ""));
		Goods equalGoods = this.goodsList.get(idx);
		equalGoods.setPrice(price);
		//System.out.println(equalGoods);
	}

	public void updateState(String name, String state) {
		boolean exist = false; // 상품 존재여부
		Iterator<Goods> iter = this.goodsList.iterator();
		while (iter.hasNext()) {
			Goods goods = iter.next();
			if (goods.getName().equals(name)) {
				exist = true;
				// 판매 상태 유효성 확인
				if (isValidState(state) == false) {
					System.out.println("판매상태가 유효하지 않습니다.");
					return;
				}
				goods.setState(state);
				break;
			}
		}

		if (exist == false) {
			System.out.println("수정할 상품이 존재하지 않습니다.");
		} else {
			System.out.println("수정 되었습니다.");
		}
	}

	// 상품 삭제
	public void delete(String name) {
		boolean exist = false; // 상품 존재여부
		Iterator<Goods> iter = this.goodsList.iterator();
		while (iter.hasNext()) {
			Goods goods = iter.next();
			if (goods.getName().equals(name)) {
				exist = true;
				iter.remove();
				break;
			}
		}
		
		if (exist == false) {
			System.out.println("삭제할 상품이 존재하지 않습니다.");
		} else {
			System.out.println("삭제 되었습니다.");
		}
	}

	private boolean isValidState(String state) {
		// 판매 상태 유효성 확인
		if ((state.equals("판매중") || state.equals("판매완료") || state.equals("예약중")) == false) {
			return false;
		}
		
		return true;
	}
}
