class Student
{
    private int id;
    private String name;
    private String Department;
    private double gpa;
    public Student(int id,String name,String Department,double gpa)
    {
        this.id=id;
        this.name=name;
        this.Department=Department;
        this. gpa= gpa;
    }
    public int getId()
        {
          return id;
        }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getDepartment()
    {
        return Department;
    }
    public void  setDepartment(String Department){

        this.Department=Department;
    }
    public  double getGpa()
        {
            return gpa;
        }
    public void setGpa(double gpa)
{
    if (gpa >= 0.0 && gpa <= 10) {
        this.gpa = gpa;
    } else {
        System.out.println("Invalid GPA value!");
    }
}
public void Studentdetails(){
        System.out.println("Id"+id);
        System.out.println("Name"+name);
        System.out.println("Department"+Department);
        System.out.println("GPA"+gpa);
}
}

public class Main {
    public static void main(String[] args) {
        Student S = new Student(3014, "BHAVANA", "AI&DS", 9.34);
        S.Studentdetails();
    }
}