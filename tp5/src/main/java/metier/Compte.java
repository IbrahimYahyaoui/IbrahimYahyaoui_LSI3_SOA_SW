package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    int code;
    double slode;
    @XmlTransient
    Date dateCreation;

    public Compte(int code, double slode, Date dateCreation) {
        this.code = code;
        this.slode = slode;
        this.dateCreation = dateCreation;
    }

    public Compte() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSlode() {
        return slode;
    }

    public void setSlode(double slode) {
        this.slode = slode;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
