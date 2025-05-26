class animal {
    void makeSound() {
        System.out.println("The Animal makes sound");

    }
}

class dog extends animal {
    void makeSound() {
        System.out.println("The Dog Barks");

    }

}

class in_heritance {
    public static void main(String[] args) {
        dog ob = new dog();
        ob.makeSound();
    }
}