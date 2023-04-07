import com.spring.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)throws IOException {
				Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext factory =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		System.out.println("Enter the number of owners you want to create");
		Integer ownerNumber=Integer.parseInt(br.readLine());
		Owner [] owner=new Owner[ownerNumber];
		for(int i=0;i<ownerNumber;i++) {
			owner[i] =(Owner) factory.getBean("owner");
			System.out.println("Enter the Name and Password of the Owner");
			owner[i].setName(br.readLine());
			owner[i].setPassword(br.readLine());
		}
		
		System.out.println("Enter the number of events you want to create");
		Integer eventNumber=Integer.parseInt(br.readLine());
		Event [] event=new Event[eventNumber];
		for(int i=0;i<eventNumber;i++) {
			event[i]= (Event) factory.getBean("event");
			System.out.println("Enter the  Event name");
			event[i].setEventName(br.readLine());
			System.out.println("Select any option from the list and enter the number");
			for(int j=0;j<ownerNumber;j++) {
				System.out.println((j+1)+")"+owner[j].getName());
			}
			System.out.println("Enter the choice");
			Integer id = Integer.parseInt(br.readLine());
			event[i].setId(i+1);
			event[i].setEventOrganiser(owner[id-1]);
		}
		System.out.println("...Listing events...");
		for(Event e:event) {
			e.display();
		}
	}

}
