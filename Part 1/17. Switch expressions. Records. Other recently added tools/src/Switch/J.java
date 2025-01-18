package Switch;

public class J {
    public static void main(String[] args) {
        boolean isVowel = true;
        char ch = 'y';

        boolean flag = switch (ch){
            case 'a', 'e', 'i', 'o', 'u' -> true;
            case 'A', 'E', 'I', 'O', 'U' -> true;
            case 'y', 'Y' -> {
                if(isVowel) yield true;
                else yield false;
            }
            default -> false;
        };

        if (flag) {
            System.out.println(ch + " является гласной буквой!");
        }
    }
}
