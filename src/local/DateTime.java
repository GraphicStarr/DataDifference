package local;

import java.time.LocalDateTime;

/**
 * @author student
 *
 */
public class DateTime {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime date = LocalDateTime.now();
		
		
		System.out.println("\nIt is now" + date);
		
		date = date.withYear(2018);
		System.out.println("Date is now" + date);
		

			
			
		}

		

	}


