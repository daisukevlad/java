package model;

import java.io.Serializable;

public class User implements Serializable{
	
	private String name;
	private String pass;
	private String img;
	
	public User() {}
	public User(String name,String pass,String img){
		this.name = name;
		this.pass = pass;
		this.img = img;
	}
	
	public String getName() {return name;}
	
	public String getPass() {return pass;}
	
	public String getImg() {return img;}
	
	
	
}
