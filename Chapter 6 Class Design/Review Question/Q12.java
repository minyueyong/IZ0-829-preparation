class Rodent {
 
	public Rodent ( Integer x  ) { }
	protected static Integer chew ( ) throws Exception {
	 
		System.out.println ( "Rodent is chewing" );
		return 1;
	}
}
 
class Q12 extends Rodent {
	public  Number chew ( ) throws RuntimeException {
	 
		System.out.println ( "Beaver is chewing on wood" );
		return 2;
		 
	}
}