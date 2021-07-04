package com.joe.cipher;

import java.util.HashMap;

public class Converter {

	static int binaryToDecimal(String bin) {

		return Integer.parseInt(bin,2);
	}
	static String decimalToASCIIChar(int dec) {

		Character ch = ' ';

		HashMap<Integer, Character> charMap
		= new HashMap<Integer, Character>();

		charMap.put(97, 'a');
		charMap.put(98, 'b');
		charMap.put(99, 'c');
		charMap.put(100, 'd');
		charMap.put(101, 'e');
		charMap.put(102, 'f');
		charMap.put(103, 'g');
		charMap.put(104, 'h');
		charMap.put(105, 'i');
		charMap.put(106, 'j');
		charMap.put(107, 'k');
		charMap.put(108, 'l');
		charMap.put(109, 'm');
		charMap.put(110, 'n');
		charMap.put(111, 'o');
		charMap.put(112, 'p');
		charMap.put(113, 'q');
		charMap.put(114, 'r');
		charMap.put(115, 's');
		charMap.put(116, 't');
		charMap.put(117, 'u');
		charMap.put(118, 'v');
		charMap.put(119, 'w');
		charMap.put(120, 'x');
		charMap.put(121, 'y');
		charMap.put(122, 'z');

		if(charMap.containsKey(dec)) {
			ch = charMap.get(dec);
		}
		return ch.toString();
	}
	static int charToASCIIDecimal(char ch) {

		HashMap<Character, Integer> charMap
		= new HashMap<Character, Integer>();

		charMap.put('a', 97 );
		charMap.put('b', 98 );
		charMap.put('c', 99 );
		charMap.put('d', 100 );
		charMap.put('e', 101 );
		charMap.put('f', 102 );
		charMap.put('g', 103);
		charMap.put('h', 104);
		charMap.put('i', 105);
		charMap.put('j', 106);
		charMap.put('k', 107);
		charMap.put('l', 108);
		charMap.put('m', 109);
		charMap.put('n', 110);
		charMap.put('o', 111);
		charMap.put('p', 112);
		charMap.put('q', 113);
		charMap.put('r', 114);
		charMap.put('s', 115);
		charMap.put('t', 116);
		charMap.put('u', 117);
		charMap.put('v', 118);
		charMap.put('w', 119);
		charMap.put('x', 120);
		charMap.put('y', 121);
		charMap.put('z', 122);

		if(charMap.containsKey(ch)) {
			return charMap.get(ch);
		}
		else {
			return 0;
		}
	}



	static String decimalToHex(int n ) {
		StringBuilder hex = new StringBuilder();
		HashMap<Integer, String> hexMap
		= new HashMap<Integer, String>();

		hexMap.put(0, "0");
		hexMap.put(1, "1");
		hexMap.put(2, "2");
		hexMap.put(3, "3");
		hexMap.put(4, "4");
		hexMap.put(5, "5");
		hexMap.put(6, "6");
		hexMap.put(7, "7");
		hexMap.put(8, "8");
		hexMap.put(9, "9");
		hexMap.put(10, "a");
		hexMap.put(11, "b");
		hexMap.put(12, "c");
		hexMap.put(13, "d");
		hexMap.put(14, "e");
		hexMap.put(15, "f");

		if(n < 9) {
			hex.append( Integer.toString(n));
		}
		else if(n > 15) {
			do {
				int num = n % 16;
				hex.append(hexMap.get(num));
				n = n / 16;
			} while(n / 16 != 0);
			if(n >=10) {

				hex.append(hexMap.get(n));
			}
			else if(n < 10) {
				hex.append(n);
			}
			hex = hex.reverse();

		} 
		else if(n >= 10 && n < 16) {
			if(hexMap.containsKey(n)) {
				hex.append(hexMap.get(n));
			}
		}
		return hex.toString();

	}




	static String arrayToString(String[] a1) {

		StringBuilder sb  = new StringBuilder();
		for(int i =0; i < a1.length; i++) {
			sb.append(a1[i]);
		}
		String string = sb.toString();

		return string;
	}}
