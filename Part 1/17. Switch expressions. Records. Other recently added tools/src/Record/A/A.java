package Record.A;

public record A(String name, int idNum) {

    private static int pendingId = -1;
    private static String pendingName = "Nan, Nan";

    public A(String name, int idNum){
        int i = name.indexOf(',');
        int j = name.lastIndexOf(',');
        if (i != j) throw new IllegalArgumentException("Должна быть только одна запятая!");

        if(i < 1 || name.length() == i + 1)
            throw new IllegalArgumentException("Формат должен быть: фамилия, имя.");

        this.name = name.trim();
        this.idNum = idNum;
    }

    /* Либо так
    public A {
       name = name.trim();
       ...
    }
    */

    public A(String name) {
        this(name, pendingId);
    }

    public A(int idNum){
        this(pendingName, idNum);
    }

    public A(){
        this(pendingName, pendingId);
    }

    String lastName(){
        return name.substring(0, name.trim().indexOf(','));
    }
}
