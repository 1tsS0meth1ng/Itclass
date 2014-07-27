package meh;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Manager 
{
	public int grade = 0, age = 0;
	public String name = "", surname = "",ID = "";
	
	public int counter = 0;
	public Student[] student = new Student[10000];	
	
	
	public void readin() throws IOException
	{
		Scanner scFile = new Scanner(new File("C:/Users/Brendan/Documents/Programs/Itclass/baisics/src/textfiles/Student.txt"));//feel free to change the location of the text file to match the location on your pc	
		Scanner sc = null;
		String line = "";
		
		while(scFile.hasNext())
		{
			line =  scFile.nextLine();
			sc = new Scanner(line).useDelimiter(",");
			
			name = sc.next();
			surname = sc.next();
			age = sc.nextInt();
			grade = sc.nextInt();
			ID = sc.next();
			
			student[counter] = new Student(name,surname,age,grade,ID);
			counter++;
			
		}
		sc.close();
		scFile.close();
	
	}
	
	public void printout()
	{
		for(int i = 0;i < counter; i++)
		{
			System.out.println(student[i]);
		}
	}
}
