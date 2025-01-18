package Enum;

public class Enum_Apple {
    public static void main(String[] args) {
        for(Apple ap : Apple.values()){
            System.out.println(ap + " costs " + ap.getPrice()
                    + " " + ap.getCurrency(true));
        }

        // Унаследованность от java.lang.Enum
        System.out.println(Apple.RedDel.name());
        System.out.println(Apple.RedDel.ordinal());
    }
}
