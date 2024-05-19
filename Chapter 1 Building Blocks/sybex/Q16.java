package sybex;

public class Q16 {

    public static void main(String[] args) {
        var blocky = """
            squirrel \s
            pigeon \
            termite""";

        // backslash means skip the line break
        // \s is meant to keep whitespace because trailing space are removed by default


        System.out.println ( blocky );
      
    }

}
