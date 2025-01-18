public class E {

    public static void someProc(){
        NullPointerException e = new NullPointerException("Верхний уровень.");
        e.initCause(new ArithmeticException("Причина."));
        throw e;
    }

    public static void main(String[] args) {
        try{
            someProc();
        } catch (NullPointerException e){
            System.out.println("Перехвачено: " + e);

            System.out.println("Первоначальная причина: " + e.getCause());
        }
    }
}
