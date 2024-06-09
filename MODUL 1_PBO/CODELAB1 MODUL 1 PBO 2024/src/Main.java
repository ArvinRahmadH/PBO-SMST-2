import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String inputNim, inputAdmin, inputPWadmin;
        int login;
        System.out.println("====Library System====");
        System.out.println("1. Login as student");
        System.out.println("2. Login as admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3) = ");
        login = input.nextInt();

        switch (login){
            case 1 :
                System.out.print("Enter your nim = ");
                inputNim = input.next();

                if (inputNim.equals("1234567890")){
                    System.out.println("Successful login as student");
                }
                else {
                    System.out.println("User not found");
                }
                break;
            case 2 :
                System.out.print("Enter your username admin = ");
                inputAdmin = input.next();
                System.out.print("Enter your Password admin = ");
                inputPWadmin = input.next();

                if (inputAdmin.equals("admin")){
                    if (inputPWadmin.equals("admin12345")){
                        System.out.println("Successful login as admin");
                    }
                }
                else {
                    System.out.println("Admin not found");
                }
                break;
            case 3 :
                System.out.println("adios");
                break;

        }

    }

}