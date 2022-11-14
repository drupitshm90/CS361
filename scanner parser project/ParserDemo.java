public class ParserDemo {

	public static void main(String[] args) {

		// TO BE COMPLETED
		// Change the path!
		TokenStream tStream = new TokenStream("C:\\\\Users\\\\cscharff\\\\eclipse-workspace\\\\ScannerSolution\\\\src\\\\prog1.kay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("Debugging - End of parsing");

	}

}