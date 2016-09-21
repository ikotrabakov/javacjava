class TypeCasting {
	public static void main(String args[]) {
		byte b = 0;
		short s = 0;
		char c = 0;
		int i = 0;
		long L = 0;
		float f = 0.0F;
		double d = 50_000.99D;

		b = (byte) d;
		s = (short) d;
		c = (char) d;
		i = (int) d;
		L = (long) d;
		f = (float) d;
	
		System.out.println("double d value: "+d);
		System.out.println("cast (byte): "+b);
		System.out.println("cast (short): "+s);
		System.out.println("cast (char): "+c);
		System.out.println("cast (int): "+i);
		System.out.println("cast (long): "+L);
		System.out.println("cast (float): "+f);
		
		System.out.println();
		c = 'A';
		i = (int) c;
		System.out.println("ASCII A is decimal " + i);
                System.out.println();
		b = (byte) 100.45; // cast on a literal, legal but stupid.
		System.out.println("b = " + b);
        	System.out.println();
		s = (short) (i*2); // cast on an expression - special rules
		System.out.println("s = " + s);
	}
}