## 문제) 상속을 이용하여 주어진 클래스들을 간결한 구조로 재작성 하세요.

```
	class SharpPencil { // 샤프펜슬
		private int width; // 펜의 굵기
		private int amount; // 남은 량

		public int getAmount() { 
			return amount; 
		}

		public void setAmount (int amount) {
			this.amount = amount; 
		}

        	public int getWidth() {
            		return width;
        	}

        	public void setWidth(int width) {
            		this.width = width;
        	}
	}

	class Ballpen  { // 볼펜
		private int amount; // 남은 량
		private String color; // 볼펜의 색

		public int getAmount() { 
			return amount; 
		}
		public void setAmount (int amount) { 
			this.amount = amount; 
		}
		public String getColor() { 
			return color; 
		}
		public void setColor(String color) { 
			this.color = color; 
		}
	}

	class FountainPen { // 만년필
		private int amount; // 남은 량
		private String color; // 볼펜의 색
		public int getAmount() { 
			return amount; 
		}
		public void setAmount (int amount) { 
			this.amount = amount; 
		}
		public String getColor() { 
			return color; 
		}
		public void setColor(String color) { 
			this.color = color; 
		}
		public void refill (int n) { 
			setAmount(n); 
		}
	}
```  

[정답 보기: Ballpen.java](Ballpen.java)  
[정답 보기: FountainPen.java](FountainPen.java)  
[정답 보기: SharpPencil.java](SharpPencil.java)  
[정답 보기: Pen.java](Pen.java)  
