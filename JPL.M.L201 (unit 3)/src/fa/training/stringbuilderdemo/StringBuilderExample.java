package fa.training.stringbuilderdemo;

public class StringBuilderExample {
	public void demonstrateStringBuilder() {
		System.out.println("demonstrateStringBuilder() !!!");
		StringBuilder sb1 = new StringBuilder("Hello Java World");
		sb1.delete(4, 8);
		System.out.println("Delete method demo: " + sb1);
		StringBuilder sb2 = new StringBuilder("Hello Java World");
		sb2.insert(4, "abc");
		System.out.println("Inser Operation: " + sb2);
		StringBuilder sb3 = new StringBuilder("fsoft.fpt.com");
		sb3.replace(1, 4, "Amit");
		System.out.println("Replace Operation: " + sb3);
		StringBuilder sb4 = new StringBuilder("ABCDE");
		System.out.println("Reverse of ABCDE: " + sb4.reverse());
		StringBuilder sb5 = new StringBuilder("ABCDEF");
		sb5.setCharAt(3, 'x');
		System.out.println("Replacing char at index 3: " + sb5);
		comparePerformance1();
	}
		private static void comparePerformance1() {
			long startTime;
			
			String str = "";
			StringBuilder builder = new StringBuilder();
			StringBuffer buffer = new StringBuffer();
			
			// Using String
			startTime = System.currentTimeMillis();
			
			for (int i = 0; i < 10000; i++) {
			str += "extra";
			}
			System.out.println("Time using String: "
			+ (System.currentTimeMillis() - startTime) + " ms.");
			
			// Using StringBuffer
			startTime = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
			builder.append("extra");
			}
			System.out.println("Time using StringBuilder: "
			+ (System.currentTimeMillis() - startTime) + " ms.");
			
		for (int i = 0; i < 10000; i++) {
			buffer.append("extra");
			}
			System.out.println("Time using StringBuffer: "
			+ (System.currentTimeMillis() - startTime) + " ms.");
			}
}

