package DemoCode.DemoCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] intValues = {23,12,32,431,12};
		Set<Integer> intNUm = new HashSet<>();
		for(int i=0;i<intValues.length;i++) {
			intNUm.add(intValues[i]);
			
		}
		Iterator<Integer> it =intNUm.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
