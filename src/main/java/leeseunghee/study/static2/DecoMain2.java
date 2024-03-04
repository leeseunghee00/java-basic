package leeseunghee.study.static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String str = "Hello Java";
        String utils = DecoUtil2.deco(str);

        System.out.println("before: " + str);
        System.out.println("after: " + utils);
    }
}
