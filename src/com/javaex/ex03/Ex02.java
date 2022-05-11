package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		List<Person> pList = new ArrayList<Person>();

		while (true) {
			String data = br.readLine();

			if (data == null) {
				break;
			}

			String[] info = data.split(",");
			pList.add(new Person(info[0], info[1], info[2]));
		}

		for (Person p : pList) {
			p.showInfo();
		}
		br.close();
	}
}
