import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name ="mocha";
        item1.price = 4.5;

        item2.name ="latte";
        item2.price = 3;
        
        item3.name ="drip coffe";
        item3.price = 2.2;
        
        item4.name ="capuccino";
        item4.price = 3.5;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name="Cindhuri";
        order2.name="Jimmy";
        order3.name="Noa";
        order4.name="Sam";

        System.out.printf("Order1: %s\n", order1);
        System.out.printf("Total order1: %s\n", order1.total);

        order2.items.add(item1);
        order2.total += item1.price;
        System.out.printf("Total order2: %s\n", order2.total);
        
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.printf("Total order3: %s\n", order3.total);

        order4.items.add(item2);
        order4.total += item2.price;
        System.out.printf("Total order4: %s\n", order4.total);

        System.out.printf("Ready before update: %s\n", order1.ready);
        order1.ready = true;
        System.out.printf("Ready after update: %s\n", order1.ready);
    
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;

        System.out.printf("Total order4: %s\n", order4.total);

        System.out.printf("Ready Before update: %s\n", order2.ready);
        order2.ready = true;
        System.out.printf("Ready after update: %s\n", order2.ready);

        // for(Item item : order4.items){
        //     System.out.printf("Item: %s\n", item.name);
        //     System.out.printf("Item: %s\n", item.price);
        //     System.out.println();
        // }





        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);

        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        // System.out.printf("Ready: %s\n", order2.items);
        // System.out.printf("Ready: %s\n", order2.items.get(0).name);
    }
}