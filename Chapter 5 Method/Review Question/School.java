package my.city;
import my.school.*;

public class School {


	public static void main ( String [] args  ) {

			System.out.println ( Classroom.globalKey );     //cannot access bcuz its package private
			Classroom room = new Classroom ( 101 , "Mrs Anderson" );   //cannot access bcuz its package private
			 
			System.out.println ( room.roomNumber );          //cannot access because its private
			System.out.println ( Classroom.floor );        //cannot access because its package private
			System.out.println ( Classroom.teacherName );    //cannot access bcuz protected means only same package


	}



}