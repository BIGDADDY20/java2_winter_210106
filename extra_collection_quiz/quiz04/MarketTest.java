package Collection_quiz;

public class MarketTest {

	public static void main(String[] args) {
		Goods goods1 = new Goods("신발", 15000, "판매충");
		Goods goods2 = new Goods("가방", 200000, "예약중");
		Goods goods3 = new Goods("가방", 200000, "예약중");
		Market market = new Market();
		market.insert(goods1);
		market.insert(goods2);
		market.insert(goods3);
		market.read();
		market.updatePrice("가방", 300);
		market.read();
		market.updateState("가방", "판매완료");
		market.read();
		market.delete("가방");
		market.read();
	}
}
