import java.util.ArrayList;


public class CafeUtil {

    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i = 0; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        double total = 0;
        for(int i = 0; i < lineItems.length; i++){
            total += lineItems[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String>menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.printf("Hello, %s!",username);
        System.out.printf("There are %s people in front of you. \n", customers.size());
        customers.add(username);
        System.out.println(customers);
    }
}