public class O {
    public static void main(String[] args){
        boolean flag = true;
        first : {
            second : {
                third : {
                    System.out.println("Перед оператором break.");
                    if(flag) break second;
                    System.out.println("Этот оператор не выполнится.");
                }
                System.out.println("Этот оператор не выполнится.");
            }
            System.out.println("После блока second.");
        }
    }
}

