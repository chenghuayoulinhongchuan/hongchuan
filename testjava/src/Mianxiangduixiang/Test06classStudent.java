package Mianxiangduixiang;

public class Test06classStudent {
	private String name;
	public Test06classStudent(){
		
	}
	public Test06classStudent(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void study(Test06classTeacher theacher){

		theacher.teaching();
		System.out.println(name+" is studying...");
	}
}
