package as;
import java.util.Vector;
public class VectorTest {

	public static void main(String[] args) {
		Vector vc = new Vector();
		
		vc.add("Hello world");
		vc.add("10");
		vc.add("20");
		System.out.println("Vector size : "+ vc.size());
		
		for(int i = 0; i < vc.size(); i++)
			System.out.println("Vector element" + i +" : " + vc.get(i));

	}

}
