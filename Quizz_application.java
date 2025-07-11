//Basic java console based quiz application

import java.util.Scanner;

public class Quizz_application{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println();
System.out.println("========== WELCOME TO CONSOLE BASED QUIZZ APPLICATION ========== ");
System.out.println("select the topics for quizz : \n1.Global\n2.Local\n3.Environment");
System.out.println("Enter your choice(1-3) : ");

//Questions
String global_q[] = {
"What is the origin of the universe" , 
"No. of continents" , 
"No of oceans" , 
"how many world wonders are there "
};

String local_q[] = {
"Telangana CM" , 
"Capital of India",  
"Hyd famous food item", 
"MLRITM location"
};

String Environment_q[] = {
"longest river in world", 
"Largest forest"
};

//Each question options
String global_options[][] = {
{"A. Gravity", "B. Big Bang", "C. Galaxy", "D. Explosion"},
{"A. 5", "B. 7", "C. 6", "D. 15"},
{"A. 3", "B. 4", "C. 5", "D. 6"},
{"A. 10", "B. 9", "C. 7", "D. 3"}
};

String local_options[][] = {
{"A. Prabhas", "B. KCR", "C. Allu Arjun", "D. Revanth Reddy"},
{"A. Hyd", "B. chennai", "C. Delhi", "D. Mumbai"},
{"A. Pani puri", "B. Biryani", "C. Dosa", "D. Dhai Vada"},
{"A. Dundigal", "B. GandiMaisamma", "C. Maisamma Guda", "D. Patancheru"}
};

String Environment_options[][] = {
{"A. krishna river ", "B. Amazon river", "C. Nile ", "D. Sindu "},
{"A. Amazon RainForest", "B. Nallamalla", "C. Narsapur Forest", "D. Srisailam Forest"}
};


//Each model correct answers 
char global_ans[] = {'B','B','B','C'};

char local_ans[] = {'D','C','B','A'};

char environment_ans[] = {'C','A'};

//taking input form user
int topic_num = scan.nextInt();
int score = 0;


switch(topic_num){
case 1:
System.out.println("\nselected Topic : Global ");
System.out.println("\nNumber of Questions are " + global_q.length);
for(int i=0;i<global_q.length;i++){
System.out.println("\nQ"+(i+1)+"."+global_q[i]);
for(String option:global_options[i]){
System.out.println(option);
}

System.out.println("Enter your answer (A/B/C/D) : ");
char userAnswer = scan.next().toUpperCase().charAt(0);

if(userAnswer == global_ans[i]){
System.out.println("Correct! you rocked it ");
score++;
}else{
System.out.println("Wrong! , correct answer is : "+ global_ans[i]);
}
}

break;

case 2:
System.out.println("\nselect Topic : Local");
System.out.println("\nNumber of Questions are " + local_q.length);
for(int i=0;i<local_q.length;i++){
System.out.println("\nQ"+(i+1)+"."+local_q[i]);
for(String option : local_options[i]){
System.out.println(option);
}

System.out.println("Enter your answer (A/B/C/D) : ");
char userAnswer = scan.next().toUpperCase().charAt(0);

if(userAnswer == local_ans[i]){
System.out.println("Correct! you rocked it ");
score++;
}else{
System.out.println("Wrong!, correct answer is : " + local_ans[i]);
}
}
break;

case 3:
System.out.println("\nselect Topic : Environment");
System.out.println("\nNumber of Questions are "+ Environment_q.length);
for(int i=0;i<Environment_q.length;i++){
System.out.println("\nQ"+(i+1)+"."+Environment_q[i]);
for(String option :Environment_options[i]){
System.out.println(option);
}

System.out.println("Enter your answer (A/B/C/D) : ");
char userAnswer = scan.next().toUpperCase().charAt(0);

if(userAnswer == environment_ans[i]){
System.out.println("Correct! you rocket it ");
score++;
}else{
System.out.println("Wrong!, correct answer is : " + environment_ans[i]);
}
}
break;

default:
System.out.println("Invalid input! please choose betweeen 1 and 3 ");

}

System.out.println("Quizz finished!, Your Score is " + score + "/" + global_q.length);
scan.close();
}
}