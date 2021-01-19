package constructor_quiz03;

public class Product {
	// 필드
	private String name;
	private int price;
	private String expiration; // 2021-03-21
	
	public Product(String name, int price, String expiration) {
		this.name = name;
		this.price = price;
		this.expiration = expiration;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getExpiration() {
		return expiration;
	}
	
	// 제품 n개의 가격
	public int getProductPriceByCount(int count) {
		return this.price * count;
	}
	
	// 판매 가능 여부
	public String availableSale() {
		// "2021-03-21"    오늘 날짜 <= 유통기한  : 판매 가능 상품,    오늘 날짜 > 유통기한 : 판매 불가 상품
		String[] expirationDate = this.expiration.split("-");
		int year = Integer.parseInt(expirationDate[0]);
		int month = Integer.parseInt(expirationDate[1]); 
		int day = Integer.parseInt(expirationDate[2]); 
		
//		if (year > 2021) {
//			return "판매 가능 상품";
//		} else if (year == 2021) {   // 같은 년도 
//			if (month > 1) { // 월이 높으면
//				return "판매 가능 상품";
//			} else if (month == 1) {  // 같은 월이면
//				if (day > 19) { // 일이 높으면
//					return "판매 가능 상품";
//				}
//			}
//		}
		
		// 다른 방법
		// compareTo
		if (this.expiration.compareTo("2021-01-19") > 0) {
			// 기준 문자열이 더 크면 1
			// 같으면 0
			// 기준 문자열이 작으면 -1
			return "판매 가능 상품";
		}
		
		return "판매 불가 상품";
	}
	
}
