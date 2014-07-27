package meh;

public class Student 
{
	private int grade,age;
	private String name, surname,ID;
	public Student(String name,String surname, int age,int grade, String ID)
	{
		this.grade = grade;
		this.name = name;
		this.age = age;
		this.ID = ID;
		this.surname = surname;
	}
	public Student(){}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student:\nName: " + name + ", Surname: " + surname + ", Age: " + age + ", Grade: " + grade + ", ID: "+ID;
	}
	
	
	
}
