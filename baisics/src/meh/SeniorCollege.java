package meh;

public class SeniorCollege extends Student
{
	private boolean SRC;
	public SeniorCollege(String name,String surname, int age,int grade, String ID,boolean src)
	{
		super(name, surname,age,grade,ID);
		this.SRC = src;
	}
	public boolean isSRC() {
		return SRC;
	}
	public void setSRC(boolean sRC) {
		SRC = sRC;
	}
	@Override
	public String toString() {
		return super.toString() + " ,SRC: " + SRC ;
	} 
	
	
}
