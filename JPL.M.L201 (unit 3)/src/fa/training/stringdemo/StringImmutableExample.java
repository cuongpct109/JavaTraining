package fa.training.stringdemo;

public class StringImmutableExample {
/**
 * Show an demonstration about immutable characteristic of String in Java.
 */
	public void demonstrateStringImmutable() {
		System.out.println("demonstrateStringImmutable() !!!");
		
		String s1 = "java";
		
		String s2 = s1;
		
		System.out.println(s1 == s2);
		
		s1 = "python";
		
		System.out.println(s1 == s2);
		
		System.out.println(s2);
	}
}
