import java.util.Objects;

public class OPUSCard {

    // attributes
    // variables must be private
    private String cardType, cardHolder;
    private int expYear, expMonth;

    // default constructor
    public OPUSCard() {}

    // copy constructor
    public OPUSCard(OPUSCard opus) {
        this.cardHolder = opus.cardHolder;
        this.cardType = opus.cardType;
        this.expMonth = opus.expMonth;
        this.expYear = opus.expYear;
    }

    public OPUSCard(String a, String b, int c, int d)
    {
        cardType = a;
        cardHolder = b;
        expYear = c;
        if(d > 0 && d < 13)
        {
            expMonth = d;
        }
        else
        {
            expMonth = 0;
        }
    }
    // accessor methods
    public String getCardType()
    {
        return cardType;
    }

    public String getCardHolder()
    {
        return cardHolder;
    }

    public int getExpMonth()
    {
        return expMonth;
    }

    public int getExpYear()
    {
        return expYear;
    }

    // mutator methods
    public void setExpMonth(int expMonth)
    {
        if(expMonth > 0 && expMonth <13)
        {
            this.expMonth = expMonth;
        }
        else
        {
            this.expMonth = 0;
        }
    }

    public void setExpYear(int expYear)
    {
        this.expYear = expYear;
    }
    // print out
    @Override
    public String toString()
    {
        return cardType + " - " + cardHolder + " - " + expMonth + "/" + expYear;

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OPUSCard other = (OPUSCard) obj;
        return Objects.equals(cardHolder, other.cardHolder) && Objects.equals(cardType, other.cardType)
                && expMonth == other.expMonth && expYear == other.expYear;
    }
}