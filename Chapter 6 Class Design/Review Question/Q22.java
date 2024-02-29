class Person {
 
	static String name;
	 
	void setName ( String q ) {  name = q ;}
	 
}
 
public class Q22 extends Person {
 
	static String name ;
	 
	void setName ( String w ) { name = w; }
	 
	public static void main ( String [ ] p ) {
	 
		final Q22 m = new Q22 ( ) ;
		final Person t = m;
		 
		m.name = "Elysia";
		t.name =  "Sophia";

		 
		m.setName ( "Webby" );
		t.setName ( "Olivia" );
		System.out.println ( m.name + " " + t.name );  //Answer is Olivia Sophia
	 
	}
 
}

/*

- In summary, both m and t point to the same object, but the type of the reference (Child or Person) affects the accessibility of methods and fields.

- In this case, even though both m and t refer to the same object, if you have overridden methods in the Child class, 
calling those methods on t will invoke the overridden versions in the Child class (polymorphism).

method not static means overriding , will become Olivia Sophia

- calling m.setName will call child class punya setName

- calling t.setName will also call child class punya setName

- name for child reference type will change but won't change for Person reference type

*/