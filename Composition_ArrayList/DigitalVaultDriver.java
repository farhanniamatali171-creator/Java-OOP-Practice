 public class DigitalVaultDriver {

    // =========================
    // Part 1: Laptop Class
    // =========================
    static class Laptop {
        private String serialNumber;
        private String model;
        private boolean isAssigned;

        // Full constructor
        public Laptop(String serialNumber, String model, boolean isAssigned) {
            this.serialNumber = serialNumber;
            this.model = model;
            this.isAssigned = isAssigned;
        }

        // Default constructor (overloading)
        public Laptop() {
            this.serialNumber = "0000";
            this.model = "Generic";
            this.isAssigned = false;
        }

        // Getters and Setters
        public String getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public boolean isAssigned() {
            return isAssigned;
        }

        public void setAssigned(boolean assigned) {
            isAssigned = assigned;
        }

        // toString
        public String toString() {
            return "SerialNumber :'" + serialNumber + 
            "'\nLaptopModel  :" + model+
             "\nisAssigned   :" + isAssigned ;
        }
    }

    // =========================
    // Part 2: Inventory Class
    // =========================
    static class Inventory {
        private Laptop[] storage;

        // Constructor initializes array size
        public Inventory(int size) {
            if (size <= 0) size = 1; // safety fallback
            storage = new Laptop[size];
        }

        // 1) addLaptop
        public void addLaptop(int index, Laptop device) {
            if (index < 0 || index >= storage.length) {
                System.out.println("Invalid index: " + index);
                return;
            }
            if (device == null) {
                System.out.println("Cannot add null device at index: " + index);
                return;
            }
            storage[index] = device;
        }

        // 2) displayAll (null-safe)
        public void displayAll() {
            System.out.println("======= Inventory Listing =======");
            for (int i = 0; i < storage.length; i++) {
                if (storage[i] != null) {
                    System.out.println("\nSlot " + i + ":\n" + storage[i]); // calls toString()
                } else {
                    System.out.println("\nSlot " + i + ":\n[EMPTY]");
                }
            }
            System.out.println("===============================");
        }

        // 3) countAssigned
        public int countAssigned() {
            int count = 0;
            for (Laptop l : storage) {
                if (l != null && l.isAssigned()) {
                    count++;
                }
            }
            return count;
        }

        // 4) findBySerial
        public Laptop findBySerial(String serial) {
            if (serial == null) return null;

            for (Laptop l : storage) {
                if (l != null && serial.equals(l.getSerialNumber())) {
                    return l;
                }
            }
            return null;
        }
    }

    // =========================
    // Part 3: Driver (main)
    // =========================
    public static void main(String[] args) {
        // 1) Initialize Inventory of size 3
        Inventory inv = new Inventory(3);

        // 2) Create two Laptop objects (one full, one default)
        Laptop lap1 = new Laptop("A-123", "Dell Latitude 5420", true);
        Laptop lap2 = new Laptop(); // default: 0000, Generic, false

        // (Optional) show setter usage
        lap2.setSerialNumber("B-456");
        lap2.setModel("HP EliteBook 840");
        lap2.setAssigned(false);

        // 3) Add them at index 0 and 1
        inv.addLaptop(0, lap1);
        inv.addLaptop(1, lap2);

        // 4) Test: displayAll (index 2 will remain null)
        inv.displayAll();

        // Show assigned count (extra helpful demo)
        System.out.println();
        System.out.println("Assigned laptops count: " + inv.countAssigned());

        // 5) Search: findBySerial for a serial that exists and print result
        System.out.println();
        Laptop found = inv.findBySerial("A-123");
       
        System.out.println("Search result for serial A-123...\n" + found);
    }
}
