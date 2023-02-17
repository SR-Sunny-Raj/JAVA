public class CurrentAccount extends Account {
    // fill your code here
    private String tinNumber;

    CurrentAccount() {
    }

    CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.tinNumber = tinNumber;
    }

    public void setTinNumber(String str) {
        tinNumber = str;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void display() {
        super.display();
        System.out.println("TIN Number:" + tinNumber);
    }
}
