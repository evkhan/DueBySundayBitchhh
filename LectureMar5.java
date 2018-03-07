// ***************************************************************************
// Written by..: Cason Lowe
// Date Written: 1/17/2018
// Purpose.....: Practice
// ***************************************************************************

import java.util.*;
public class LectureMar5 {
	public static void main(String[] args) {
		
		Politician [] people = new Politician[10];
		
		/* for (int i = 0; i < 1; i++){
			people[i] = Politician.makePolitician();
			System.out.println(people[i]);
		} // end for Loop */
		
		Person newPerson;
		newPerson = Person.makePerson();
		System.out.println(newPerson);
		
		Person fred = new Politician("Fred", true, 'D');
		System.out.println(fred);
		
		//Doctor testDoctor = new Doctor();
		
		
	} // end of Main

} // end of Class



