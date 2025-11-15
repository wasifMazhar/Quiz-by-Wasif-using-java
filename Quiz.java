import java.util.Scanner;
public class Quiz {

public static void main(String[] args){

        String[] questions = {
         "1. What does CPU stand for?",
         "2. Which language is mainly used for web page structure?",
         "3. Which of these is a version control system?",
         "4. What does RAM store?",
         "5. Which tag is used to link a CSS file in HTML?",
         "6. Which keyword declares a constant in JavaScript?",
         "7. Which of the following is NOT a programming language?",
         "8. Which database is document-based?",
         "9. Which protocol is used to transfer web pages?",
         "10. Which company created the React library?"};

String[][] options = {
{"A) Central Processing Unit","B) Control Processing Unit","C) Central Performance Utility","D) Computer Power Unit"},
{"A) CSS","B) HTML","C) Java","D) python"},
{"A) Docker","B) Git","C) Node.js","D) react"},
{"A) Permanent files","B) Temporary data","C) OS only","D) Only apps"},
{"A) <script>","B) <style>","C) <link>","D) <meta>"},
{"A) let","B) static","C) const","D) var"},
{"A) Python","B) Java","C) HTML","D) C++"},
{"A) MySQL","B) MongoDB","C) PostgreSQL","D) SQLite"},
{"A) SMTP","B) FTP","C) HTTP","D) SSH"},
{"A) Google","B) Meta","C) Microsoft","D) Apple"}
};

char[] key = {'A', 'B', 'B', 'B', 'C', 'C', 'C', 'B', 'C', 'B'};

char[] userAns = new char[10];

int score = 0;
Scanner sc = new Scanner(System.in);

System.out.println("***********************");
System.out.println("Quiz for programmers");
System.out.println("***********************");


    for(int i=0 ; i < questions.length ; i++){
    System.out.println(questions[i]);
    for (int j=0 ; j < options[i].length ; j++){
        System.out.println(options[i][j]);
    }

    userAns[i] = sc.next().toUpperCase().charAt(0);

    if(userAns[i] != 'A' && userAns[i] != 'B' && userAns[i] != 'C' && userAns[i] != 'D'){
        System.out.println("Write a valid options (A, B, C, D)");
    }else if (key[i] == userAns[i]){
        score++;
    }

}


System.out.print("Here is you result for the quiz out of 10 : " + score);


    }
}