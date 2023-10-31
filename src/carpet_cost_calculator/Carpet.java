package carpet_cost_calculator;

public class Carpet {
    double cost;
    public Carpet(double cost) {

        this.cost = cost;
    }

    public double getCost(){
        if(cost<0){
            cost =0;
        }
        return cost;
    }
}
