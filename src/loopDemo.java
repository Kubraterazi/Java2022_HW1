public class loopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü Bitti");
		
		
		//While 
		int i =2;
		while(i <10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
		
		//Do-While
		int j = 1;  
		do {
			System.out.println(j);
			j+=2;
		}while(j <10);
		System.out.println("Do-While Döngüsü Bitti");
	}

}
