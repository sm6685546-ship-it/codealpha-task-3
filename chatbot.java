import java.util.Scanner;
public class chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("ChatBot: Hello! Ask me something.");
        while (true) {
            input = sc.nextLine().toLowerCase();

            if (input.equals("hello")) {
                System.out.println("ChatBot: Hi there!");
            } 
            else if (input.equals("how are you")) {
                System.out.println("ChatBot: I am fine.");
            } 
            else if (input.equals("bye")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            } 
            else if(input.contains("java")){
           System.out.println("Java is a programming language");
     }
      else if(input.contains("python")){
     System.out.println("Python is used for AI and web development");
      }
         else if(input.contains("college")){
   System.out.println("I can answer academic questions too");
        }
            else {
                System.out.println("ChatBot: I don't understand.");
            }

        }
    }
}