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
	public Scanner sc = null;
	public String line;
	public void readin() throws FileNotFoundException
	{
		
		Scanner scFile = new Scanner(new File("baisics/src/textfiles/Student"));
		
		while(scFile.hasNext())
		{
			line =  scFile.nextLine();
			sc = new Scanner(line).useDelimiter(";");
			name = scFile.next();
			surname = scFile.next();
			age = scFile.nextInt();
			grade = scFile.nextInt();
			ID = scFile.next();
			
			student[counter] = new Student(name,surname,age,grade,ID);
			counter++;
			
		}
		
		scFile.close();
		sc.close();
	}
	
	public void printout()
	{
		for(int i = 0;i <= counter; i++)
		{
			System.out.println(student[i]);
		}
	}
}
