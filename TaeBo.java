package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaeBo {

	static String text;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		text = br.readLine();

		int size = text.length();
		int count = 0;
		for (int i = 0; i < size; i++) {
			String text1 = String.valueOf(text.charAt(i));

			if ("@".equals(text1)) {
				count++;
			}

			if (")".equals(text1)) {
				sys(count);
				count = 0;
			}

			if (i == size - 1) {
				sys(count);
			}
		}
	}

	public static void sys(int cnt) {
		System.out.print(cnt + " ");
	}

}
