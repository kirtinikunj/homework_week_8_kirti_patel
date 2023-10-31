package pool_area;

public class Rectangle {

    double width;
    double length;
     public Rectangle(double width,double length){
         this.width=width;
         this.length= length;
         if(width<0 || length<0){
             width=0;
             length=0;
         }else{
             width=width;
             length=length;
         }
     }

     public double getWidth(){
         return width;
     }

     public double getLength(){
         return length;
     }

     public double getArea(){
         return width*length;
     }

}
