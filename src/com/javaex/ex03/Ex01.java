package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String data = br.readLine();

			if (data == null) {
				break;
			}

			String[] info = data.split(",");

			System.out.println("이름: " + info[0]);
			System.out.println("핸드폰: " + info[1]);
			System.out.println("회사: " + info[2]);
			System.out.println("");
		}
		br.close();
	}

}
