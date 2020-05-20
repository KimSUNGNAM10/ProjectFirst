package com.yedam.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args) {
		//FileInputStream fis = null;
		String paths = "src/com/yedam/exceptions/AccountExample.java";
		try (FileInputStream fis = new FileInputStream(paths)) {
			//fis = new FileInputStream(paths);
			int readByte;
			while ((readByte = fis.read()) != -1) {
				System.out.write(readByte);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수없습니다");
		} catch (IOException e) {
			System.out.println("파일을 찾을 수없습니다");
		}
//		try {
//			fis.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	} // end of main()
}
