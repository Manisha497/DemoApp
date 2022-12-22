package com.enums;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//create your own annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
//	String country();
//	int runs();
	String country() default "India";
	int runs() default 10400;
}

//@CricketPlayer(country = "India", runs = 10400)
@CricketPlayer()
class Player{
	private int innings;
	private String name;
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class LaunchAnno {

	public static void main(String[] args) {
		Player p1 = new Player();
		p1.setInnings(200);
		p1.setName("Virat Kohli");
		System.out.println(p1.getInnings());
		System.out.println(p1.getName());
		
		Class c = p1.getClass();
		Annotation an = c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp = (CricketPlayer) an;
		int run= cp.runs();
		System.out.println(run);
		String country = cp.country();
		System.out.println(country);
	}

}
