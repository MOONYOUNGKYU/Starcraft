package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Fbat;
import Model.Marine;
import Model.Unit;

public class Controller {
	
	

	
	public static void main(String[] args) {
		
		List<Unit> list = new ArrayList<Unit>();

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("마린생성 : 1");
			System.out.println("파이어벳생성 : 2");
			System.out.println("현황보기 : 3");
			System.out.println("유닛선택 : 4");
			System.out.println("공격하기 : 5");
			
			int input = scanner.nextInt();
			

			
			switch(input) {
					case 1:
						System.out.println("마린의 이름을 입력하세요:");
						String mname = scanner.next();
						Marine marine=new Marine(mname);
						list.add(marine);
						break;
						
						
					case 2:
						
						System.out.println("파이어뱃의 이름을 입력하세요:");
						String fname = scanner.next();
						Fbat fbat=new Fbat(fname);
						list.add(fbat);
						break;
						
					case 3:
						System.out.println(list.size() + "마리");
						for(int i=0;i<list.size();i++) {
							Unit unit = list.get(i);
							unit.inform();
				       
				        }
						break;
						
					case 4:
						
						for ( int i=0; i < list.size(); i++) {
							Unit unit =list.get(i);
							System.out.println(i +": " + unit.getName());
						}
						
						int index = scanner.nextInt();
						Unit selectedUnit = list.get(index);
						
						selectedUnit.inform();
						
						break;
						
					case 5:
					
						
							
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
				        
					
						
						
							
							
				}
						
						
		}
	}
			
		
			
			
			
			
			
					
		}




