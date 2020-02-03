package kkb.jvm;

public class Refactor {

    public static void main(String[] args) {
          getFirstName("123","456");
    }

    public static void getFirstName(String firstName, String lastName){
        System.out.println(firstName);

        String bb = "lastName" + firstName;

        loadData();
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");
    }

    private static void loadData() {
        System.out.println("abc");
        System.out.println("abc");
    }

}
