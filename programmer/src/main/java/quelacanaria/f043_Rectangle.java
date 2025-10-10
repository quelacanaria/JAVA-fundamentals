package quelacanaria;

public class f043_Rectangle extends f043_Shape{

    double length;
    double width;

    f043_Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }

}
