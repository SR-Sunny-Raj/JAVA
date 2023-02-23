class Product {
    private long id;
    private String productName;
    private String supplierName;

    public void setId(long var) {
        this.id = var;
    }

    public long getId() {
        return this.id;
    }

    public void setProductName(String str) {
        this.productName = str;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setSupplierName(String str) {
        this.supplierName = str;
    }

    public String getSupplierName() {
        return this.supplierName;
    }

    Product() {
        id = 0L;
        productName = "";
        supplierName = "";
    }

    Product(long var, String str1, String str2) {
        this.id = var;
        this.productName = str1;
        this.supplierName = str2;
    }

    public String toString() {
        String str = (this.id + " : " + this.productName + " : " + this.supplierName);
        return str;
    }
}