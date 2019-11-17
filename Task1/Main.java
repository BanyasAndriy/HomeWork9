package HomeWork3;
import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
	
		Student stud1 = new Student("Андрій","Баняс","Віталійович",17,"NUFT","ACS",3,"KN-3-3"); 
		Student stud2 = new Student("Олег","Микитин","Василійович",21,"NUFT","ACS",3,"KN-3-3"); 
		Student stud3 = new Student("Владислав","Луценко","Анатолійович",17,"NUFT","ACS",3,"KN-3-3"); 
		Student stud4 = new Student("Тарас","Ширшов","Олегович",17,"NUFT","ACS",3,"KN-3-3"); 
		Student stud5 = new Student("Андрій","Кобилянський","Віталійович",20,"NUFT","ACS",3,"KN-3-3"); 
		Student stud6 = new Student("Максим ","Титечко","Віталійович",19,"NUFT","ACS",3,"KN-3-3"); 
		
		Group group = new Group("KN-3-3");
		
		File file = new File("Group.txt");
		
		
		
		
		try {
		group.addStudents(stud1);
		group.addStudents(stud2);
		group.addStudents(stud3);
		group.addStudents(stud4);
		group.addStudents(stud5);
		group.addStudents(stud6);
	
		group.interactiveAddingObject();
		
		
		}catch(ExceptionOfGroup eog) {
			System.out.println(eog.getMessage());
		}
		
		
		
		

		
		
		group.serelization(file);
		System.out.println(group.deseralization(file));
	}

	

}
