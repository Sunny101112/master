import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {

		/**
		 * Prior Java 8
		 */

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("Comparator result : " + comparator.compare(3, 2));
		
		
		/*Comparator<Integer> comparator1 = (Integer o1, Integer o2)-> {
			return o1.compareTo(o2);
		};*/
		
		// Comparator<Integer> comparator1 = (Integer o1, Integer o2)-> o1.compareTo(o2);
		
		Comparator<Integer> comparator1 = (o1, o2)-> o1.compareTo(o2);
		
		System.out.println("Comparator result using lambda : " + comparator1.compare(3, 2));
	}

}
