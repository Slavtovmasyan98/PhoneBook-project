package Service;

import Model.Phonebook;

import java.util.ArrayList;
import java.util.Objects;

public class CRUD {
    ArrayList<Phonebook> list;

    /**
     * Constructor
     */
    public CRUD() {
        this.list = new ArrayList<>();
    }


    /**
     * Add elements to List
     *
     * @param e;
     */

    public void addContactInfo(Phonebook e) {

        list.add(e);

    }

    /**
     * Remove Contact from the Phonebook List
     *
     * @param n;
     */
    public void removeContactInfo(String n) {

        Phonebook deleteContact = null;

        for (Phonebook elements : list) {
            if (Objects.equals(elements.getContact_name(), n)) {

                deleteContact = elements;

            }
        }
        if (deleteContact == null) {
            System.out.println("Invalid name");
        } else {
            list.remove(deleteContact);
            System.out.println("Contact succssefully deleted");
        }

    }

    /**
     * Update Contact from Phonebook List
     *
     * @param n;
     * @param b;
     */

    public void updateContactByName(String n, String b) {
        for (Phonebook elements : list) {

            if (Objects.equals(elements.getContact_name(), n)) {
                elements.setContact_name(b);
            } else
                System.out.println("The contact with This name not existing in PhoneBook List ");

        }
    }

    public void updateContactByLastName(String n, String b) {
        for (Phonebook elements : list) {

            if (Objects.equals(elements.getContact_name(), n)) {
                elements.setContact_lastname(b);
            } else
                System.out.println("The contact with This name not existing in PhoneBook List ");

        }
    }

    public void updateNumberByNumber(String n, int b) {
        for (Phonebook elements : list) {

            if (Objects.equals(elements.getContact_name(), n)) {
                elements.setNumber(b);
            } else
                System.out.println("The contact with This name not existing in PhoneBook List ");
        }
    }

    public void updateContactByInbox(String n, String b) {
        for (Phonebook elements : list) {

            if (Objects.equals(elements.getContact_name(), n)) {
                elements.setInbox(b);
            } else
                System.out.println("The contact with This name not existing in PhoneBook List ");

        }
    }

    /**
     * Veiw Phonebook List
     */
    public void showList() {
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
    }
}

