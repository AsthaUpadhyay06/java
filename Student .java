publiclass Student {
    String name;
    int roll;

    void setDetails(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setDetails("Astha", 101);
        s.display();
    }
}

