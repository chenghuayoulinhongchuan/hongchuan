package Mianxiangduixiang;

public class Test06classTeacher {
	private String name;
	private String subject;
	
	public Test06classTeacher(){
		
	}
	public Test06classTeacher(String name,String subject){
		this.name = name;
		this.subject = subject;
	}
	
	public void teaching(){
		System.out.println(name+" is teaching"+subject);
	}

}
