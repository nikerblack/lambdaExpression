package lambdaExpression;

import java.util.function.Function;



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

		System.out.println("COMPARATORD");

		Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
		
		System.out.println("Imprime "+ cmpAge.compare(diego, sergio));
		
		Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFisrtName().compareTo(p2.getFisrtName());
		
		System.out.println("Imprime "+ cmpFirstName.compare(sergio, diego));
		
		Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		
		Function<Person, Integer> f1 = p -> p.getAge();
		Function<Person, String> f2 = p -> p.getFisrtName();
		Function<Person, String> f3 = p -> p.getLastName();
		
		System.out.println("FUNCTION");
		
		System.out.println("F1"+ f1.apply(sergio));
		System.out.println("F1"+ f2.apply(sergio));
		System.out.println("F1"+ f3.apply(sergio));
		
		System.out.println("NEW METHOD with FUNCTION");
		
		Comparator<Person> cmpPerson = Comparator.comparing(f1);
		System.out.println("Imprime "+ cmpPerson.compare(sergio, diego));
		
		System.out.println("NEW METHOD with FUNCTION EXPRESION");
		
		Comparator<Person> cmpPersonTwo = Comparator.comparing(p -> p.getAge());
		System.out.println("Imprime "+ cmpPerson.compare(sergio, diego));
		
		System.out.println("Method Reference");
		Comparator<Person> cmpPersonThree = Comparator.comparing(Person::getAge);
		System.out.println("Imprime "+ cmpPerson.compare(sergio, diego));
		
	}

}
