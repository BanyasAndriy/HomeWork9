package HomeWork9.Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat.Field;

public class OwnStack {
	
	private Object[] arrayObj;
	private int maxLength;
    private int index = -1;
    private BlackList blackList;

    public OwnStack(int maxLength,BlackList blackList) {
    	this.maxLength=maxLength;
    	arrayObj = new Object[maxLength];
    	this.blackList=blackList; 
	}
    
	
	
	
	public void push(Object obj) {
		
	
		Class [] blackListOfClass = new Class[blackList.getLength()];
		blackListOfClass=blackList.getListOfClass();
		
		boolean flag=false;
	
		
		for(int i = 0 ; i < blackListOfClass.length;i++) {
		if(blackListOfClass[i]!=null)
			if(obj.getClass()==blackListOfClass[i]) {
        flag=true;
        break;
			}
		}	

		
		
		
		if(index<10) {
		if(flag==false) {
			index++;
		arrayObj[index]=obj;
		}else {
			System.err.println("Обєкт,який ви намагаєтесь добавити у стек належить до класу,який знаходиться у чорному списку!!!\n");
		}
		}else System.out.println("Your stack is full!!!");
	

	}
	
	public Object pop()  {
	
		
		Object returnObject;
		
		if(index<0) {
			return "You stack is empty";
		}else {
			returnObject=arrayObj[index];
			arrayObj[index]=null;
			index--;
		}
		return returnObject;
		
		
		
	}
	
	public Object peek() {
		
		
		return arrayObj[index];
		
	}

	
	
	
	

}
