package dykim.algorithm.dataStructure;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapStructure {
	public static void main(String[] args){
		//hashMapType();
		hashTableType();
	}
	
	public static void hashMapType(){
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
	    System.out.println(map);
	    Set<String> set1 = map.keySet();
	    for(String k:set1){
	        Integer v = (Integer) map.get(k);
	        System.out.println("Key:"+k+"/Value:"+v);
	    }
	}
	
	public static void hashTableType(){
		Hashtable<String, Integer> hashT = new Hashtable<String, Integer>();
		 
	    hashT.put("A", 1);
	    hashT.put("B", 2);
	    hashT.put("C", 3);
	    hashT.put("D", 4);
	    System.out.println(hashT);
	     
	    Scanner input = new Scanner(System.in);
	    System.out.print("KEY 입력 =>");
	    String key = input.nextLine();
	    Integer num = hashT.get(key);
	    System.out.println(key+"//"+num);

	}
}
