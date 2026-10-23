package com.cansazak.globalclass;

import com.cansazak.globalclass.interfaces.WriterLower;

public class WriteLowerCase {
	public String writerLower(String sonuc) {
		class LowerCase implements WriterLower {

			@Override
			public String writeLowerCase(String lowerCase) {
				return lowerCase.toLowerCase();
			}
			
		}
		return new LowerCase().writeLowerCase(sonuc);
	}
}
