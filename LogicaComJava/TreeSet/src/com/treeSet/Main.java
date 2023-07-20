package com.treeSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(7);
		
		System.out.println("Linked tree: " + numeros);
		
		boolean result = numeros.remove(3);
		System.out.println("Removeu? " + result);
		
		result = numeros.removeAll(numeros);
		System.out.println("Removeu? " + result);
	}

}
