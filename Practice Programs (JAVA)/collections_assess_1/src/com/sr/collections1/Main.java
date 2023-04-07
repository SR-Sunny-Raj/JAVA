package com.sr.collections1;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		//fill the code here
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of users:");
		int num = input.nextInt();
		input.nextLine();
		HashSet<User> hs = new HashSet<>();
		for(int i=1;i<=num;i++){
			System.out.println("Enter details of user"+i+"\nUsername:");
			String username = input.next();
			input.nextLine();
			System.out.println("Bank name:");
			String bankname = input.nextLine();
			User uObj = new User(username,bankname);
			hs.add(uObj);
		}

		System.out.println("Enter username(Expire in one month) seperated by comma");
		String str = input.next();
		ArrayList<User> arr = new ArrayList<>();
		String[] sarr = str.split(",");
		for(String s:sarr){
			String uname = s;
			User uObj1 = new User(uname,null);
			arr.add(uObj1);
		}




		hs.retainAll(arr);
//		Collections.sort(hs);
		ArrayList<User> ans = new ArrayList<>(hs);
		Collections.sort(ans);
		System.out.println("Users going to expire within a month");
		int count=1;
		for(User obj:ans){
			String uname = obj.getUsername();
			String bname = obj.getBankname();
			System.out.println("User "+count++ +"\nUser Name = "+uname+"\nBank Name = "+bname);
		}



		input.close();
	}
}

