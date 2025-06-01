package to.msn.wings.selfjava.chap01;

public class SwitchEXP {
public static void main(String[] args) {
  var drink = "ビール";
  System.out.println(switch(drink){
    case "日本酒", "ビール", "ワイン" -> "醸造酒です。";

    case "ブランデー", "ウイスキー" -> "蒸留酒です。";
    default -> "不明";
  });
}
}
