package Constructor;

public class CompanyDetails {
    public CompanyDetails() {
        System.out.println("Parent class - default constructor");
    }
    public CompanyDetails(int companyCount) {
        System.out.println("parent class - parameter constructor");
    }
    public CompanyDetails(int b, int a){
        this.companyList();
        int c=a+b;
        System.out.println("add of two no="+c);
    }
    public void companyList() {
        System.out.println("Company Class = Infosys, IBM,TCS");
    }
    public static void main(String[] args) {
        CompanyDetails obj1=new CompanyDetails();
        CompanyDetails obj2=new CompanyDetails(3);
        CompanyDetails obj3=new CompanyDetails(3,5);
    }
}
