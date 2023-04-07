package com.sr.collections;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of address:");
		int num = input.nextInt();
		input.nextLine();
		ArrayList<Address> arr = new ArrayList<>();
		for(int i=0;i<num;i++) {
			System.out.println("Enter the address:");
			String str = input.nextLine();
			String[] sarr = str.split(",");
			arr.add(new Address(sarr[0],sarr[1],sarr[2],sarr[3]));
		}
		
		
		
		
		HashMap<String,Integer> hm1 = new HashMap<>();
		for(Address o1:arr) {
			int count=0;
			if(hm1.containsKey(o1.getCity())) {
				continue;
			}else {
				for(Address o2:arr) {
					if(o1.getCity().equals(o2.getCity())) {
						count++;
					}
				}
			}
			hm1.put(o1.getCity(), count);
		}
		
		
		
		
		HashMap<String,HashMap<String,Integer>> hm2 = new HashMap<>(); 
		for(Address o1:arr) {
			HashMap<String,Integer> hmAdd = new HashMap<>();
			if(hm2.containsKey(o1.getState())) {
				continue;
			}else {
				for(Address o2:arr) {
					if(o1.getState().equals(o2.getState())) {
						if(hmAdd.containsKey(o2.getCity())) {
							continue;
						}else {
							String str = o2.getCity();
							int n = hm1.get(o2.getCity());
							hmAdd.put(str, n);
						}
					}
				}
			}
			hm2.put(o1.getState(), hmAdd);
		}
		
		
		
		
		
		
		
		System.out.println("Number of entries in city/state wise:\n");
		for(HashMap.Entry<String, HashMap<String,Integer>> entry : hm2.entrySet()){
			String str = entry.getKey();
			System.out.println("State:"+str);
			HashMap<String,Integer> hmAns = entry.getValue();
			for(HashMap.Entry<String, Integer> entry1 : hmAns.entrySet()) {
				System.out.println("City:"+entry1.getKey()+" Count:"+entry1.getValue());
			}
			System.out.println();
		}
		
		
		input.close();
	}

}
