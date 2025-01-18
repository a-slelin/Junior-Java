package TextBlock;

public class C {
    public static void main(String[] args) {
        String str = """
                one \
                two 
                three \
                four
                """;


        String query = """
                SELECT *
                FROM SCHEMA.TABLE
                WHERE ID = ?
                """;

        System.out.println(str);
    }
}
