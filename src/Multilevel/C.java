package Multilevel;

public class C extends B {
    public void CclassMethod() {
        System.out.println("C class method");
    }
    public static void main(String[] args){
        C c1=new C();
        c1.CclassMethod();
        c1.BclassMethod();
        c1.AclassMethod();
    }
}

