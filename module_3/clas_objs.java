class car {
    String make = "Mahindra";
    String model = "Thar";
    int year = 2023;

    void displaydetails() {
        System.out.println("Make :" + make);
        System.out.println("Model :" + model);
        System.out.println("Year :" + year);

    }
}

class clas_objs {
    public static void main(String[] args) {
        car ob = new car();
        ob.displaydetails();

    }
}