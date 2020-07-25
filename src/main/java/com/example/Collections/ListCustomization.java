package com.example.Collections;


public class ListCustomization {

	public static void main(String[] args) 
    {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
        CustomList<Integer> list = new CustomList<Integer>(a);
 
        //Initial List
        System.out.println("Custom List :");
        System.out.println(list);
        
        //Add elements
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println("The list elements are :");
        System.out.println(list);
         
        //Remove elements from index
        list.remove(2);
        System.out.println("List after removing element at index 2 : ");
        System.out.println(list);
         
        //Get element with index
        System.out.println("Getting the elemtent from the list at index 0 : "+ list.get(0) );
        System.out.println("Getting the elemtent from the list at index 1 : "+ list.get(1) );
 
        //List Size
        System.out.println("Size of list is : "+list.size());
    }
}
