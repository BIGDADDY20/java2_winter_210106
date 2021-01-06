package fileio_ex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		// 파일 읽기
		FileInputStream fis = new FileInputStream("output1.txt"); // 운영체제에 있는 파일 가져오기(byte로 가져옴)
		InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> 문자로 변환, 두 번째 파라미터는 문자 인코딩(한글 깨짐X)
		BufferedReader br = new BufferedReader(isr); // 한 줄씩 읽어 들이기 위함
		while (true) {
			String readLine = br.readLine();
			if (readLine == null) {
				break;
			}

			System.out.println(readLine);
		}
		br.close();
	}

}
