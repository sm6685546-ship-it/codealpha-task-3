import java.util.Scanner;

class Room {
    int roomNumber;
    String category;
    boolean isBooked;

    Room(int roomNumber, String category) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.isBooked = false;
    }
}

public class hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room[] rooms = {
            new Room(101, "Standard"),
            new Room(102, "Deluxe"),
            new Room(103, "Suite")
        };

        while (true) {
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("\nAvailable Rooms:");
                for (Room room : rooms) {
                    System.out.println("Room " + room.roomNumber + 
                        " | " + room.category + 
                        " | " + (room.isBooked ? "Booked" : "Available"));
                }
            }

            else if (choice == 2) {
                System.out.print("Enter room number to book: ");
                int num = sc.nextInt();

                boolean found = false;
                for (Room room : rooms) {
                    if (room.roomNumber == num) {
                        found = true;
                        if (!room.isBooked) {
                            System.out.println("Payment Successful!");
                            room.isBooked = true;
                            System.out.println("Room booked successfully.");
                        } else {
                            System.out.println("Room already booked.");
                        }
                    }
                }
                if (!found) {
                    System.out.println("Invalid room number.");
                }
            }

            else if (choice == 3) {
                System.out.print("Enter room number to cancel booking: ");
                int num = sc.nextInt();

                boolean found = false;
                for (Room room : rooms) {
                    if (room.roomNumber == num) {
                        found = true;
                        if (room.isBooked) {
                            room.isBooked = false;
                            System.out.println("Booking cancelled.");
                        } else {
                            System.out.println("Room is not booked.");
                        }
                    }
                }
                if (!found) {
                    System.out.println("Invalid room number.");
                }
            }

            else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            }

            else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}