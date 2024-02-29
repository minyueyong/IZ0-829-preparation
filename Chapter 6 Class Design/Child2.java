class Person {
 
         String name;
	 
	 void setName ( String q ) {  name = q ;}
	 
}
 
public class Child2 extends Person {
 
	  String name ;
	 
	  void setName ( String w ) { name = w; }
	 
	public static void main ( String [ ] p ) {
	 
		final Child2 m = new Child2 ( ) ;
		final Person t = new Child2 ( );                  //here is the difference with Child.java
		 
		m.name = "Elysia";
		t.name =  "Sophia";
		 
		m.setName ( "Webby" );
		t.setName ( "Olivia" );

		System.out.println ( m.name + " " + t.name );  
	 
	}
 
}

/*  

1) name is static & method is  static
Webby Olivia

method is static means is hiding, Person and Child call their own setName


2) name is static & method is not static

Olivia Sophia

- method is not static means its overriding

- m.setName and t.setName will call Child method and modify the Child name


3) name is not static & method is static 
DOES NOT COMPILE because cannot call non static variable from static method


4) name is not static & method is not static

Webby Sophia

- method is not static means its overriding

- both setName method for m and t will call child method

 

 */