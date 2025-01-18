public class P {
    public static void main(String[] args) {
        outer: for(int i = 0; i < 3; ++i){
                   System.out.print("Проход " + i + ": ");
                   inner: for(int j = 0; j < 100; ++j){
                              if(j == 10) break outer;
                              System.out.print(j + " ");
                   }
                   System.out.println("Это выводиться не будет.");
        }
        System.out.println("Завершение обоих циклов.");
    }
}
