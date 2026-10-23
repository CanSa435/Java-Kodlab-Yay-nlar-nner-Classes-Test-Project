package com.cansazak.writer;

import java.util.Scanner;

import com.cansazak.globalclass.WriteLowerCase;
import com.cansazak.innerclass.WriteUpperCase;
import com.cansazak.nonameclass.WriterCharacterLength;
import com.cansazak.nonameclass.interfaces.IWriterCharacterLength;

public class WriteString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("kelime giriniz : ");
		String word = scanner.nextLine();
		
		WriteUpperCase.writerUpperCase upperCase = new WriteUpperCase().new writerUpperCase();
		WriteLowerCase lowerCase = new WriteLowerCase();
		WriterCharacterLength writeCharacterLength = new WriterCharacterLength();
		IWriterCharacterLength wordLenght = writeCharacterLength.writeLength(0);
		
		System.out.println("Kelimenin Büyük Hali : " + upperCase.writerUpperWord(word));
		System.out.println("Kelimenin Küçük Hali : " + lowerCase.writerLower(word));
		System.out.println("Kelimemin Karakter Adet Sayısı : " + wordLenght.writeCharacterLength(word)); 
		
		
	}
}
