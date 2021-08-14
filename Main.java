import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        TrainEnquiry trainEnquiry = new TrainEnquiry();
        while(flag!=false){
            System.out.println("Search Trains By\n1.Name \n2.Train Number \n3.Source And Destination");
            System.out.print("Choose : ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1: System.out.print("Enter Train Name : ");
                        String name = scanner.next();
                        Train train1 = trainEnquiry.search(name);
                        train1.display();
                        break;
                case 2 : 
            
                default:
                    break;
            }
        }

    }
}
