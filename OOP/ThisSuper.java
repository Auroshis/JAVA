public class ThisSuper{
    class A{
        int a = 10;
    }
    class B extends A{
        int a = 20;
        void show(int a){
            System.out.println(a);//50
            System.out.println(this.a);//20
            System.out.println(super.a);//10
        }
    } 
    public static void main(String[] args){
            B obj = new B();
            B.show(50);
    }
}