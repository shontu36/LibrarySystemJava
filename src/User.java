public abstract class User {
    private String userId;
    private String name;
    private String ContactInfo;
    private static int totalusers = 0;

    private int getTotalusers(){
        return totalusers;
    }

    public String getName(){
        return name;
    }
    public String getContactInfo(){
        return ContactInfo;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setContactInfo(String ContactInfo){
        this.ContactInfo = ContactInfo;
    }
    User(){
        userId = generateUniqueId();
    }
    User(String name, String contactInfo){
        userId = generateUniqueId();
        this.name = name;
        this.ContactInfo = contactInfo;

    }
    User(User user){
        this.userId = generateUniqueId();
        this.name = user.name;
        this.ContactInfo = user.ContactInfo;
    }
    private final String generateUniqueId(){
        totalusers++;
        return "Users-"+totalusers;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void returnBooks();
}
