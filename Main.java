/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueMessage;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Queue messageQueue = new Queue(100);
    public static void menu() {
        System.out.println(" _______________________________");
        System.out.println("|          Message Box          |");
        System.out.println("|_______________________________|");
        System.out.println("|       1. Input Message        |");
        System.out.println("|       2. Show the Message     |");
        System.out.println("|       3. Delete Message       |");
        System.out.println("|       4. Exit                 |");
        System.out.println("|_______________________________|");
    } 
    public static void main(String[] args) throws Exception {       
        int choice = 0;
        do {
            menu();
            choice = SelectChoice();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("Enter Sender: ");
                    String person = sc.nextLine();
                    System.out.print("Enter the text of the Message: ");
                    String message = sc.nextLine();
                    Date date = new Date();
                    System.out.println("Date Currently : " +date);
                    if (message.toCharArray().length > 250) {
                        System.out.println("It's out of 250 characters!");
                        break;
                    }
                    Message mess = new Message(person, message,date );
                    messageQueue.enqueue(mess);
                break;
                case 2:
                    messageQueue.Showmessage();
                break;
                case 3:
                    messageQueue.Delete();
                break;
                case 4:
                    System.out.println("Thank for using this system!");
                return;
                default:
                    System.out.println("Please Try again !");
                break;
            }
        } while(choice !=4);
    }    
    public static int SelectChoice() {
        boolean check = true;
        int choice = 0;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
                check = false;
            } catch (InputMismatchException e) {
                System.out.println("please enter the number of the function!");
                sc.nextLine();
            }
        } while (check);
        return choice;
    }
}
