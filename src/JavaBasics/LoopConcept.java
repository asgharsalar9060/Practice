package JavaBasics;

public class LoopConcept {

	public static void main(String[] args) {

//		System.out.println(1);
//		System.out.println(2);
//
//		System.out.println(3);
//
//		System.out.println(4);
//
//		
//		System.out.println(5);
//		System.out.println(6);
		
		int num = 0;//init
//
//		for(int i=0; i<=10; i++) {//conditional
//			System.out.println(i);//statement
//		}
		
//		while(num<10) {
//			++num;
//			System.out.println(num);
//		}
		
//		do {
//			System.out.println(num);
//			++num;
//		}	
//		while(num<10);
		
		for(int i=1; i<=25; i++) {
			if(i % 7 == 0) {
				System.out.println("Asghar " + i);
			}
			else if(i % 5 == 0) {
				System.out.println("Meqdad " + i);
			}
			else {
				System.out.println(i);
			}
		}
		
	}

}
