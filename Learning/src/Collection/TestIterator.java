package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> itr = new ArrayList<>();
		itr.add("sri");
		itr.add("raj");
		itr.add("kumar");
        itr.add("goutham");
        itr.add("abhi");
        
		List<String> itr3 = new ArrayList<>();
		itr3.add("sri");
		itr3.add("raj");
		itr3.add("kumar");
        itr3.add("goutham");
        itr3.add("abhi");
        
        
        Iterator<String> iterator = itr.iterator();
        while(iterator.hasNext()) {
        	String name = iterator.next();
        	if(name.equals("kumar")){
        		iterator.remove();
        	}
        	
        }
        itr.forEach(elm-> System.out.println(elm)
         );

        ListIterator<String> itr4 = itr3.listIterator();
        while(itr4.hasNext()) {
        	String name = itr4.next();
        	if(name.equals("kumar")) {
        	itr4.set("kumar dev");
        	itr4.add("tets");
        	//itr4.remove();
        	}
        	        }
        
        System.out.println("itr2 "+ itr3);
//        while(itr4.hasPrevious()) {
//            System.out.println(itr4.previousIndex());
//            itr4.previous();
//        }
////        
//        int count =0;
//        while(itr4.hasNext() ) {
//      
//        	itr4.add("kumar test");
//        	itr4.next();
//        //	count ++;
//        	}
//        System.out.println("last one "+itr3);
//        while(itr4.hasPrevious()) {
//        System.out.println("previous"+itr4.previous());
//        }
        
        
        
        //concurrent modification exception you are try to remove element outside iterator  - modcpunt
//        for(String str : itr) {
//        	if(str.equals("abhi")) {
//        		itr.add("abhishek");
//        	}
//        }

     Consumer<String> st = name -> System.out.println(name);
     st.accept("sriganth");
	}

}
