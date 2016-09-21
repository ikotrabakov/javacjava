class TypePromotion {
	public static void main(String args[]) {
		byte b = 2;
		//b = b * b; // error, the result of  b * b was promoted to an int data type
		//b = (byte) b * b; // still an error, the expression b * b needs to be in parenthesis
		b = (byte) (b * b);
		System.out.println("b = " + b);

		short s = 130;
		char c = 'A';
		s = (short) (s / c);
		System.out.println("s = " + s);

		float f = 2.25F;
		int i = 5;
		f = (float) (f + i);
		System.out.println("f = " + f);

		s = 130;
		long L = 125;
		s = (short) (s % L);
		System.out.println("s = " + s);

		i = 25;
		double d = 12.5D;
		i = (int) (i - d); // remember, casting can result in data loss
		System.out.println("i = " + i);
	}
}