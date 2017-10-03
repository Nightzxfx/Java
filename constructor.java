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

	public static void main(String[] args) {
		
// when creating a new object is leave with not parametes it will takes from the first consctructor
		product bla = new product();
		
//System.out.println(bla.code); will print "No code set"		
		System.out.println(bla.code);
		
		
	}

//	Is you give parameters or valuers you will use from there
	//product bla = new product(10, "bkakva", "vwwe");
	//                         price,  code, description
	//System.out.println(bla.code); will print "bkakva"
}

