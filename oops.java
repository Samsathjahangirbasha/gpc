
import java.util.ArrayList;
import java.util.Scanner;
abstract class person{
	private String name;
	private int age;
	person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	abstract String getrole();
}
class student extends person
{
   private String grade;
   private int studId;
   student(String name, int age, String grade, int studId){
        super(name,age);
        this.grade=grade;
        this.studId=studId;
   }
   public void setgrade(String grade) {
	   this.grade=grade;
   }
   public String getgrade(){
	   return grade;
   }
   public void setstudId(int studId) {
	   this.studId=studId;
   }
   public int getstudId() {
	   return studId;
   }
   String getrole() {
	   return "I am a student";
   }
}
class teacher extends person
{
	private String sub;
	private int teachId;
	private int exe;
	teacher(String name, int age, String sub, int teachId, int exe){
		super(name,age);
		this.sub=sub;
		this.teachId=teachId;
		this.exe=exe;
	}
	public void setsub (String sub){
		this.sub=sub;
	}
	public String getsub(){
		return sub;
	}
	public void setteachId(int teachId){
		this.teachId=teachId;
	}
	public int getteachId(){
		return teachId;
	}
	public void setexe(int exe)
	{
    	this.exe=exe;
	}
	public int getexe(){
		return exe;
	}
	String getrole()
	{
		return "I am a teacher";
	}
}
class seniorteacher extends teacher
{
  seniorteacher(String name, int age, String sub, int teachId, int exe){
     super(name,age, sub, teachId,exe);
     }
     String getrole(){
    	 return "I am a senior teacher";
     }
}
class oops {
    public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		ArrayList <person> per = new ArrayList<>();
		System.out.println("enter stud count");
		int studcount=obj.nextInt();
		obj.nextLine();
		for(int i=0;i<studcount;i++)
		{
			System.out.println("enter stud name");
			String name=obj.nextLine();
			System.out.println("enter stud age");
			int age=obj.nextInt();
			obj.nextLine();
			System.out.println("enter stud grade");
			String grade=obj.nextLine();
			System.out.println("enter studid");
			int studId=obj.nextInt();
			obj.nextLine();
			per.add(new student(name,age, grade, studId));
		}
		System.out.println("enter teach count");
		int teachcount=obj.nextInt();
		obj.nextLine();
		for(int i=0;i<teachcount;i++){
			System.out.println("enter teach name");
			String name=obj.nextLine();
			System.out.println("enter teach age");
			int age=obj.nextInt();
			obj.nextLine();
			System.out.println("enter teach sub");
			String sub=obj.nextLine();
			System.out.println("enter teachdid");
			int teachId=obj.nextInt();
			System.out.println("enter teachexe");
			int exe=obj.nextInt();
			obj.nextLine();
			if(exe<3){
				per.add(new teacher (name,age, sub, teachId,exe));
			}
			else {
				per.add(new seniorteacher (name,age, sub, teachId,exe));
			}
		}
	    System.out.println("printing school members list");
	    for(person member:per) {
	    	System.out.println("name:"+member.getname()+" "+"age:"+member.getage()+"-"+member.getrole());
	    }
	}
    
}

