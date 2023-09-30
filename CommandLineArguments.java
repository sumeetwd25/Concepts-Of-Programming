public class CommandLineArguments {

	public static void main(String[] args) {
	
		System.out.println("length: "+args.length);
	
	for(int i = 0; i<args.length; i++ ) {			//orthodox for loop
		System.out.println(args[i]);
	}
	/*
	for(String s : args) {							//enhanced for loop
		System.out.println(s);
	}
	*/
	}

}
