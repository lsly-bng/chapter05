package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB_copy.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		List<Person> pList = new ArrayList<Person>();

		Person p01 = new Person("Lsly", "010-1234-5678", "02-1234-5678");
		pList.add(p01);

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

		for (Person p : pList) {
			String output = p.getName() + "," + p.getHp() + "," + p.getCompany();
			System.out.println(output);

			bw.write(output);
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}
