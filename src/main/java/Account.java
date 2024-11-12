public class Account {
    private String firstName;
    private String lastName;
    private String street;
    private String zipCode;
    private String state;
    private String username;
    private String password;
    private String email;
    private long SSN;
    private String secQuestion;
    private String secAnswer;
    private String currentFlight;
    private int secPIN;

    public Account () {
    }

    public Account (String firstName, String lastName, String street, String zipCode, String state, String username,
    String password, String email, long SSN, String secQuestion, String secAnswer, String currentFlight, int secPIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.zipCode = zipCode;
        this.state = state;
        this.username = username;
        this.password = password;
        this.email = email;
        this.SSN = SSN;
        this.secQuestion = secQuestion;
        this.secAnswer = secAnswer;
        this.currentFlight = currentFlight;
        this.secPIN = secPIN;
        //have a Scanner in the main file bascially asking to set these.
    }

    public String getPasswords() {
        // input will ask secQuestion and ask for secAnswer
        // if input is correct (matches) it'll return password.
        return "PASSWORD: " + this.password + "\nSecurity PIN: " + this.secPIN + "\nSECURITY QUESTION: " + this.secQuestion +
                "\nSECURITY ANSWER: " + this.secAnswer;
    }

    public void setPassword(String password) {
        // input will ask secQuestion and ask for secAnswer
        // if input is correct (matches) it'll return password.
        this.password = password;
    }

    public String getAccountInfo() {
        //ask for secPIN
        return "ADDRESS: \nSTREET NAME: " + this.street + "\nSTATE: " + this.state + "\nZIPCODE: " + this.zipCode
                + "\nFULL NAME: " + this.firstName + " " + this.lastName + "\nUSERNAME: " + this.username +
                "\nEMAIL: " + this.email;
    }

    public long getSSN() {
        //ask for secPIN
        return SSN;
    }

    public String getCurrentFlight() {
        return currentFlight;
    }

    public void setCurrentFlight(String currentFlight) {
        this.currentFlight = currentFlight;
    }
}
