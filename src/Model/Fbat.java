package Model;

public class Fbat extends Unit {
	
	public Fbat() {
		super(50);
	}
	
	public void inform() {
		System.out.println("���̾:" + "hp=" + hp);
		
	}
	
	
	private int hp = 50;
	private int gun = 10;
	private int count;
	
	public int gethp() {
		return hp;
	}
	
	public void sethp(int hp) {
		this.hp=hp;
		
	}
	

	
	
	public void attack(Unit target) {

		for(count=0;count<3;count++){	
			if(target.hp>0) {
				target.hp = target.hp - this.gun;
				System.out.println("Marine�� ü���� " + target.hp);
			} 
			
			
			if(target.hp<=0) {
				System.out.println("�׾����");
			}
			
			
			
			
		}
	}
	public void attack(Fbat target) {
		

		
		for(count=0;count<3;count++){	
			if(target.hp>0) {
				target.hp = target.hp - this.gun;
				System.out.println("Marine�� ü���� " + target.hp);
			} 
			
			
			if(target.hp<=0) {
				System.out.println("�׾����");
			}
			
			
			
			
		}
	}  
}
