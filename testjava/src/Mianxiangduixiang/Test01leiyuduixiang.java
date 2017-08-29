package Mianxiangduixiang;

class Student{
//	成员变量
	private String name;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
//	方法
	public void playbasketball(){
		System.out.println("打篮球");
	}
}

public class Test01leiyuduixiang {
	public static void main(String[] args){
		Student s = new Student();
		s.setName("张三");
		s.setAge(30);
		s.setGender("男");
		s.playbasketball();
	}
}
