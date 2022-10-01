package Model;

public class Phonebook {
    private String contact_name;
    private String contact_lastname;
    private String numberType;
    private int number;

    private String inbox;


    @Override
    public String toString() {
        return "Phonebook{" +
                "contact_name='" + contact_name + '\'' +
                ", contact_lastname='" + contact_lastname + '\'' +
                ", numberType='" + numberType + '\'' +
                ", number=" + number +
                ", inbox='" + inbox + '\'' +
                '}';
    }

    /**
     * Getters and Setters
     *
     * @return;
     */

    public String getContact_name() {
        return contact_name;
    }


    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;

    }

    public String getContact_lastname() {
        return contact_lastname;
    }

    public void setContact_lastname(String contact_lastname) {
        this.contact_lastname = contact_lastname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getInbox() {
        return inbox;
    }

    public void setInbox(String inbox) {
        this.inbox = inbox;
    }

    public String getNumberType() {
        return numberType;
    }

    public void setNumberType(String numberType) {
        this.numberType = numberType;
    }
//*********************************************************************************************************************


    /**
     * Default Constructor
     */
    public Phonebook() {
    }


    /**
     * Constructor
     *
     * @param contact_name;
     * @param contact_lastname;
     * @param number;
     * @param inbox;
     */


    public Phonebook(String contact_name, String contact_lastname, String numberType, int number, String inbox) {
        this.contact_name = contact_name;
        this.contact_lastname = contact_lastname;
        this.numberType = numberType;
        this.number = number;
        this.inbox = inbox;


    }


}
