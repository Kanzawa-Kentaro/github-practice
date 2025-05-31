package to.msn.wings.selfjava.chap01;

public class CompareStringBuilder {
  public static void main(String[] args){
    var builder1 = new StringBuilder("あいう");
    var builder2 = new StringBuilder("えお");
    System.out.println(builder1 === builder2);
  }
}
