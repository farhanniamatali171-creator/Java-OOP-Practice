import java.util.ArrayList;

public class Store1 {
    private String name;
    private String location;
    private ArrayList<phone> phones; // list of phone names
    private int count;

    public Store1(String name,String location) {
       this.name=name;
       this.location=location;
       phones=new ArrayList<>();
    }

    // Add a phone by name
    public void addPhone(phone p) {
        phones.add(p); 
        
    }
    public phone findPhone(String brand,String model){
        for(phone p: phones){
           if( p.getBrand().equals(brand)
            && p.getModel().equals(model))
        return p;
        }
            return null;
        
        
    } 

    // Return total count
    public int phoneCount() {
        return phones.size();
    }

    // Return the list of phones
    public ArrayList<String> getPhones() {
        return phones.size();
    }

    @Override
    public String toString() {
    String result = "=========================\n";
    result+= "  "+name+"\n"+
    "=========================\n";;
    
       int i=1;
        for(phone p : phones) {
            result += i +")\n"+p+ "\n";
            i++;
        }
        
        return result;
        }

    

    public static void main(String[] args) {

        Store1 store = new Store1("Lahore Mobile Store", "Lahore");

        phone p1 = new phone("Samsung", "Galaxy A15", 52000,
                new Battery(5000,"Li-ion"));

        phone p2 = new phone("Infinix", "Hot 40", 42000,
                new Battery(5000,"Li-ion"));

        phone p3 = new phone("Redmi", "Note 13", 58000,
                new Battery(5000,"Li-ion"));

        phone p4 = new phone("Nokia", "110", 6500,
                new Battery(1450,"Li-ion"));

        phone p5 = new phone("Apple", "iPhone 15", 320000,
                new Battery(3349,"Li-ion"));

        // add phones
        store.addPhone(p1);
        store.addPhone(p2);
        store.addPhone(p3);
        store.addPhone(p4);
        store.addPhone(p5);

        // toString demo
        System.out.println(store);
        // Copy constructor demo
        System.out.println("Copy constructor demo");
        phone copyPhone = new phone(p1);
        System.out.println("");
        System.out.println("Copied Phone \n" + copyPhone);

        // equals demo
        System.out.println("=======================");
        System.out.println("equals demo");
        System.out.println(" ");
        System.out.println("p1 equals copyPhone:" + p1.equals(copyPhone));

        // find phone
        System.out.println("=======================");
        System.out.println("Find phone");
        System.out.println(" ");
        phone found = store.findPhone("Redmi","Note 13");

        if(found != null)
            System.out.println("Found Phone\n" + found);
        else
            System.out.println("Phone not found");

        // count
        System.out.println("Total phones in store: " + store.phoneCount());
    }
}