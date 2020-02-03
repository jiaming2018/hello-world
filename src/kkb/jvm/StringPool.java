package kkb.jvm;

import java.sql.SQLOutput;

public class StringPool {
    public static void main(String[] args) {
      String s3 = new String("1")+new String("1");
      s3.intern();
      String s4 = "11";
        System.out.println(s3==s4);

        String f = new String("ja") + new String("va");
          System.out.println(f.intern() == "java");

    }
}
