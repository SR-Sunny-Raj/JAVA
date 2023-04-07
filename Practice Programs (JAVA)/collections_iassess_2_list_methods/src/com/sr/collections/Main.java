package com.sr.collections;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of User details to be added");
		int num = input.nextInt();
		input.nextLine();
		UserBO uObj = UserBO.getList();
		ArrayList<User> arr = new ArrayList<>();
		for(int i=1;i<=num;i++) {
			System.out.println("Enter the user "+i+" detail in csv format");
			String str = input.nextLine();
			String[] sarr = str.split(",");
			arr.add(new User(sarr[0],sarr[1],sarr[2],sarr[3]));
		}
		
		uObj.addAll(arr);
		System.out.printf("%-20s%-20s%-20s%-20s\n","Name","Contact Number","Username","Email");
		for(User o:uObj) {
			o.display();
		}
		
		System.out.println("Enter the range to be removed from array list");
		int n1= input.nextInt();
		int n2=input.nextInt();
		
		uObj.removeUser(n1,n2);
		System.out.printf("%-20s%-20s%-20s%-20s\n","Name","Contact Number","Username","Email");
		for(User o:uObj) {
			o.display();
		}
		input.close();
	}

}
