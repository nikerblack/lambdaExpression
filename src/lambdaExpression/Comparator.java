package lambdaExpression;

@FunctionalInterface
public interface Comparator<T> {

	public int compare(T t1, T t2);
}
