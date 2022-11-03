package quotes;

import java.util.ArrayList;

public class RonSwanson {

    private ArrayList<String> quotes;

    public RonSwanson(String quote, ArrayList<String> quotes) {
        this.quotes = quotes;
    }


    public ArrayList<String> getQuotes() {
        return quotes;
    }

    public void setQuotes(ArrayList<String> quotes) {
        this.quotes = quotes;
    }
}
