class Cardetails
{
    static char modelCode = 'A';
    static int yearOfManufacture = 2022;
    static double engineCapacity = 1498.75;
    static char fuelType = 'P'; // P for Petrol, D for Diesel
    static int seatingCapacity = 5;

    public static void main(String args[])
    {
        char ModelCode = getModelCode();
        int Year = getYearOfManufacture();
        double Engine = getEngineCapacity();
        char Fuel = getFuelType();
        int Seats = getSeatingCapacity();

        System.out.println("Model Code: " + ModelCode);
        System.out.println("Year of Manufacture: " + Year);
        System.out.println("Engine Capacity: " + Engine + " cc");
        System.out.println("Fuel Type: " + Fuel);
        System.out.println("Seating Capacity: " + Seats);
    }

    public static char getModelCode()
    {
        return modelCode;
    }

    public static int getYearOfManufacture()
    {
        return yearOfManufacture;
    }

    public static double getEngineCapacity()
    {
        return engineCapacity;
    }

    public static char getFuelType()
    {
        return fuelType;
    }

    public static int getSeatingCapacity()
    {
        return seatingCapacity;
    }
}
