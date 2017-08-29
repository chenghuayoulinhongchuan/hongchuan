package Hanshu;

import java.util.Calendar;
import java.util.Date;

public class Test02Date {
	private Date date;
	Calendar cal;
	public Test02Date(){
		date = new Date();
		Date date2 = new Date();
		cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(date.after(date2));
		System.out.println(date.getDay());
	}
	public static void main(String[] args){
		Test02Date obj = new Test02Date();
	}
}
