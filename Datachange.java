package com.example.studentmanagement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Datachange {
	private List<Student> students = new ArrayList<>();
	
	
	
	
	
	
	
	
	
	public  void addStudent(String name,int no,int age,String gender){
		
	Student student = new Student(name,no,age,gender);
	students.add(student);
	}
	
	
	public void displaystudent(){
		System.out.println("输出学生列表：");
		for(Student student:students) {
			System.out.println("学生的名字是"+student.getName());
			System.out.println("学生的编号是"+student.getNo());
			System.out.println("学生的年龄是"+student.getAge());
			System.out.println("学生的性别是"+student.getGender());
		}
		
	}
	public void deletestudent(int n) {
		Iterator<Student> it = students.iterator();
		
		while(it.hasNext()) {
			Student student = it.next();
			if(student.getNo()==n) {
				it.remove();
			}
			
			
		}
	}
	
	
	
public static void main(String args[]) {
	Datachange system = new Datachange();
	Scanner scan = new Scanner(System.in);
	int no = 0;
	while(true) {
	
		 System.out.println("请选择操作：");
         System.out.println("1. 添加学生");
         System.out.println("2. 显示学生列表");
         System.out.println("3. 删除学生信息");
         System.out.println("4. 退出");
	int choice = scan.nextInt();
	scan.nextLine();
	
	switch(choice) {
	case 1:
		no++;
		System.out.println("请输入学生的姓名");
		String name = scan.nextLine();
		
		
		System.out.println("请输入学生的年龄");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("请输入学生的性别");
		String gender = scan.nextLine();
		system.addStudent(name, no, age, gender);
		break;
	case 2:
		system.displaystudent();
		break;
	case 3:
		System.out.print("请输入要删除的学生的编号");
		no=scan.nextInt();
		scan.nextLine();
		system.deletestudent(no);
		break;
	case 4:
		System.out.print("程序已退出！");
		return;
	default:
		System.out.print("输入错误，请重新输入！");
		break;
	}
	
	
	
	
	
	
	
	
	}
}
}
