package to.msn.wings.selfjava.chap01;

public class CompareArray {
  public static void main(String[] args){
    var data1 = new String[] { "あ", "い", "う" };
    var data2 = new String[] { "あ", "い", "う" };
    System.out.println(data1 == data2);
    System.out.println(data1.equals(data2));
  }
}
