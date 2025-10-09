package quelacanaria.activity;

import java.util.Scanner;

public class f021_activity {
    //Quiz game
    public static void main(String[] args) {

        //Questions array[]
        //options array[][]
        //declare variables
        //welcome message
        // question(loop)
        //Options
        //Get guess from user
        //check our guess
        //display final score
        String[] questions = {"1. Who was the first Filipino to win a gold medal at the Olympics?",
                              "2. What does the title of José Rizal's book Noli Me Tangere translate to?",
                              "3. Who composed the music for the Philippine national anthem, \"Lupang Hinirang\"?",
                              "4. In what year did Ferdinand Marcos Sr. declare martial law?",
                              "5. Which city is known as the \"Summer Capital of the Philippines\"?"};

        String[][] options = {{"a) Onyok Velasco", "b) Hidilyn Diaz", "c) Carlos Yulo", "d) Efren Reyes"},
                              {"a) The Untouchable", "b) Do Not Disturb", "c) Touch Me Not", "d) Hands Off"},
                              {"a) Julian Felipe", "b) Antonio Molina", "c) Jose Palma", "d) Levi Celerio"},
                              {"a) 1970", "b) 1972", "c) 1975", "d) 1980"},
                              {"a) Tagaytay", "b) Sagada", "c) Boracay", "d) Baguio"}};

        String[] answer = {"b", "c", "a", "b", "d"};
        String guess = "";
        int score = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Welcome to java quiz game");
        System.out.println("*************************");

        for(int i = 0; i < questions.length; i++){

            System.out.println(questions[i]);

            for(String option : options[i]){

                System.out.println(option);

            }

            System.out.print("Enter your answer: ");
            guess = scan.nextLine();

            if(answer[i].equals(guess)){
                System.out.println("*******");
                System.out.println("CORRECT");
                System.out.println("*******");
                score += 1;
            }else{
                System.out.println("*****");
                System.out.println("WRONG");
                System.out.println("*****");
            }
        }
        System.out.println("****************");
        System.out.println("End of quiz game");
        System.out.println("Your score: " + score +"/"+questions.length);
        System.out.println("****************");


    }

}
