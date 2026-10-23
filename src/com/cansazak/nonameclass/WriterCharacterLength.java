package com.cansazak.nonameclass;

import com.cansazak.nonameclass.interfaces.IWriterCharacterLength;

public class WriterCharacterLength {
	public IWriterCharacterLength writeLength(int i) {
		return new IWriterCharacterLength() {
			
			@Override
			public int writeCharacterLength(String characterLength) {
 				return characterLength.length();
			}
		};
	}
}
