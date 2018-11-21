package soa3;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Currency")

public class Currency {
    private String isocode;
    private String nominal;
    private String value;

    public String getIsocode() {
        return isocode;
    }
    @XmlAttribute( name = "ISOCode")
    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    public String getNominal() {
        return nominal;
    }
    @XmlElement( name = "Nominal" )
    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getValue() {
        return value;
    }
    @XmlElement( name = "Value" )
    public void setValue(String value) {
        this.value = value;
    }
}
