package to.msn.wings.selfjava.chap01;

public class StrSubstring2 {
  public static void main(String[] args) {
var mail = "yamada@example.com";
System.out.println(mail.substring(mail.lastIndexOf("@") + 1));
}
}