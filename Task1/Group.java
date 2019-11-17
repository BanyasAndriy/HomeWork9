package HomeWork3;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/*
 * 1)Усовершенствуйте класс Group добавив возможность     интерактивного добавления объекта. 
 * 2)Реализуйте возможность  сортировки списка студентов    по фамилии.
 * 3)Реализуйте возможность сортировки по параметру (Фамилия, успеваемость и т. д.).
 * 4)Реализуйте интерфейс Военком которые вернет из группы    массив студентов юношей которым больше 18 лет
 */
import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voenkom {

	private Student[] studs ;
	
	private String name;
	
	public Group(String name ) {
		this.name = name;
		
	   studs = new Student[10];
	}
	
	public Group() {
		this.name = "group";
		
		studs=new Student[10];
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void addStudents(Student stud){
	   int counter=0;
		
		for (int i = 0; i < this.studs.length; i++) {
			if(studs[i]==null) {
				studs[i]=stud;
				System.out.println("Cтудент " + stud.getLastName() + " " + stud.getName() + " доданий у групу " + this.getName() + "!");
				break;
			}else {
				counter++;
			}
			
		}
		if(counter==10) {
			throw new ExceptionOfGroup();
		}
	
		
	}
	
	
	
	
	public void interactiveAddingObject() {
		
		String name;
		String lastName ;
		String surName ;
		int age;
		String nameOfUniversity;
		String faculty;
		int course;
		String group;
		
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Введіть назву університета : ");
		    nameOfUniversity=scan.nextLine();
		    
		System.out.println("Введіть імя студента: ");
		name= scan.nextLine();
		
		System.out.println("Введіть прізвище студента: ");
	    lastName=scan.nextLine();
	    
	    System.out.println("Введіть по-батькові студента : ");
	    surName=scan.nextLine();
	    
	    System.out.println("Введіть вік студента ");
	    age=scan.nextInt();
	    
	    System.out.println("Введіть факультет : ");
	    faculty=sc.nextLine();
	    
	    System.out.println("Введіть курс :");
	    course=scan.nextInt();
	    
	    System.out.println("Введіть групу :");
	    group=sc.nextLine();
	    
	    
		
		
		
		Student stud = new Student(name,lastName,surName,age,nameOfUniversity,faculty,course,group);
				
		
		addStudents(stud);
		
		
	}
	
	
	
	public void deleteStudents(Student stud) {
		
		for (int i = 0; i < studs.length; i++) {
		if(studs[i]!=null) {
			if(studs[i].equals(stud)) {
				studs[i]=null;
				System.out.println("Студент " + stud.getLastName() + " " + stud.getName() + " вилучений з групи!");
				break;
			}
		}
		}
	
	}
	
	public Student searchStudent(String lastName){
		Student stud=null;
		for (int i = 0; i < studs.length; i++) {
		
			if(studs[i]!=null) {
				if(studs[i].getLastName().equals(lastName)) {
					stud=studs[i];
					break;
				}	
			}
		}
		
		
		return stud;
	}
	

	
	@Override
	public String toString() {
	
		System.out.println(" Група : " + this.getName());
	
		
		 for(int i = 0; i<studs.length; i++) {
	         for (int j = i+1; j<studs.length; j++) {
	          
	        	 if(studs[i]!=null && studs[j]!=null) {
	        	 if(studs[i].getLastName().compareTo((studs[j].getLastName()))>0) {
	               Student temp = studs[i];
	               studs[i] = studs[j];
	               studs[j] = temp;
	            }
	         }
	      }
		 
		 }
		 
	   
	int count=1;
		 for (int i = 0; i < studs.length; i++) {
			 if(studs[i]!=null) {
			 System.out.println( count + ")" + "ПІБ: " + studs[i].getLastName()+" " + studs[i].getName() + " " +studs[i].getSurName()  +  "\n Вік:" + studs[i].getAge() + " \n Факультет: " + studs[i].getFaculty() + "\nУніверситет: " + studs[i].getNameOfUniversity()+ " \n Група: " + studs[i].getGroup());
		count++;
			 }}
		 
		 
		return ".";
		
		
	}
	
	
	
public void sortByParametr() {
	
	int parametr;
	Scanner scan = new Scanner(System.in);
	System.out.println("Введіть 1 - для сортування за іменем \n 2 - для сортування за прізвищем \n 3 - для сортування за віком ");
	parametr=scan.nextInt();
	
	
	switch (parametr) {
	case 1:
		sortByName();
		break;
    
	case 2 :
		toString();
		break;
		
	case 3:
		sortByAge();
		break;
			
		
	}
	
	
	}


	
	public void sortStudentsByLastName() {
	System.out.println("Сортування по прізвищу: ");
	toString();	
		
	}
			

	
	
		
	
    public void sortByName() {
    	System.out.println("Cортировка по імені ");
    	 for(int i = 0; i<studs.length; i++) {
	         for (int j = i+1; j<studs.length; j++) {
	          
	        	 if(studs[i]!=null && studs[j]!=null) {
	        	 if(studs[i].getName().compareTo((studs[j].getName()))>0) {
	               Student temp = studs[i];
	               studs[i] = studs[j];
	               studs[j] = temp;
	            }
	         }
	      }
		 
		 }
		 
	   
	int count=1;
		 for (int i = 0; i < studs.length; i++) {
			 if(studs[i]!=null) {
			 System.out.println( count + ")" + "ПІБ: " + studs[i].getName()+" " + studs[i].getLastName() + " " +studs[i].getSurName()  +  "\n Вік:" + studs[i].getAge() + " \n Факультет: " + studs[i].getFaculty() + "\nУніверситет: " + studs[i].getNameOfUniversity()+ " \n Група: " + studs[i].getGroup());
		count++;
			 }}
		 	
    	
    	
    }

    public void sortByAge() {
    	
    	System.out.println("Cортировка по віку ");
      	 
    	
    	
    	
    	for(int i = 0; i<studs.length; i++) {
	         for (int j = i+1; j<studs.length; j++) {
	          
	        	 if(studs[i]!=null && studs[j]!=null) {
	        	 if(studs[i].getAge()>studs[j].getAge()) {
	               Student temp = studs[i];
	               studs[i] = studs[j];
	               studs[j] = temp;
	            }
	         }
	      }
		 
		 }
		 
	   
	int count=1;
		 for (int i = 0; i < studs.length; i++) {
			 if(studs[i]!=null) {
			 System.out.println( count + ")" + "ПІБ: " + studs[i].getName()+" " + studs[i].getLastName() + " " +studs[i].getSurName()  +  "\n Вік:" + studs[i].getAge() + " \n Факультет: " + studs[i].getFaculty() + "\nУніверситет: " + studs[i].getNameOfUniversity()+ " \n Група: " + studs[i].getGroup());
		count++;
			 }}
		 	
    
    	
    }

	@Override
	public Student[] getStudentsToVoenkom() {
		
		System.out.println("Студенти ,яким потрібно відвідати військомат!");
		int count=0;



		Student[] studToVoenkom = new Student[10];
		int pos=0;
		for (int i = 0; i < studToVoenkom.length; i++) {
			if(studs[i]!=null) {
			
			if(studs[i].getAge()>18) {	
				studToVoenkom[pos]=studs[i];
				pos++;
			}
			
			
		}}	
		
		return studToVoenkom;
		
	}

   
    public void serelization(File file) {
    	
    	try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
    	    
        	
       
        	
        	for(int i = 0; i< studs.length;i++) {
        		if(studs[i]!=null) {
        			
        			outputStream.writeUTF(studs[i].getLastName());
        			outputStream.writeUTF(studs[i].getName());
        			outputStream.writeUTF(studs[i].getSurName());
        			outputStream.writeInt(studs[i].getAge());
        			outputStream.writeUTF(studs[i].getFaculty());
        			outputStream.writeUTF(studs[i].getNameOfUniversity());
        			outputStream.writeInt(studs[i].getCourse());
        			outputStream.writeUTF(studs[i].getGroup());
        			
        			
        		}
        	}
        		
    		 
    		System.out.println("Групу записано у файл : " + file.getName());
    		
    		
				} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    
    public Group deseralization(File file) {
    	Group gr = new Group();
		String name = null;
		String lastName = null ;
		String surName ;
		int age;
		String nameOfUniversity;
		String faculty;
		int course;
		String group;
    	try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))){
			
    		
    		
    		 for (int i = 0; i < studs.length; i++) {
    			 if(studs[i]!=null) {
    			
    			
			lastName=reader.readUTF();  
			name=reader.readUTF();
			surName=reader.readUTF();
			age=reader.readInt();
			faculty=reader.readUTF();
			nameOfUniversity=reader.readUTF();
			course=reader.readInt();
			group=reader.readUTF();
    				
gr.addStudents(new Student(name,lastName,surName,age,nameOfUniversity,faculty,course,group));
    			
    			 }
    			 }
    		return gr;
    		
    		
    		
    		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	
    	//System.out.println("Last name " + lastName +" "+name);
    	return null;
    }
   
	
	
	
	
	
	
}
