
public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'D';
		
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'D':
			System.out.println("Maalesef Kaldınız");
			break;
		case 'F':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
			
			
//  B ve C harfleri için aynı çıktıyı verir
//				case 'B':
//				case 'C':
//					System.out.println("Fena Değil : Geçtiniz");
//					break;
					
		}
	}

}
