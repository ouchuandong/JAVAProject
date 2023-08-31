package com.example.studentmanagement;

public class Student {
	private String name;
	private Integer no;
	private Integer age;
	private String gender;
	public Student (String name,Integer no,Integer age,String gender) {
		this.name=name;
		this.no=no;
		this.age=age;
		this.gender=gender;
		
	}
	public String getName() {
        return name;
    }
	public Integer getNo() {
        return no;
    }
	public Integer getAge() {
        return age;
    }
	public String getGender() {
        return gender;
	

}
}
