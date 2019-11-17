package HomeWork9.Task2;

public class BlackList {
	
	private Class[] cl;
	private int index = 0;
	private int length;
	
	
	public BlackList(int length) {
		this.length=length;
		cl = new Class[length];
	}
	

	public int getIndex() {
		return index;
	}

	public int getLength() {
		return length;
	}

	public Class[] getListOfClass() {
		return cl;
	}
	
	
	
	public void AddClasstoBlackList(Class cll) {
		cl[index++]=cll;
	}
	
	
	public void showListOfTabooClass() {
		for (Class class1 : cl) {
		if(class1!=null)
			System.out.println(class1);
		}
	}
	
	
	
	public void check(Object obj) {
	
		for (Class class1 : cl) {
			if(obj.getClass()==class1) {
				System.out.println("Об'єкт належить до класу,який входить у чорний список!!!");
			break;
			}else {
				System.out.println("Клас якому належить даний  об'єкт не входить до чорного списку!");
				break;
			}
		}
		
		
	}
	

}
