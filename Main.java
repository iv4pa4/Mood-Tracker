import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Do you have an account?\n");
        String accountAvailable = sc.nextLine();
        UserArchive ua= new UserArchive();
        if(accountAvailable.equalsIgnoreCase("yes")){
            Scanner name= new Scanner(System.in);
            System.out.print("Enter username\n");
            String userName = name.nextLine();
            Scanner pswd= new Scanner(System.in);
            System.out.print("Enter password\n");
            String userPSWD = pswd.nextLine();
            int check=ua.correctUser(userName, userPSWD);
            if(check==1) {
                Scanner ce = new Scanner(System.in);
                System.out.print("How are you feeling today?\n");
                String nwEmotion = ce.nextLine();
                CurrEmotion newEmotion = new CurrEmotion(nwEmotion);
                ua.getUser(userName).getArchive().add(newEmotion);
                System.out.println("Successfully entered emotion");

            }
        }
        else if(accountAvailable.equalsIgnoreCase("no")){
            Scanner ca= new Scanner(System.in);
            System.out.print("Do you want to create account?\n");
            String choice = ca.nextLine();
            if(choice.equalsIgnoreCase("yes")){
                Scanner name= new Scanner(System.in);
                System.out.print("Enter username\n");
                String userName = name.nextLine();
                Scanner pswd= new Scanner(System.in);
                System.out.print("Enter password\n");
                String userPSWD = pswd.nextLine();
                User new_user= new User();
                new_user.setName(userName);
                new_user.setPassword(userPSWD);
                ua.setUser(new_user);
                System.out.println("Successfully created new user\n");
                Scanner ce = new Scanner(System.in);
                System.out.print("How are you feeling today?\n");
                String nwEmotion = ce.nextLine();
                CurrEmotion newEmotion = new CurrEmotion(nwEmotion);
                ua.getUser(userName).getArchive().add(newEmotion);
                System.out.println("Successfully entered emotion");
            }
            else System.out.println("Maybe next time ;)\n");
        }
        else System.out.println("Please enter valid answer");

        System.out.println(ua.getUser("Iva").getArchive().getEmotion(0));
    }
}