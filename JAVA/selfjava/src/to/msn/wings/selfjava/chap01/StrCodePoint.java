package to.msn.wings.selfjava.chap01;

public class StrCodePoint {
  public static void main(String[] args){
    var str = "叱る";
    System.out.println(str.codePointCount(0,str.length() ));
}
}