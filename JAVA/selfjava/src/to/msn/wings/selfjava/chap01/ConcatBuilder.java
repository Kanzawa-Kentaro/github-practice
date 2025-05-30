package to.msn.wings.selfjava.chap01;

public class ConcatBuilder {
    public static void main(String[] args) {
        var builder = new StringBuilder();
        for (var i = 0; i < 100000; i++) {
            builder.append("いろは");
        }
        var result = builder.toString();
        // 結果を出力したい場合は以下を追加
        System.out.println(result.length()); // 長さだけ表示（出力文字数多すぎ防止）
    }
}
