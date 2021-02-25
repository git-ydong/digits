package com.digits;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("resource")
public class Digits {

	/**
	 * 入口
	 * @author yangd
	 * @see update_name:yangd update_time:2021-02-25
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input digits from 0 to 99:");
		//输入按键数字0-99
		String number = "";
		while (true) {
			number = input.next();
			if (!number.matches("[0-9]{1,2}")) {
				System.out.println("输入不合法！只能输入0-99的数字,请重新输入：");
			} else {
				break;
			}
		}
		// 打印方法
		printMethod(number);

	}

	// 字母数组
	private static final String[] LETTERS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	// 结果List
	private static List<String> resultList = new ArrayList<String>();

	// 打印方法
	public static String printMethod(String number) {

		// 打印输入参数
		StringBuilder sbInput = new StringBuilder("Input:arr[] ={");
		String[] arrStr = number.split("");
		for (int i = 0; i < arrStr.length; i++) {
			sbInput.append(arrStr[i]);
			if (i < arrStr.length - 1) {
				sbInput.append(",");
			}
		}
		sbInput.append("}");
		System.out.println(sbInput.toString());
		System.out.print("Output:");

		// 打印结果
		StringBuilder sbOut = new StringBuilder();

		if ("".equals(number) || number == null) {
			return sbOut.toString();
		}
		int index = 0;
		// 调用递归查询
		recursionMethod("", arrStr, index);

		for (int i = 0; i < resultList.size(); i++) {
			sbOut.append(resultList.get(i)).append(" ");
		}
		String result = sbOut.toString().trim();
		System.out.println(result);
		return result;
	}

	// 递归查询
	public static void recursionMethod(String combination, String[] number, int index) {
		if (index == number.length) {
			resultList.add(combination);
		} else {
			int k = Integer.valueOf(number[index]);
			String let = LETTERS[k];
			index++;
			for (int i = 0; i < let.length(); i++) {
				String letter = let.substring(i, i + 1);
				recursionMethod(combination + letter, number, index);
			}
			index--;
		}
	}

}
