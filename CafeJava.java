public class CafeJava {
  public static void main(String[] args){
    
    String generalGreeting = "Welcome to Mikey's Cafe";
    String pendingMessage = ", Your order will be ready shortly!";
    String readyMessage = ", your order is ready";
    String displayTotalMessage = "Your total is $";

    double mochaprice = 3.5;
    double dripCoffee = 2.5;
    double latte = 3.25;
    double cappuccino = 5.95;


    String customer1 = "Cindhuri";
    String customer2 = "Sam";
    String customer3 = "Jimmy";
    String customer4 = "Noah";

    boolean isReadyOrder1 = false;
    boolean isReadyOrder2 = false;
    boolean isReadyOrder3 = true;
    boolean isReadyOrder4 = true;


    System.out.println(generalGreeting + customer1);
    System.out.println(customer1 + pendingMessage);

    if (isReadyOrder4 == true){
      System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccino );
    }
    else{
      System.out.println(customer4 + pendingMessage);
    }
  
    System.out.println(customer2 + displayTotalMessage + latte * 2 );
    if (isReadyOrder2 == true){
      System.out.println(customer2 + readyMessage);
    }
    else{
      System.out.println(customer2 + pendingMessage);

    }
  
    System.out.println(customer3 + displayTotalMessage + (latte - dripCoffee));

  }
  
}