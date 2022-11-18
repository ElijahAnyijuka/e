package elijahf;
// ANYIJUKA ELIJAH
// 2021/A/KIT/0712/F

import java.util.Scanner;

class year {
	private int Age;
	public int getAge() {
		return Age;
	}
	
public void setAge(int Age) {
	this.Age = Age;
}
}
class anyijuka extends year  {
public static void main(string[] args) {
		year p1 = new year ();
		p1.setAge(24);
		System.out.println("Year Of Entry" + p1.getAge());
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text");
		String myString = input.next();
		System.out.println("Text entered " . myString);
				
		
	}
	
}
