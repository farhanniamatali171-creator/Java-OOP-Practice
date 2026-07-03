import java.util.ArrayList;

public class Store {
    private String name;
    private String location;
    private ArrayList<String> phones; // list of phone names
    private int count;

    public Store() {
        phones = new ArrayList<>();
        count = 0;
    }

    // Add a phone by name
    public void addPhone(String name) {
        phones.add(name); 
        count++;
    }

    // Return total count
    public int phoneCount() {
        return count;
    }

    // Return the list of phones
    public ArrayList<String> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Store [name=" + name + ", phones=" + phones + "]";
    }

    public static void main(String[] args) {
        Store s1 = new Store();

        s1.addPhone("INFINIX");
        s1.addPhone("OPPO");
        s1.addPhone("SAMSUNG");
        s1.addPhone("VIVO");
        s1.addPhone("REALME");

        ArrayList<String> myPhones = s1.getPhones();
        System.out.println("Phones in store:");
        for (String phone : myPhones) {
            System.out.println(phone);
        }

        System.out.println("Total phones: " + s1.phoneCount());
    }
}