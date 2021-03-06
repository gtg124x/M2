import java.util.Random;

package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private Random rand;
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
		rand = new Random();
		char a[] = input.toCharArray();
		for (int i =0; i < a.length; i++) {
			int j = rand.nextInt(a.length);
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

	   return new String(a);
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

	public static void main(String[] args) {
		Person2 person = new Person2("Lavanya");
		String output = person.calc("Hello");
		System.out.println(output);
	}
}
