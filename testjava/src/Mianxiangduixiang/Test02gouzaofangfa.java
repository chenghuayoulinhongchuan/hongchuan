package Mianxiangduixiang;

class Teacher{
	private String name;
	private String gender;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
//构造方法：初始化类的属性或方法但没有返回值
	public Teacher(){
		System.out.println("老师类的构造方法");
	}
//构造方法的重载	
	public Teacher(String name){
		System.out.println("老师姓名");
		setName(name);
	}

	public void teach(){
		System.out.println("备课");
		System.out.println("授课");
	}
}

public class Test02gouzaofangfa {
	public static void main(String[] args){
		Teacher lin = new Teacher("cindy");
		lin.teach();
	}
}
