public class SavingsAccount extends Account {
    // fill your code here
    private String orgName;

    SavingsAccount() {
    }

    SavingsAccount(String accName, String accNo, String bankName, String orgName) {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.orgName = orgName;
    }

    public void setOrgName(String str) {
        orgName = str;
    }

    public String getOrgName() {
        return orgName;
    }

    public void display() {
        super.display();
        System.out.println("Organisation Name:" + orgName);
    }
}
