package soa3;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "CurrencyRates")
//@XmlAccessorType(XmlAccessType.FIELD)
public class CurrencyRates {
    private String name;
    private String date;
    @XmlElement( name = "Currency" )
    private List<Currency> currencyList;

    public String getName() {
        return name;
    }
    @XmlAttribute( name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }
    @XmlAttribute( name = "Date")
    public void setDate(String date) {
        this.date = date;
    }

    public List<Currency> getCurrencyList() {
        return this.currencyList;
    }

    public void setCurrencyList(Currency currency) {
        if( this.currencyList == null ) {
            this.currencyList = new ArrayList<Currency>();
        }
        this.currencyList.add( currency );
    }
}
