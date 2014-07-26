package meh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Manager 
{
	private int grade, age;
	private String name, surname,ID;
	
	public int counter = 0;
	public Student[] student;	
	
	public void readin() throws FileNotFoundException
	{
		Scanner scFile = new Scanner(new File("baisics/src/textfiles/Student")).useDelimiter(",");
		
		while(scFile.hasNext())
		{
			name = scFile.next();
			surname = scFile.next();
			age = scFile.nextInt();
			grade = scFile.nextInt();
			ID = scFile.next();
			
			student[counter] = new Student(name,surname,age,grade,ID);
			counter++;
			
		}
	}
	
	public void printout()
	{
		for(int i = 0;i <= counter; i++)
		{
			System.out.println(student[i]);
		}
	}
}
