package main;

import main.entities.Person;

/**
 * 
 */

/**
 * @author User
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person("PersonName1", "PersonVorname1",53);
		MainClass mC = new MainClass();
		mC.pM(p.toString());
	}
	
	public void pM(String pMessage){
		System.out.println(pMessage);
	}

}
