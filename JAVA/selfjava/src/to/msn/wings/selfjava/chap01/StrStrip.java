package to.msn.wings.selfjava.chap01;

public class StrStrip {
public static void main(String[] args){
  var str = "  Wings Project  ";
  System.out.println(str.strip());
  System.out.println(str.stripLeading());
  System.out.println(str.stripTrailing());
}
}
