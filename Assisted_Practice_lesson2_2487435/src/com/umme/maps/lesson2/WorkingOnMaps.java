package com.umme.maps.lesson2;
import java.util.*;
public class WorkingOnMaps {
public static void main(String[] args) {
HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
hm.put(11,"hani"); 
hm.put(16,"Abrar"); 

System.out.println("\nThe elements of Hashmap are "); 
for(Map.Entry m:hm.entrySet()){ 
System.out.println(m.getKey()+" "+m.getValue()); 
} Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 

ht.put(22,"Rafeeq Ahmed"); 
ht.put(27,"Almas Banu");
ht.put(30,"Saddam Hussain");
ht.put(23,"Mohammed Ateeq");
System.out.println("\nHashTable elements : "); 
for(Map.Entry n:ht.entrySet()){ 
System.out.println(n.getKey()+" "+n.getValue()); 
}

TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
map.put(23,"Mohammed Ibrahim"); 
map.put(14,"Sabira Sheikh");
map.put(18,"Sana Sheikh");
map.put(78,"Heena Sheikh");
map.put(72,"Khattab Hussain Sheikh");

System.out.println("\n TreeMap Elements : "); 
for(Map.Entry l:map.entrySet()){ 
System.out.println(l.getKey()+" "+l.getValue()); 
} 
}}