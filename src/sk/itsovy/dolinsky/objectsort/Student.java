package sk.itsovy.dolinsky.objectsort;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Martin Dolinsky
 */
public class Student implements Comparable<Student> {
	private String fname;
	private String lname;
	private int age;

	public Student(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public Student() {

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

	@Override
	public int compareTo(Student o) {
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

	public static String generateLastname() {
		StringBuilder name = new StringBuilder();
		Random random = new Random();

		int length = random.nextInt(6)+5;
		for (int i = 0; i < length; i++) {
			name.append((char) ('a' + random.nextInt('z'-'a')));
		}

		return (name).substring(0, 1).toUpperCase() + (name).substring(1);
	}
}
