package to.msn.wings.selfjava.chap01;

import java.util.regex.Pattern;

public class RegSingle {

  public static void main(String[] args) {
    var str = "初めまして。\nよろしくお願いします。";
    var ptn = Pattern.compile("^.+", Pattern.DOTALL);
    // var ptn = Pattern.compile("^.+", Pattern.DOTALL);
    var match = ptn.matcher(str);
    while (match.find()) {
      System.out.println(match.group());
    }
  }
}
