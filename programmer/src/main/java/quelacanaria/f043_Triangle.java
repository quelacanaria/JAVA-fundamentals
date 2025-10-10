package quelacanaria;

public class f043_Triangle extends f043_Shape{

    double base;
    double height;

    f043_Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }

}
