package com.example.Collections;

public class CustomList<T> {

	private int size = 10;
    private static final int DEFAULT_CAPACITY = 10000 * 10000;
    private Object elements[]=new Object[DEFAULT_CAPACITY];
    public CustomList(int a[]) {
    	
    	for(int i=0;i<10;i++)
    	{
    		elements[i]=a[i];
        }
    }
    
    //Add method
    public void add(int e) {
        elements[size++] = e;
    }
     
    //Get method
    public T get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (T)elements[i];
    }
     
    //Remove method
    public T remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
        return  (T)item;
    }
     
    //Get Size of list
    public int size() {
        return size;
    }
     
    //Print method
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i]);
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
}
