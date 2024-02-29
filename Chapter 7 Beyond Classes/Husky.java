public abstract class Husky {


 void play ( ) ;    //DOES NOT COMPILE because this method don't have a body so its abstract method
		   //abstract class don't uses implicit modifiers so you need to add keyword abstract 
}

interface Poodle {

	void play ( ) ;         //can compile even though we didn't add keyword abstract to this method without body
				//because its interface , the implicit modifiers abstract is automatically added 
}