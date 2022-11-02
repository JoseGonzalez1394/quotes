package quotes;

import java.util.ArrayList;

public class Quotes extends ArrayList<Quotes>{

    public ArrayList<Quote> quoteList;

    public Quotes(ArrayList<Quote> quoteList) {
        this.quoteList = quoteList;
    }
}
