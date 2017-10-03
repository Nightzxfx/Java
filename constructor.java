package week5;

public class product {

	 double price;
	 String code;
	 String description;

	//Constructor
	public product() {

		price = 0;
		code = "No code set";
		description = "NO description set";

	}
	//New constructor but now adding parameters and the parameter has to be the same value to the variable
	public product( double p, String code, String description) {
		
		this.price = p;
		this.code = code;
		this.description = description ;
		
	}

//function called scan, will return the price value and it's parameter is String Code ('java"), but you dont need it
public double scan(String code) {
	System.out.println(price);
	return price;
}	
//function called void, nothing is returning, so if you call it will print the description
public void printDescription() {
	
	System.out.println(description);
	
}
//function called String and when called it will return the value in code "java"
public String assignCode() {
	
	return code;
	
}
	public static void main(String[] args) {
		

// creatng a new object called test
		product test = new product(10D, "java", "You should not buy it");
		
		
// calling the function scan		
		test.scan("java");

//assgn
		Double a = test.scan("java");
		
		System.out.println(a);
		
		test.printDescription();
		
		String newcode = test.assignCode();
		
		System.out.println(newcode);
	}
}

//when creating a new object is leave with not parameters it will takes from the first constructor
		//product test = new product();
//System.out.println(test.code); will print "No code set"


//	Is you give parameters or valuers you will use from there
	//product test = new product(10D, "java", "You should not buy it");
	//                         price,  code, description
	//System.out.println(bla.code); will print "java"


