package HomeWork9.Task2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
	
		BlackList blackList = new BlackList(10);
		OwnStack stack = new OwnStack(10,blackList);
	Animals animal = new Animals("Cat");
		Cars bmw = new Cars(2016,"BMW");
		
		stack.push("Lol");
		stack.push("Kek");
		blackList.AddClasstoBlackList(Cars.class);
		
		stack.push(bmw);
		stack.push(animal);
	
		
		System.out.println("Метод peek(): " + stack.peek());
	System.out.println("Метод peek(): " +stack.pop()) ;
	System.out.println("Метод peek(): " +stack.pop());	
		
			
	}

}
