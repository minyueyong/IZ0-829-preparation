class Person {
 
          String name;
	 
	  void setName ( String q ) {  name = q ;}
	 
}
 
public class Child extends Person {
 
	 String name ;
	 
	  void setName ( String w ) { name = w; }
	 
	public static void main ( String [ ] p ) {
	 
		final Child m = new Child ( ) ;
		final Person t = m;
		 
		m.name = "Elysia";
		t.name =  "Sophia";
		 
		m.setName ( "Webby" );
		t.setName ( "Olivia" );

		System.out.println ( m.name + " " + t.name );  
	 
	}
 
}

/* 

- In summary, both m and t point to the same object, but the type of the reference (Child or Person) affects the accessibility of methods and fields.

- In this case, even though both m and t refer to the same object, if you have overridden methods in the Child class, 
calling those methods on t will invoke the overridden versions in the Child class (polymorphism). 

1) name is static & method is  static

- since method is static then it will call their respective reference type on the left
- m.setName will call setName in child class and t.setName will call setName in parent class

Webby Olivia

2) name is static & method is not static

- method is not static so its being overriden so everytime will call setName in the child class
Olivia Sophia

3) name is not static & method is static 

DOES NOT COMPILE

4) name is not static & method is not static

- method is being overriden so every time will call the setName in child class and modify the name variable in child class

Olivia Sophia

 */