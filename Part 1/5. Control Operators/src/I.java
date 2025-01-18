import java.io.IOException;

public class I {
    public static void main(String[] args) throws IOException {
        char choice;

        do {
            System.out.println("Краткая справка по:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.print("Выберите вариант: ");
            choice = (char) System.in.read();
        } while(choice < '1' || choice > '5');

        System.out.println();
        switch (choice) {
            case '1':
                System.out.println("Оператор if:");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Оператор switch:");
                System.out.println("switch (выражение) {");
                System.out.println("  case константа:");
                System.out.println("    последовательность операторов;");
                System.out.println("    break;");
                System.out.println("  //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("""
                        Оператор while:
                        while(условие) оператор; 
                        """);
                break;
            case '4':
                System.out.println("""
                        Оператор do-while:
                        do{
                          оператор;
                        }while(условие);
                        """);
                break;
            case '5':
                System.out.println("""
                        Оператор for:
                        for(инициализация; условие; итерация)
                          оператор;
                        """);
                break;
        }
    }
}
