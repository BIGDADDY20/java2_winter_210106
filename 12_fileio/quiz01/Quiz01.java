package fileio_quiz01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Quiz01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/fileio_quiz01/input.txt");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			BufferedReader br = new BufferedReader(isr);
				
			String readLine = br.readLine();
			Integer count = Integer.parseInt(readLine);
			for (int i = 0; i < count; i++) {
				String text = br.readLine();
				//System.out.println(text);
				
				String[] words = text.split(" ");
				Integer x = Integer.parseInt(words[0]);
				Integer y = Integer.parseInt(words[1]);
				
				if (x >= 0 && y >= 0) {
					System.out.println(1);
				} else if (x < 0 && y >= 0) {
					System.out.println(2);
				} else if (x < 0 && y < 0) {
					System.out.println(3);
				} else {
					System.out.println(4);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
