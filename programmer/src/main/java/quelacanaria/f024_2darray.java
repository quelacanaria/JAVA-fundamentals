package quelacanaria;
//f020
public class f024_2darray {
    //2d arrray where each element is an array usefull for
    //storing a matrix of data
    public static void main(String[] args) {

//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};
//
//        String[][] groceries = {fruits, vegetables, meats};
                                //col0      col1    col2
        String[][] groceries = {{"apple", "orange", "banana"}, //row 0
                                {"potato", "onion", "carrot"}, //row 1
                                {"chicken", "pork", "beef", "fish"}}; //row3
              //row  col
        groceries[0][1] = "mango";

        for(String[] foods : groceries){

            for(String food : foods){

                System.out.print(food + " ");

            }
            System.out.println();

        }



    }

}
