package Controller;

import Model.Marine;
import Model.Fbat;

public class Controller {

	public static void main(String[] args) {
	
		Marine marine = new Marine();
		marine.inform();
		// TODO Auto-generated method stub
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Fbat f1 = new Fbat();
		Fbat f2 = new Fbat();
		Fbat f3 = new Fbat();
		
		
		
		
		
		
		

		
		
		m1.attack(m2);
		f1.attack(f2);
		
		m1.attack(f1);
		f1.attack(m1);
		
		
		}

		
	}

	
	


