class InstanceVariable {
	public static void main(String args[]) {
		Box small; // declare a reference variable to a Box object 
		small = new Box(); // allocate a new Box object to small
		
		Box medium = new Box(); // single statement - declare reference variable and allocate new Box object
		Box large = new Box();
		
		// object.member, small is its own object
		small.length = 5; // small has its own instance (copy) of the length instance variable
		small.width = 5; // small has its own instance (copy) of the width instance variable
		small.height = 5; // small has its own instance (copy) of the height instance variable

		// object.member, medium is its own object
		medium.length = 10; // medium has its own instance (copy) of the length instance variable
		medium.width = 10; // medium has its own instance (copy) of the width instance variable
		medium.height = 10; // medium has its own instance (copy) of the height instance variable

		// object.member, large is its own object
		large.length = 20; // large has its own instance (copy) of the length instance variable
		large.width = 20; // large has its own instance (copy) of the width instance variable
		large.height = 20; // large has its own instance (copy) of the height instance variable

		System.out.print("The volume of our small box is: ");
		small.displayVolume();
		
		System.out.print("The volume of our medium box is: ");
		medium.displayVolume();

		System.out.print("The volume of our large box is: ");
		large.displayVolume();
	}
}