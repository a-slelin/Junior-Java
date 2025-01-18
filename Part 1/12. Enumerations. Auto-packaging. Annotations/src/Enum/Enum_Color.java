package Enum;

public class Enum_Color {
    public static void main(String[] args) {
        // Проверка того, что enum имеет самотипизацию
        System.out.println(Color.Red instanceof Color);

        Color mycolor = Color.Red;
        Color mycolor2 = Color.Red;
        System.out.println(mycolor == mycolor2);

        // В кейсах можно не писать Color.
        Color somecolor = Color.Black;
        switch (somecolor){
            case Green:
                System.out.println("It's green.");
                break;
            case Red:
                System.out.println("It's red.");
                break;
            default:
                System.out.println("I don't know how color it is.");
        }

        //Что будет при переводе в строку
        System.out.println(Color.Black);

        //Методы value() и valueOf()
        System.out.println();
        for (Color c : Color.values()){
            System.out.println(c);
        }
        System.out.println();
        Color tmp;
        String name = "black";
        try {
            tmp = Color.valueOf(name);
        } catch (IllegalArgumentException e) {
            System.out.println("No enum constant in Color.");
            return;
        }
        System.out.println(tmp);
    }
}
