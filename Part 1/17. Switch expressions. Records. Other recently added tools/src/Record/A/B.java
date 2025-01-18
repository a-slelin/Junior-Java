package Record.A;

import java.util.ArrayList;

public class B {
    public static void main(String[] args) {
        ArrayList<A> list = new ArrayList<>();
        list.add(new A("Doe, John", 45));
        list.add(new A("Jones, Robert"));
        list.add(new A( 93));
        list.add(new A("Martin, Dave", 1050));
        list.add(new A());

        for(A a : list){
            System.out.println(a.lastName() + " " + a.idNum());
        }
    }
}
