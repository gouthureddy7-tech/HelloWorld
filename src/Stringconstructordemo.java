public class Stringconstructordemo {
    public static void main(String[] args) {
		
String strLiteral="Hey,Acharya";
System.out.println("String created using stringliteral:"+strLiteral);

char[] charArray= {'a','c','h','a','r','y','a'};
String strFromArray=new String(charArray);
System.out.println("String created using a characterarray:"+strFromArray);

String StrFromArraySubset=new String(charArray,0,3);
System.out.println("String is created using a subset of charcter array:"+StrFromArraySubset);

String originalstr="information science and enginering";
String copiedStr=new String(originalstr);
System.out.println("String created from another string:"+copiedStr);

StringBuilder stringbuilder=new StringBuilder("acharya");
String StrFromBuilder=new String(stringbuilder);
System.out.println("string creating using a stringbuilder:"+StrFromBuilder);

byte[] byteArray= {65,99,104,97,114,121,97};
String StrFromByteArray=new String(byteArray);
System.out.println("string creating used a byte array:"+StrFromByteArray);
	}

}
