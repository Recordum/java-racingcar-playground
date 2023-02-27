package racinggame.model;

public class Car {

    private int location = 0;
    private String CarName;

    public Car(String carName) {
        this.CarName = carName;
    }

    void forward(){
        this.location++;
    }

    public String race(Car others){
        if(this.location > others.location){
            return this.CarName;
        }
        if(this.location < others.location){
            return others.CarName;
        }

        return this.CarName + "," + others.CarName;
    }
}
