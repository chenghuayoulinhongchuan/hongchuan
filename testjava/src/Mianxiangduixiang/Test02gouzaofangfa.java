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
//���췽������ʼ��������Ի򷽷���û�з���ֵ
	public Teacher(){
		System.out.println("��ʦ��Ĺ��췽��");
	}
//���췽��������	
	public Teacher(String name){
		System.out.println("��ʦ����");
		setName(name);
	}

	public void teach(){
		System.out.println("����");
		System.out.println("�ڿ�");
	}
}

public class Test02gouzaofangfa {
	public static void main(String[] args){
		Teacher lin = new Teacher("cindy");
		lin.teach();
	}
}
