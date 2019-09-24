package alfred.models;

import javax.persistence.OneToOne;
import java.util.ArrayList;

public class Content {
    private String copyright;
    private ArrayList<Quote> quotes;

    public Content() {
    }

    public String getCopyright() {
        return copyright;
    }

    public ArrayList<Quote> getQuotes() {
        return quotes;
    }

    @OneToOne
    public Quote getSingleQuote() throws Exception {
        if (!quotes.isEmpty())
            return quotes.get(0);

        throw new Exception("Error: Quotes array is empty");
    }

    @Override
    public String toString() {
        return String.format("%ncopyright: %s%nquotes: %s", copyright, quotes.get(0).toString());
    }
}
