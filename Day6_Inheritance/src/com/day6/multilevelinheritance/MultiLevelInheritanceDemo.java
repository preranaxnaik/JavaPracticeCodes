//program to demonstrate Multilevel Inheritance
package com.day6.multilevelinheritance;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Prerana",8055329635L);
		System.out.println(p1);
		
		p1 = new Employee("Krushna", 9423694227L,"Comp", 45000d);
		System.out.println(p1);
		
		p1 = new LevelOneEmployee("Sayali", 9356762392L , "IT", 600000d , "Manager", 500);
		System.out.println(p1);

	}

}
