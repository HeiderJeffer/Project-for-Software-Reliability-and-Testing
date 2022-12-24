/* Code for experiment */
package com.wuerth.phoenix.cis.university.example2.test.Ayoo;

import com.wuerth.phoenix.cis.university.example2.util.Scenario;

public class Main {	
	public static void main(String[] args) {		
		new EngineTestData() {

			@Override
			public boolean check(Scenario scenario) {
				return true;
			}

		}.start();
	}
}
