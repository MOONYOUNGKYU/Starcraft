package Model;

public class Marine extends Unit {
	
	public Marine(String name) {
		super(name,50);
	}
	
	
	
	public void inform() {
		
		System.out.println("마린:" + this.name +"," + "hp=" + hp);
		
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
				System.out.println(" Fbat의 체력은 " + target.hp);
			} 
			
			
			if(target.hp<=0) {
				System.out.println("죽었어요");
			}
			
			
	}
	}
	
	public void attack(Marine target) {
		
//		target.hp = target.hp - this.gun;
		
		for(count=0;count<3;count++){	
			if(target.hp>0) {
				target.hp = target.hp - this.gun;
				System.out.println("Marine의 체력은 " + target.hp);
			} 
			
			
			if(target.hp<=0) {
				System.out.println("죽었어요");
			}
			
			
			
			
		}
	}
}

