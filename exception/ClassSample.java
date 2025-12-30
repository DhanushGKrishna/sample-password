public class ClassSample {

	public static void main(String[] args) {
		hello s1 = new hello();
		hello s2 = new hello();
		
		s1.a = 10;
		s2.b = 20;

		System.out.println(s1.a);
		
	}
}

class hello{
	int a;
	int b;
    
    
}
