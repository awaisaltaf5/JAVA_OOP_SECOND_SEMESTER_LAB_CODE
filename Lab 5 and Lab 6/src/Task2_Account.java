class account{
    double accNumber;
    String name;
    double accBalance;
    String Email;
    String date;

    public double getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(double accNumber) {
        this.accNumber = accNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
public class Task2_Account {
    public static void main(String[] args) {
        account a1=new account();
        a1.setName("Awais");
        a1.setAccNumber(1203877);
        a1.setAccBalance(30000);
        a1.setEmail("awais@gmail.com");
        a1.setDate("10/09/2024");
        System.out.println("Name:"+a1.getName());
        System.out.println("Account number:"+a1.getAccNumber());
        System.out.println("Account Balance"+a1.getAccBalance());
        System.out.println("Email:"+a1.getEmail());
        System.out.println("Date:"+a1.getDate());
    }


}
