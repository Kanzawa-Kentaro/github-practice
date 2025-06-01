package to.msn.wings.selfjava.chap01;

public class CommandArgs {
  public static void main(String[] args){
    for (var value : args){
      System.out.println("こんにちは、" + value + "さん!");
    }
}
}