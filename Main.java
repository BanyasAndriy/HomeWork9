package HomeWork3;
import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
	
		Student stud1 = new Student("�����","�����","³��������",17,"NUFT","ACS",3,"KN-3-3"); 
		Student stud2 = new Student("����","�������","����������",21,"NUFT","ACS",3,"KN-3-3"); 
		Student stud3 = new Student("���������","�������","�����������",17,"NUFT","ACS",3,"KN-3-3"); 
		Student stud4 = new Student("�����","������","��������",17,"NUFT","ACS",3,"KN-3-3"); 
		Student stud5 = new Student("�����","������������","³��������",20,"NUFT","ACS",3,"KN-3-3"); 
		Student stud6 = new Student("������ ","�������","³��������",19,"NUFT","ACS",3,"KN-3-3"); 
		
		Group group = new Group("KN-3-3");
		
		File file = new File("Group.txt");
		
		
		
		
		try {
		group.addStudents(stud1);
		group.addStudents(stud2);
		group.addStudents(stud3);
		group.addStudents(stud4);
		group.addStudents(stud5);
		group.addStudents(stud6);
	
		//group.interactiveAddingObject();
		
		
		}catch(ExceptionOfGroup eog) {
			System.out.println(eog.getMessage());
		}
		
		
		
		
		//System.out.println(group);
		
/*		for (Student stud : group.getStudentsToVoenkom()) {
			if(stud!=null)
			System.out.println(stud);
		}*/
		
		
		
		group.serelization(file);
		System.out.println(group.deseralization(file));
	}

	

}
