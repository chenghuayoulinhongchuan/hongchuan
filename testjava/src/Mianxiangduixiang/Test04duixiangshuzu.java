package Mianxiangduixiang;

class Studentpartone{
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Studentpartone(){
		
	}
	public Studentpartone(String name){
		this.name = name;
	}
}

public class Test04duixiangshuzu {
	public static void main(String[] args){
		Studentpartone[] stpo = new Studentpartone[3];
		stpo[0] = new Studentpartone("marry");
		stpo[1] = new Studentpartone("cindy");
		stpo[2] = new Studentpartone("jack");
		for (int i = 0; i < stpo.length; i++) {
			System.out.println(stpo[i].getName());
		}
	}
}
