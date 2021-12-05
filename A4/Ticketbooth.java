public class Ticketbooth
{
    private Tickets tickets;
    private OPUSCard[] card;

    public Ticketbooth()
    {
        tickets = new Tickets();
        card = new OPUSCard[0];
    }

    public Ticketbooth(Tickets ticket,OPUSCard[] opusCard)
    {
        tickets = new Tickets(ticket);
        card = new OPUSCard[opusCard.length];
        for(int i = 0; i < opusCard.length; i++)
        {
            card[i]= opusCard[i];
        }
    }

    //returns the amount of tickets from ticketbooth
    public int getTicAm(){
        return tickets.getRegularTicketAmount() + tickets.getJuniorTicketAmount() + tickets.getSeniorTicketAmount() +
                tickets.getWeeklyTicketAmount() + tickets.getDailyTicketAmount();
    }

    //checks the ticket amounts of 2 ticketbooth objects
    public boolean checkTicketAmount(Ticketbooth one, Ticketbooth two){
        if (one.getTicAm()==two.getTicAm())
            return true;
        else
            return false;
    }

    //Check to see if the value of the two ticketbooths are the same
    public boolean ticketEqual(Ticketbooth one, Ticketbooth two){
        if (one.totalValue() == two.totalValue())
            return true;
        else
            return false;
    }

    //Method that returns total value of tickets in Ticketbooth
    public double totalValue(){
        return tickets.ticketsTotal();
    }

    //Method that returns the amount of OpusCards
    public int totalOpus(){
        return card.length;
    }

    //Method that adds an element to an array and returns number of opus cards
    public int addCard(OPUSCard nO){

        if (card.length == 0){
            OPUSCard[] test1 = new OPUSCard[1];
            test1[0] = nO;
            card = test1;
            return card.length;
        }

        else {
            OPUSCard[] test1 = new OPUSCard[card.length + 1];
            for (int i = 0; i < card.length; i++) {
                test1[i] = card[i];
            }
            test1[test1.length - 1] = nO;
            card = test1;
            return card.length;
        }
    }

    //Method that removes a card from ticketbooth
    public boolean removeCard(int choice)
    {
        int count = 0;
        if (card.length == 0)
        {
            return false;
        }
        else
        {
            OPUSCard[] test1 = new OPUSCard[card.length-1];
            for(int i = 0; i < (card.length); i++)
            {
                if(i != (choice))
                {
                    test1[count] = card[i];
                    count++;
                }
            }
            card = test1;
            return true;
        }
    }

    public void updateOpus(int year, int month, int i){
        card[i].setExpMonth(month);
        card[i].setExpYear(year);
    }

    //Add tickets to ticketbooth
    public double addTickets(int a, int b, int c, int d, int e){
        tickets.addTickets(a,b,c,d,e);
        return totalValue();
    }


    public boolean equals(Ticketbooth that, Ticketbooth other) {

        if (!ticketEqual(other,that)) {
            return false;
        }
        return other.totalOpus() == that.totalOpus();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("").append(tickets).append("\n");
        if(card.length == 0)
        {
            sb.append("\nNo OPUS Cards");
        }
        else
        {
            for(int i = 0; i < card.length;i++)
            {
                sb.append("\n").append(card[i].toString());
            }
        }
        return sb.toString();

    }
}