package Work;

import Model.NumberType;
import Service.CRUD;
import Model.Phonebook;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * Menu
     */
    static void DisplayMenu() {
        System.out.println("Choose the command");
        System.out.println("Enter the 1 if you want to AddContact ");
        System.out.println("Enter the 2 if you want to RemoveNumber ");
        System.out.println("Enter the 3 if you want to Update Contact ");
        System.out.println("Enter the 4 if you want to View my Contact List");
        System.out.println("Enter the number");
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Phonebook contactInfo ;
        CRUD method = new CRUD();


        while (true) {
            DisplayMenu();
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Enter The Contact Name ");
                    String name = scanner.next();


                    System.out.println("Enter the contact Last Name");
                    String lastName = scanner.next();

                    System.out.println("Enter the Contact Number ");
                    int number = scanner.nextInt();

                    //Number_Type
                    System.out.println("please enter the Type Of number which one you want to save");
                    System.out.println(Arrays.toString(NumberType.values()));
                    String numberType = scanner.next();
                    if(numberType.equals(NumberType.HOME.getNumberType())){
                        System.out.println("The number saved as Home Number");
                    }
                    else if(numberType.equals(NumberType.Work.getNumberType())){
                        System.out.println("The number saved as Work Number");
                    }
                    else if(numberType.equals(NumberType.Mobile.getNumberType())){
                    System.out.println("The number saved as Mobile Number");
                    }
                    else
                        System.out.println("The type is wrong");

                    System.out.println("do you want to add anouther number for this contact");


                    System.out.println("Enter the Contact inbox");
                    String inbox = scanner.next();

                    contactInfo = new Phonebook(name, lastName, numberType, number, inbox);
                    method.addContactInfo(contactInfo);

                    break;


                case 2:

                    System.out.println("Enter the the contact Name Which need to remove");
                    String removeName = scanner.next();
                    method.removeContactInfo(removeName);

                    break;

                case 3:

                    System.out.println("Enter the Contact Name which need to updated ");
                    String searchContactByName = scanner.next();



                    System.out.println("What you need to change in this Contact Chose the option ");
                    System.out.println("Press the option 1 if you want to change the Name");
                    System.out.println("Press the option 2 if you want to change the LastName");
                    System.out.println("Press the option 3 if you want to change the Number");
                    System.out.println("Press the option 4 if you want to change the inbox");
                    int option = scanner.nextInt();
                    if (option == 1){
                        System.out.println("Enter new Name");
                        String newName = scanner.next();
                        method.updateContactByName(searchContactByName, newName);
                    }
                    if(option == 2){
                        System.out.println("Enter new Last Name");
                        String newLastname = scanner.next();
                        method.updateContactByLastName(searchContactByName,newLastname);

                    }
                    if (option ==3){
                        System.out.println("Enter new Number");
                        int newNumber = scanner.nextInt();
                        method.updateNumberByNumber(searchContactByName,newNumber);
                    }

                    if(option == 4){
                        System.out.println("Enter new inbox");
                        String newInbox = scanner.next();
                        method.updateContactByInbox(searchContactByName,newInbox);
                    }

                    break;


                case 4:
                    System.out.println("List elements");
                    method.showList();
                    break;
            }

        }


    }

}
