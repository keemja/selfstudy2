package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// �Է� ���� �״�� List�� ������ �״ٰ� exit ������ List �� �� ���Ƽ� �¸�� �Լ� ȣ���ϸ鼭 ����Ѵ�.
public class GoodMorningMessage {

	private static String getGoodMorningMessage(String to) {
		String from = null;

		if (("������").equals(to)) {
			from = "������";
		} else if (("���־�").equals(to)) {
			from = "�ں���";
		}
		
		if (from != null) {
			return String.format("%s : %s �¸��!", from, to);
		}

		throw new IllegalArgumentException(String.format("%s�� �λ����� ����� �����ϴ٤�.��", to));
	}

	public static void main(String[] args) {

		String to;
		List<String> list = new ArrayList<String>();

		try {
			while(true) {
				Scanner sc = new Scanner(System.in);
				to = sc.nextLine();
				
				if("exit".equals(to)) {
					for(String result : list) {
						System.out.println(result);
					}
					break;
				}
				
				System.out.println(getGoodMorningMessage(to));
				list.add(getGoodMorningMessage(to).toString());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}