package to.msn.wings.selfjava.chap01;

public class SwitchWhen {
public static void main(String[] args) {
  Object obj ="";

  switch (obj){
    case Integer i when i >= 15 -> System.out.println("15以上の整数です。");
    case Integer i -> System.out.println("整数です。");
    case String str when str.length() < 10 -> System.out.println("10文字未満の文字列です。");
    default -> System.out.println("意図しない型です。");
  }
}
}
