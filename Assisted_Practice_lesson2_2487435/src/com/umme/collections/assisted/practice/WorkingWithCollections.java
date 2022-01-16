package com.umme.collections.assisted.practice;
import java.util.*;
public class WorkingWithCollections {

public static void main(String[] args) 
    {
	  
      System.out.println("ArrayList");
      ArrayList<String> learner=new ArrayList<String>(); 
      learner.add("UMME");//
      learner.add("HANI"); 
      System.out.println(learner); 
      
      
      System.out.println("\n");
      System.out.println("Vector");
      Vector<Integer> vec = new Vector();
      vec.addElement(123); 
      vec.addElement(456); 
      System.out.println(vec);
      
      
      System.out.println("\n");
      System.out.println("LinkedList");
      LinkedList<String> domain=new LinkedList<String>(); 
      domain.add("FSD"); 
      domain.add("Data base"); 
      
      Iterator<String> itr=domain.iterator(); 
      while(itr.hasNext()){ 
      System.out.println(itr.next()); 
 
      
      System.out.println("\n");
      System.out.println("LinkedHashSet");
      LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>(); 
      set2.add(25); 
      set2.add(35); 
      set2.add(45); 
      System.out.println(set2);
      
    
      System.out.println("\n");
      System.out.println("HashSet");
      HashSet<Integer> set=new HashSet<Integer>(); 
      set.add(1); 
      set.add(2); 
      set.add(3);
      System.out.println(set);
      } 
   } 
}
