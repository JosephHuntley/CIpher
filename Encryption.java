package com.joe.cipher;
import java.util.Random;
public class Encryption {
	
	public static String encrypt(String message, int key) {

		String[] words = message.split(" ");
		char ch;
		StringBuilder cipherText = new StringBuilder();
		Random r = new Random();
		int ranNum = r.nextInt(89) + 10;

		cipherText.append(ranNum);
		for(int i = 0; i < words.length; i++) {
			String letters = words[i];
			for( int x = 0; x < letters.length(); x++) {

				ch = letters.charAt(x);
				int ascii = Converter.charToASCIIDecimal(ch);

				if(ascii != 0) {
					int secCh = ascii * (key + ranNum) ;
					String secHex = Converter.decimalToHex(secCh);
					cipherText.append(secHex);
					if(x != letters.length() - 1) {
						cipherText.append("-");
					}
				}
			}
			if(i != words.length - 1) {
				cipherText.append("_");
			}
		}
		return cipherText.toString();

	}
}