public class Account {
    // fill your code here
    protected String accName;
    protected String accNo;
    protected String bankName;

    public void setAccName(String str) {
        accName = str;
    }

    public void setAccNo(String str) {
        accNo = str;
    }

    public void setBankName(String str) {
        bankName = str;
    }

    public String getAccName() {
        return accName;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getBankName() {
        return bankName;
    }

    protected void display() {
        System.out
                .println("Account Name:" + accName + '\n' + "Account Number:" + accNo + '\n' + "Bank Name:" + bankName);
    }
}
