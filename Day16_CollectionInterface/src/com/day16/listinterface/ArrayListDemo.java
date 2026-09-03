package com.day16.listinterface;


import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println("Is Empty : "+ list.isEmpty());
		list.add(10);
		list.add(20);
		list.add("Kavita");
		list.add(true);
		list.add("Prerana");
		list.add(23.4f);
		list.add(10);
		list.add(10);
		list.add(null);
		
		System.out.println("List = "+ list);
		System.out.println(list.contains(10));
		list.remove("Kavita");
		list.remove(3);
		System.out.println("List = "+ list);
		System.out.println("Element at location 6 =  "+ list.get(6));
		System.out.println("Element removed : "+ list.remove(6));
		System.out.println("List = "+ list);
		list.clear();
		System.out.println("List = "+ list);
		
		//using generic we can create a Homogenous list for type safety
		
		List<Integer> i = new ArrayList<Integer>();
		i.add(40);
		i.add(10);
		i.add(20);
		i.add(50);
		i.add(30);
		System.out.println("List Before Sorting : "+ i);
		Collections.sort(i);
		System.out.println("List After Sorting  in Ascending Order: "+ i);
		Collections.reverse(i);
		System.out.println("List After Sorting Descending Order: "+ i);
		
		
		
		//Traversing a list
		System.out.println("Traversing a list :");
		
		Iterator<Integer> i1 = i.iterator();
		while(i1.hasNext()){
			int x = i1.next();
			System.out.print(x+" ");
			if( x == 20) {
				i1.remove();
			}
		}
		System.out.println();
		System.out.println("Number = "+ i);
		
		

	}

}
