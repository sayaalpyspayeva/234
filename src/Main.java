import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the train name: ");
        String trainName = scanner.nextLine();

        Train train = new Train(trainName);

        System.out.print("Enter the identifier for the first locomotive: ");
        String locoId1 = scanner.nextLine();
        System.out.print("Enter the carrying capacity for the first locomotive: ");
        int locoCapacity1 = scanner.nextInt();

        System.out.print("Enter the identifier for the second locomotive: ");
        String locoId2 = scanner.next();
        System.out.print("Enter the carrying capacity for the second locomotive: ");
        int locoCapacity2 = scanner.nextInt();

        Locomotive locomotive1 = new Locomotive(locoId1, locoCapacity1);
        Locomotive locomotive2 = new Locomotive(locoId2, locoCapacity2);

        scanner.nextLine();

        System.out.print("Enter the carrying capacity for the first carriage: ");
        int carriageCapacity1 = scanner.nextInt();

        System.out.print("Enter the passenger capacity for the first carriage: ");
        int passengerCapacity1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the carrying capacity for the second carriage: ");
        int carriageCapacity2 = scanner.nextInt();

        System.out.print("Enter the passenger capacity for the second carriage: ");
        int passengerCapacity2 = scanner.nextInt();

        Carriage carriage1 = new Carriage("Carriage1", carriageCapacity1, passengerCapacity1);
        Carriage carriage2 = new Carriage("Carriage2", carriageCapacity2, passengerCapacity2);

        train.addLocomotive(locomotive1);
        train.addLocomotive(locomotive2);
        train.addCarriage(carriage1);
        train.addCarriage(carriage2);

        System.out.println("Train details: Delayed by one hour");
        System.out.println("Train name: " + train.getName());
        System.out.println("Total cargo capacity: " + train.calculateTotalCargoCapacity());
        System.out.println("Total passenger capacity: " + train.calculateTotalPassengerCapacity());

        scanner.close();
    }
}
