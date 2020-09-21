package sk.itsovy.dolinsky.objectsort;

import java.util.Random;

/**
 * @author Martin Dolinsky
 */
public class Person implements Comparable<Person> {
	private String fname;
	private String lname;
	private int age;



	public Person(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	public Person() {

	}

	@Override
	public int compareTo(Person o) {
		if (fname.equals(o.getFname()) && lname.equals(o.getLname()))
			return 0;

		if (lname.compareTo(o.getLname()) > 0)
			return 1;
		if (lname.compareTo(o.getLname()) < 0)
			return -1;

		if (fname.compareTo(o.getFname()) > 0)
			return 1;
		if (fname.compareTo(o.getFname()) < 0)
			return -1;
		return 0;


	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
