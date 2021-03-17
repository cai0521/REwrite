package bsu.rfe.java.group.rewrite.CAI;

public class Student {
    private String name;
    private String surname;
    private int averageMark;
    private int age;

    public Student(String name,String surname,int age,int averageMark) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.averageMark = averageMark;
    }

    public String getName () {
        return name;
    }
    public String getSurname() {
    	return surname;
    }

    public int getAge () {
        return age;
    }
    
    public int getAverageMark() {
    	return averageMark;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
    	this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setAverageMark (int averageMark) {
    	this.averageMark = averageMark ;
    }

   
    public String toString() {
        String s = "name："+this.name+" \tsurname: "+this.surname+ " \t age："+this.age+
        		" \t averageMark: "+this.averageMark;
        return s;
    }

    public static void main(String[] args) {
    Student p1 = new Student("Jack","Anderson",17,5); 
    System.out.println(p1);
    Student p2 = new Student("Lucy","Ellesh",15,6);
    System.out.println(p2);
    Student p3 = new Student("Jones","Tompson",16,7);
    System.out.println(p3);
    Student p4 = new Student("Rose","Lee", 17,8);
    System.out.println(p4);
    Student p5 = new Student("Jason","White", 20,4);
    System.out.println(p5);
    }
  
}
