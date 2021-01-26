package fileio_quiz02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Quiz02 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/fileio_quiz02/input.txt");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			BufferedReader br = new BufferedReader(isr);
				
			String readLine = br.readLine();
			Integer count = Integer.parseInt(readLine);
			for (int i = 0; i < count; i++) {
				String text = br.readLine();
				//System.out.println(text);
				
				String[] words = text.split(" ");
				double firstNum = Double.parseDouble(words[0]);
				double result = firstNum;
				for (int j = 1; j < words.length; j++) {
					switch (words[j]) {
					case "@":
						result *= 3;
						break;
					case "%":
						result += 5;
						break;
					case "#":
						result -= 7;
						break;
					}
				}
				System.out.println(Math.round(result * 100) / 100.0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
