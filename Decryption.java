package com.joe.cipher;
public class Decryption {


	public static String decrypt(String message, int key) {
		StringBuilder plainText = new StringBuilder();
		String[] words = message.split("_");
		String ch = "";


		//*Retrieves first to characters which are the random # from encryption.
		StringBuilder num = new StringBuilder();
		num.append(Character.getNumericValue(message.charAt(0)));
		num.append(Character.getNumericValue(message.charAt(1)));
		int ranNum = Integer.parseInt(num.toString());
		//*Removes the random numbers from the string.
		words[0] = words[0].substring(2);


		//*Separates by words by splitting the string at each underscore.
		for(int i = 0; i < words.length; i++) {
			String[] letters = words[i].split("-");
			for(int x = 0; x < letters.length; x++) {
				if(letters[x] != "") {
					int decimal = Integer.parseInt(letters[x],16);
					int secCh = decimal / (key + ranNum);

					ch = Converter.decimalToASCIIChar(secCh);
					plainText.append(ch);
				}

			}
			plainText.append(" ");

		}	
		return plainText.toString();

	}


}
