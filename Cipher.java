package com.joe.cipher;

import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.print("Type in your message: ");
		String message = sc.nextLine().toLowerCase();


		System.out.print("\nWhat is your key: ");
		int key = sc.nextInt();


		String cipherText = Encryption.encrypt(message, key);
		System.out.println(cipherText);

		System.out.print(Decryption.decrypt(cipherText, key));

		sc.close();


	}

}
