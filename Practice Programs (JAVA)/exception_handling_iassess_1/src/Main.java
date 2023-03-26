import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class Main {

	public static void main(String[] args) {
		// your code here
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the stage event start date and end date");
		try{
		String str1 = input.next();
		SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
		Date date1 = sdfrmt.parse(str1);
		String str2 = input.next();
		Date date2 = sdfrmt.parse(str2);
		String stdate = sdfrmt.format(date1);
		String enddate = sdfrmt.format(date2);
		System.out.println("Start date:"+stdate+"\nEnd date:"+enddate);
		
		}catch(ParseException e){
			System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
		}
		input.close();
	}

}
