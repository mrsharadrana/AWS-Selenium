package test;

public class StringJava {

/*	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String first = "sachin";
		string(first);
System.out.println("Name from string "+first);
	
	StringBuilder str2 = new StringBuilder("Sachin");
	stringBuilder(str2);
	System.out.println("Name from String Builder "+str2);
	
	StringBuffer str3 = new StringBuffer("Sachin");
	stringBuffer(str3);
	System.out.println("Name from String buffer :- "+str3);
	}

	public static void string(String first) {
	first.concat("Tendulkar");

	}
	public static void stringBuilder(StringBuilder str2) {
		str2.append("Tendulkar");
	
	}
	public static void stringBuffer(StringBuffer str3) {
		str3.append("Tendulkar");
	}
}
*/
/*	public static void main (String[] args) {
//		StringBuilder builder = new StringBuilder("Hello");
//		builder.append(" India");
//		System.out.println("Output :- "+builder);
//		StringBuffer buffer = new StringBuffer("Hello");
//		buffer.append(" Hyderabad");
//		System.out.println("Output:- "+buffer);
		String Str1 = "Hello";
		String Str2 = "Balaji";
		 Str1.concat(Str2) ;
		System.out.println(Str1);
	}
	public static void string() {
		
	}
*/
public static void main (String[] args) {

	//SOCH =String Object Creation Heap
	//SCP = String Constant Pool
	/*
 * This is String Object Approach :- In this We will Declare String Using new Operator Works on Heap
 */
	//When we use this approach it First it will create new object in HEAP and unique object in SCP as a backup/Future Use.
	String s1 = new String("Sharad");//false
	String s2 = new String("Sharad");//true

	System.out.println(s1 == s2);//In String '==' will do comparison of reference/address.
	
	System.out.println(s1.equals(s2));//In String .equals method by default is '==' but string is special case and overriden by Comparison of Content.
	//When we use New Object Approach :- Every time in Heap it will create new object but in SCP first it will check with Object value if not present then only it will create.
	
	/*
	 * This is String Literal Approach :- In this We will Declate String Diectly ,Works on SCP
	 */
	String str1 = "Sharad";
	String str2 = "Sharad";
	
	System.out.println("*********************");
	System.out.println(str1==str2);//true
	System.out.println(str1.equals(str2));//true
	//When we Use String Literal :- First it will Check with object Value already exists in SCP or not if yes then it point to it without creating new objects in SCP or else create a new.
	//Return True here because in SCP str1 and str2 both are point to same reference/address
	
	System.out.println("*************String Object Approach with Concat");
	String str5 = new String("Sharad");// 1 Object in Heap(Sharad) and 1 in SCP(Sharad)
	str5.concat("Rana");//1 object in Heap(Sharadrana) and 1 in SCP (Rana)
	str5 = str5.concat("Ji");//1 object in Heap (SharadjJi) and 1 in SCP (Ji)
	System.out.println(str5);//Now str5 Pointing to SharadJi and rest object will be taken care by Garbage Collector in Heap and in SCP we will have all objects
	
	/*
	 * With StringBuffer
	 */
	StringBuffer str3 = new StringBuffer("Sharad");
	StringBuffer str4 = new StringBuffer("Sharad");
	System.out.println("**********************");
	System.out.println(str3 == str4);
	System.out.println(str3.equals(str4));
	
}

}
	