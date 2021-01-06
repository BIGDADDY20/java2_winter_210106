package fileio_ex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/fileio_ex/input.txt");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			BufferedReader br = new BufferedReader(isr);
				
			String readLine = br.readLine();
			Integer count = Integer.parseInt(readLine);
			for (int i = 0; i < count; i++) {
				String text = br.readLine();
				//System.out.println(text);
				
				String[] words = text.split(" ");
				if (words[0].equals(words[1])) {
					System.out.println(true);
				} else {
					System.out.println(false);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
