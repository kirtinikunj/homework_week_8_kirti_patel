package carpet_cost_calculator;

public class Floor {

    double width;
    double length;

    public Floor(double width,double length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        if(width<0 || length<0){
            width =0;
            length =0;
        }
        return width*length;
    }
}
