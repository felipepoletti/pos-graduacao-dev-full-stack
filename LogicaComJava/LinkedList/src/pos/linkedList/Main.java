package pos.linkedList;
import java.util.LinkedList;

public final class Main {

	public static void main(String[] args) {
		LinkedList<String> animais = new LinkedList<>();
		
		animais.add("Cachorro");
		animais.add("Cavalo");
		animais.add("Papagaio");
		
		System.out.println("Linked list: " + animais);
		
		animais.add(1, "Gato");
		System.out.println("Linked list: " + animais);
	}
}
