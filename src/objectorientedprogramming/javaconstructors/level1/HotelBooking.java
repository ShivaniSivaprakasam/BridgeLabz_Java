package objectorientedprogramming.javaconstructors.level1;
// Single-line comment: HotelBooking class demonstrating multiple constructors

/*
HotelBooking class demonstrates:
1. Attributes: guestName, roomType, nights
2. Default constructor
3. Parameterized constructor
4. Copy constructor
5. Method to display booking details
*/

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }

    // Main method to test all constructors
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        System.out.println();

        // Using parameterized constructor
        HotelBooking paramBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        paramBooking.displayBooking();

        System.out.println();

        // Using copy constructor
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("Copied Booking:");
        copyBooking.displayBooking();
    }
}
