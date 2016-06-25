package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Fbat;
import Model.Marine;
import Model.Unit;

public class Controller {
	
	
	Unit m1 = new Marine();
	Unit m2 = new Marine();
	Unit m3 = new Fbat();
	Unit m4 = new Fbat();

	public static void main(String[] args) {
		
		List<Unit> list = new ArrayList<Unit>();

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("�������� : 1");
			System.out.println("���̾���� : 2");
			System.out.println("��Ȳ���� : 3");
			System.out.println("���� : 4");
			
			int input = scanner.nextInt();
			
			
			
			switch(input) {
					case 1:
						
						Marine marine=new Marine();
						list.add(marine);
						break;
						
						
					case 2:
						
					    Fbat Fbat=new Fbat();
						list.add(Fbat);
						break;
						
					case 3:
						System.out.println(list.size() + "����");
						for(int i=0;i<list.size();i++) {
							Unit unit = list.get(i);
							unit.inform();
						}
					    break;
					 
			
					    	
					    	
					    	
						
						
			}
			
		
			
			
			
			
			
					
		}
	}
}


