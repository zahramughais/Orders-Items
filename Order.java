import java.util.ArrayList;

public class Order{
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();

    public double calculateOrder(){
        for (Item item : this.items){
            this.total = this.total + item.price;
        }
        return this.total;
    }
}