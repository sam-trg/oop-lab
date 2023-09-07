package exercises;
/* Add the following string processing methods to the class STUDENTS1:
a) extractInitials(): A method that extracts the initials from the STUDENTS1's name. 
	For example, if the STUDENTS1's name is "John Doe", this method would return "JD".
b) removeWhitespace(): A method that removes any whitespace characters from the STUDENTS1's name. 
	For example, if the STUDENTS1's name is "John Doe", this method would transform it to "JohnDoe".
c) List all the STUDENTS1 names containing a particular sub string.
d) Sort the STUDENTS1 alphabetically */


public class Lab5Q2 {

	public static void main(String[] args) {
		
		STUDENTS1 s1 = new STUDENTS1();

		s1.sname = "Tarak Mehta";
		s1.display();
		
		STUDENTS1 s2 = new STUDENTS1();
		
		s2.sname = "Ishan Awasthi";
		s2.display();
	}
}

class STUDENTS1 {
	
	
	String sname, initials, nametext;

		
	public void extractInitials() {
		
		StringBuffer initialsMaker = new StringBuffer();
		String name = sname.toUpperCase();
		String[] nameArr = name.split(" ");
		for(String word: nameArr) {
			initialsMaker.append(word.charAt(0));
		}
		initials = initialsMaker.toString();

	}
	
	public String removeWhitespace() {
		
		StringBuilder nametextMaker = new StringBuilder();
		String[] nameArray = sname.split(" ");
		for (String word: nameArray) {
			nametextMaker.append(word);
		}
		nametext = nametextMaker.toString();
		
		return nametext;
	}

	public void display() {
		
		System.out.println("Student "+sname+"'s name without whitespace is " + removeWhitespace());
	}
		
}