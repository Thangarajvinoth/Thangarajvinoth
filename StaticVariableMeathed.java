package staticvariable;
import java.util.Scanner;
class Employee{
	private int eid;
	private String ename;
	private static String  cname;
	static {
		cname="Edubridge india";
		
	}
	public void inputEmployee() {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name");
			ename=sc.nextLine();
			System.out.println("Enter eid");
			eid=sc.nextInt();
			
		}
	public void empDetails() {
		System.out.println("Name="+ename);
		System.out.println("ID="+eid);
		System.out.println("Cname="+cname);
		
	}
	}
public class StaticVariableMeathed {

	public static void main(String[] args) {
		
Employee eob[]=new Employee[3];
for(int i=0; i<eob.length;i++) {
	eob[i]=new Employee();
	eob[i].inputEmployee();
}
System.out.println("All Employee");
	}

}
