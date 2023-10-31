package methodoverriding;

 class Bike2 extends Vehical{
     public void run(){
         System.out.println("Bike is running safely");
     }

     public static void main(String[] args) {
         Bike2 obj=new Bike2();
         obj.run();
     }
}
