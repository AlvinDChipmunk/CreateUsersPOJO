package com.hubgitAlvin.week05.createUsers;

/*
Exercise: Create User POJO
Requirements

1. Create a User POJO that has a username, password and name. All Strings.

2. Create a constructor for this POJO that takes in those three properties as 
parameters and set them using the "this" keyword. (i.e. this.username = username)
*/

// this is needed to get input from user 
import java.util.Scanner;

public class CreateUsers {

	// private data 
	private String userName; 
	private String password; 
	private String name; 
	
	// public methods 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateUsers Ironman      = new CreateUsers("IronManOrig", "SexyPhilanthropist82", "Tony Stark");
		CreateUsers BlackPanther = new CreateUsers("NewPanther", "556Slays", "Kilmonger");
		
		BlackPanther.showUserName();
		BlackPanther.setUserName("ClassicPanther"); 
		
		BlackPanther.showPassword();
		BlackPanther.setPassword("Wakanda2018"); 
		
		BlackPanther.showUserName();
		BlackPanther.setName("T'Challa");

	}

	public CreateUsers(String userName, String password, String name) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		
		System.out.println("New user created!"); 
		System.out.println("Username: " + userName); 
		System.out.println("Password: " + password); 
		System.out.println("Name: " + name + "\n"); 
	}

	public String getUserName() {
		return userName;
	}

	public void showUserName() {
		System.out.println("Current Username: " + userName); 
	}
	
	public void setUserName(String userName) {
		System.out.println("Changing Username..."); 
		this.userName = userName;
		System.out.println("New Username: " + userName + "\n"); 
	}

	public String getPassword() {
		return password;
	}

	public void showPassword() {
		System.out.println("Current Password: " + password); 
	}
	
	public void setPassword(String password) {
		System.out.println("Changing Password..."); 
		this.password = password;
		System.out.println("New Password: " + password + "\n"); 
	}

	public String getName() {
		return name;
	}

	public void showName() {
		System.out.println("New Name: " + name); 
	}
	
	public void setName(String name) {
		System.out.println("Changing Name..."); 
		this.name = name;
		System.out.println("New Name: " + name + "\n"); 
	}

}
