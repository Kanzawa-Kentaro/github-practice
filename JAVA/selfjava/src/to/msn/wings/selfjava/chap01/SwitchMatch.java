package to.msn.wings.selfjava.chap01;

public class SwitchMatch {
public static void main(String[] args){

  Object obj = "あどぁ";

  switch  (obj) {
    case Integer i -> System.out.println(Math.abs(i));

    case String str -> System.out.println(str.substring(0, 1));
    case null -> System.out.println("nullです。");
    default -> System.out.println("意図しない値です。");
  }
}
}