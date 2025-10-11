package quelacanaria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Arraylist = A resizeable array that stores objects (autoboxing )
//Arrays are fixed in sized, but Arraylists can change.
public class f051_Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(9);
        numbers.add(89);
        numbers.add(67);

        ArrayList<Double> grades = new ArrayList<>();

        grades.add(2.75);
        grades.add(3.00);
        grades.add(2.50);

        ArrayList<Boolean> isActive = new ArrayList<>();

        isActive.add(true);
        isActive.add(false);

        ArrayList<String> shapes = new ArrayList<>();

        shapes.add("circle");
        shapes.add("square");
        shapes.add("rectangle");

        ArrayList<Character> letters = new ArrayList<>();

        letters.add('c');
        letters.add('a');

        //replacing an old element into a new element in specific index
        letters.set(0,'C');
        //removing an element according to specific index
        letters.remove(0);

        //showing all the element in the ArrayList
        System.out.println(numbers);
        System.out.println(grades);
        System.out.println(isActive);
        System.out.println(shapes);
        System.out.println(letters);

        //showing an element according to specific index
        System.out.println(letters.get(0));
        //showing the size of an ArrayList
        System.out.println(letters.size());

        //Sorting the elements of an ArrayList
        Collections.sort(shapes);
        System.out.println(shapes);
        for(String shape : shapes){
            System.out.println(shape);
        }



    }

}
