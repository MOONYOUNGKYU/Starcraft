package Model;

public class Marine extends Unit {
	
	public Marine() {
		super(100);
	}
	
	
	public int hp = 50;
	public int gun = 10;
	
	



	
	public void attack(Fbat target) {
		for(count=0;count<1;count++){	
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
		
		for(count=0;count<1;count++){	
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

