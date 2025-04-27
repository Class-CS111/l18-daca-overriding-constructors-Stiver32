public class DACArecipient {
    private String surname;
    private String givenName;
    private String uscisNumber;
    private String countryOfOrigin;
    private int birthday, validFromDate, expirationDate;
    private char sex;

    // Default constructor
    public DACArecipient() {
        surname         = "Unknown";
        givenName       = "Unknown";
        uscisNumber     = "Unknown";
        countryOfOrigin = "Unknown";
        birthday        = 2415021;  // JDN for 1/1/1900
        validFromDate   = 2415021;
        expirationDate  = 2415021;
        sex             = 'X';
    }

    // Full constructor
    public DACArecipient(
        String surname,
        String givenName,
        String uscisNumber,
        String countryOfOrigin,
        int birthday,
        int validFromDate,
        int expirationDate,
        char sex
    ) {
        this.surname         = surname;
        this.givenName       = givenName;
        this.uscisNumber     = uscisNumber;
        this.countryOfOrigin = countryOfOrigin;
        this.birthday        = birthday;
        this.validFromDate   = validFromDate;
        this.expirationDate  = expirationDate;
        this.sex             = sex;
    }

    @Override
    public String toString() {
        return "Surname: "       + surname
             + ", Given Name: "  + givenName
             + ", USCIS Number: "+ uscisNumber
             + ", Country: "     + countryOfOrigin
             + ", Birthday: "    + birthday
             + ", Valid From: "  + validFromDate
             + ", Expiration: "  + expirationDate
             + ", Sex: "         + sex;
    }
}
