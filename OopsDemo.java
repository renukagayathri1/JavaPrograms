package new2;
//Encapsulation

class Student
{
private	int id;
public void setId(int a)
{
	id =a;
}
public int getId()
{
	return id;
}
	private String name;
}
public class OopsDemo {
public static void main(String[] args)
{
	Student obj = new Student();
		obj.setId(6);
		System.out.println(obj.getId());
		
	}

}
