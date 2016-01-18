package dykim.algorithm.dataStructure;

public class ArrayAndString {
	
	public static void main(String[] args){
		Object obj = new Object();
		//obj = isUniqueChars("abcc");
		obj = isUniqueChars2("abcc");
		System.out.println(obj);
	}
	
	/**
	 * 문자열에 포함된 문자열이 유일한지 검사하는 알고리즘
	 * 시간복잡도 O(n), 공간복잡도O(1)
	 * */
	public static boolean isUniqueChars2(String str){
		if(str.length() > 256){
			return false;
		}
		boolean[] char_set = new boolean[256];
		int strSize = str.length();
		
		for(int i=0; i < strSize; i++){
			int val = str.charAt(i); 
			System.out.println("i :"+i+"   val:"+val+ "   char_set[val] :"+char_set[val]);
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	/**
	 * 문자열에 포함된 문자열이 유일한지 검사하는 알고리즘
	 * 시간복잡도 O(n*2), 공간복잡도O(1)
	 * 가정 문자열 허용범위 a~z
	 * */
	public static boolean isUniqueChars(String str){
		if(str.length() > 256){
			return false;
		}
		
		int strSize = str.length();
		int checker = 0;
		
		for(int i=0; i < strSize; i++){
			int val = str.charAt(i) - 'a'; 
			//System.out.println("i :"+i+"   val:"+val+ "   checker :"+checker+"   str.charAt(i)"+str.charAt(i));
			if((checker & (1 << val))  > 0){
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
	
	/** 
	 * 문자열 뒤집기
	 * */
	public static String reverse(String str){
		String reverseString; 
		return null;
	}
	
	
	
}
