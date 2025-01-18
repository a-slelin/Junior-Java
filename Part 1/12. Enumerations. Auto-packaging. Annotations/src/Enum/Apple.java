package Enum;

public enum Apple implements Cloneable {
    Jonathan(10), GoldenDel(9), RedDel,
    Winesap(15), Cortland(8), ;

    private int price;

    Apple (){
        this.price = -1;
    }
    Apple (int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getCurrency(boolean plural){
        return "rubble" + (plural ? "s" : "");
    }
}
