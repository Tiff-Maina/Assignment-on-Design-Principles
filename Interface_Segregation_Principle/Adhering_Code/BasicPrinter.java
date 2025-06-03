package Interface_Segregation_Principle.Adhering_Code;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class BasicPrinter implements Printer {
    public void print() {
        System.out.println("Printing...");
    }
}

class AllInOnePrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing from all-in-one...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}
