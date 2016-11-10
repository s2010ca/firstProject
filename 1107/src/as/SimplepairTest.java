package as;

public class SimplepairTest {

	public static void main(String[] args) {
		SimplePair<String> pair = new SimplePair<String>("apple", "tomato");
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
		SimplePair<Integer> pairInt = new SimplePair<Integer>(3, 4);
		System.out.println(pairInt.getFirst());
		System.out.println(pairInt.getSecond());
	}

}
