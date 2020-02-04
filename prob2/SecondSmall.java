package prob2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class SecondSmall {

		public static <T> T secondSmallest(List<T> list){

			List<T> l=list.stream().sorted().collect(Collectors.toList());

			return l.get(1);

		}

		public static void main(String[] args) {

			// TODO Auto-generated method stub

			List<Integer> intlist= Arrays.asList(4,5,7,9,2); 
			List<Character> charlist= Arrays.asList('a','b','c','d','e'); 
			
			System.out.println("Second Smallest Integer: "+secondSmallest(intlist));
			System.out.println("Second Smallest Character: "+secondSmallest(charlist));
			

		}



	}
	

