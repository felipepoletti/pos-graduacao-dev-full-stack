package pos.practice;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> linguagens = new ArrayList<>();
		
		linguagens.add("Java");
		linguagens.add("CSharp");
		linguagens.add("Python");
		linguagens.add("Javascript");
		
		System.out.println("Array List: " + linguagens);
		
		String[] arr = new String[linguagens.size()];
		
		linguagens.toArray(arr);
		
		System.out.println("Array: ");
		
		for (String item:arr) {
			System.out.println(item + ", ");
		}
	}

}
