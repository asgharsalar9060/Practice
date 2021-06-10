package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		int nt = i.length;
		System.out.println(nt);
		
		System.out.println(i.length);
		
	
		String s[] = {"Ali", "Kali", "Mali", "Dali"};
		
		System.out.println(s.length);
		
		System.out.println(s[2]);
		
		for(int b=0; b<s.length; b++) {
			System.out.println(s[b]);
		}
		System.out.println("********************");
		
		for(String f : s) {
			System.out.println(f);
		}
		
		
		System.out.println("********************");
		
		String s2[][] = {{"US", "UK", "UN"}, {"Ukraine", "Yaman", "Maldives"}};
		
		System.out.println(s2.length);
		
		System.out.println(s2[0][1]);
		
		System.out.println(s2[1][2]);
		
		for(int j=0; j<s2.length; j++) {
			for(int k=0; k<s2[j].length; k++) {
				System.out.println(s2[j][k]);
			}
		}
		
		
		
	}

}
