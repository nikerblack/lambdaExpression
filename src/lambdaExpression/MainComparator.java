package lambdaExpression;

import java.util.Comparator;

/**
 * @author seralfon1
 *
 */
public class MainComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("workind on");
		Person sergio = new Person("Sergio", "Alfonso", 30);
		Person diego = new Person("Diego", "Fernando", 35);
		
		Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
		
		System.out.println("Imprime "+ cmpAge.compare(diego, sergio));
	}

}
