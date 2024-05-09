package assign11;

public class StringIndexOutOfBound {
 public void stringIndexOutOfBound(String str, int i) throws StringIndexOutOfBoundsException
 {
   try{System.out.println(str.charAt(i));}
   catch(Exception e){
    System.out.println("Since the index is not in range so we get the StringIndexOutOfBoundException ");
   }
 }
}
