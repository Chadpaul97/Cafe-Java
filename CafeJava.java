public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready. ";
        String displayTotalMessage = " Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double lattesPrice = 2.8;
        double dripCoffeePrice = 3.8;
        double cappuccinoPrice = 3.2;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage + displayTotalMessage + mochaPrice);
        }
        else {                           
            System.out.println(customer1 + pendingMessage);
        }
        System.out.println( customer1 + pendingMessage );
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage + displayTotalMessage + 3.2);
        }
        else {                           
            System.out.println(customer4 + pendingMessage);
        }
        if (isReadyOrder2) {
            System.out.println(customer2 + pendingMessage);
        }
        else {                           
            System.out.println(customer2 + displayTotalMessage + lattesPrice * 2);
        }
        System.out.println( customer3 + displayTotalMessage + (dripCoffeePrice - lattesPrice));
        // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
    }
}
