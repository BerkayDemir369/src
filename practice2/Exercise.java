package practice2;

import java.util.ArrayList;
import java.util.Arrays;

import exercise.Q_209ExtractNumber;

public class Exercise {

	public static void main(String[] args) {

		String s1 = "aghjs@dhga2156@gmail.com";
		String[] s6 =s1.split("@");
		

		Q_209ExtractNumber n1 = new Q_209ExtractNumber();
		System.out.println(n1.extractNum(s1));

		System.out.println(s1.substring(s1.indexOf("@") + 1, s1.lastIndexOf("@"))); // dhga
		System.out.println(b1(s1));
		System.out.println(b2(s1));
		System.out.println(b3(n1.extractNum(s1)));
		int i2 = b3(n1.extractNum(s1));
		int i3 = 10;
		int sum = i2 + i3;
		System.out.println(sum);
		int[] i4 ={5,9,3,-6,55,-4,8};
		maxValue(i4);
		
		System.out.println(Arrays.toString(i4));
		
		ArrayList<Integer> lst = new ArrayList<>();
		System.out.println(lst);
		
          for(Integer value: i4) {
			lst.add(value);
		}
		
          System.out.println(lst);
          ArrayList<String> str = new ArrayList<>(Arrays.asList(s6));
          System.out.println(str);

	}

	public static boolean b1(String s2) {
		String s3 = "";
		for (int i = 0; i < s2.length(); i++) {

			if (Character.isDigit(s2.charAt(i))) {
				return true;

			}
		}
		return false;

	}

	public static int b2(String s2) {
		String s3 = "";
		for (int i = 0; i < s2.length(); i++) {

			if (Character.isDigit(s2.charAt(i))) {
				s3 += s2.charAt(i);

			}

		}

		int x = Integer.parseInt(s3);
		return x;

	}

	public static Integer b3(String s2) {
		Integer y = Integer.valueOf(s2);

		return y;
	}

	public static void maxValue(int... x) {
		int max = Integer.MIN_VALUE;
		for (int value : x) {
			//max = (max < value) ? value : max;
			max=Math.max(value, max);
		}
		System.out.println(max);

	}
	
}
