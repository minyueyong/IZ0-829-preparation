abstract class Husky {


 abstract void play ( ) ;    
		   
}

interface Poodle {

	void play ( ) ;         
				
}

class Webby extends Husky {

	void play (){}     // override with package access so its ok 
}

public class Georgette implements Poodle {

	void play () { }           //DOES NOT COMPILE because cannot override an implicit public method with package access 


}

//You cannot override with an access modifiers that its more narrower than the overridden method