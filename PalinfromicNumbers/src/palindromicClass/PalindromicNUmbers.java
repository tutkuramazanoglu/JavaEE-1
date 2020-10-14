package palindromicClass;

import java.util.HashMap;

public class PalindromicNUmbers {

	public static void main(String[] args) {
//		long total=0;
//		long result=1;
//		for(int i=1;i<1001;i++) {
//			result=i;
//  			for(int j=0;j<i-1;j++) {
//				result=result*i;				
//			}		
//			total+=result;
//			
//		}
//		System.out.print(total);
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.put("Turkey", "Istanbul");
	    capitalCities.put("Brazil", "San Paolu");
	    
	    for (String i : capitalCities.keySet()) {
	      System.out.println(i);
	    }
	}

}
