class Parent {
    static String id = "1";
    static String name = "ParentClass";

    public void displayName() {
        System.out.println(name);
    }
    
    public void displayId() { 
        System.out.println(id); 
    }
}

class hidingvariables2 extends Parent {
    static int id = 2;
    static String name = "ChildClass";


    public void displayName() {
        System.out.println(name);
    }


    public void displayId() {
        System.out.println(id);
    }


   public static void main(String[] args) {
        Parent parent = new Parent();

        hidingvariables2 child = new hidingvariables2();

	
	Parent polyparent = new hidingvariables2();   //assign child object to parent

        parent.displayId(); 
        parent.displayName();
        child.displayId();
        child.displayName();

	polyparent .displayId();
        polyparent .displayName();
    }
}

