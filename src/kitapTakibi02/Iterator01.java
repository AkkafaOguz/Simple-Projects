package kitapTakibi02;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	public static void main(String[] args) {
		
		List<String> list2=new ArrayList<>();
        list2.add("ALI");
        list2.add("veli");
        list2.add("Ayse");
        list2.add("fatma");
        System.out.println(list2);
        
        for (String w : list2) {
			
        	
        	w= w.toUpperCase();
		}
        
        System.out.println(list2);
        
        for (int i = 0; i < list2.size(); i++) {
			
        	list2.set(i, list2.get(i).toUpperCase());
		}
        
        System.out.println(list2);
        
       ListIterator <String> li = list2.listIterator();
       
       while(li.hasNext()) {
    	   
    	   String temp = li.next();
    	   
    	   li.set(temp.toUpperCase());
    	   
       }
        
       System.out.println(list2);
        

	}
	
	

}
