
package oio.sagdok.person._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.oio.rep.bbr_dk.xml.schemas._2006._09._30.AddressPointType;
import dk.oio.rep.xkom_dk.xml.schemas._2006._01._06.AddressCompleteType;


/**
 * <p>Java class for DanskAdresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DanskAdresseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oio:sagdok:person:1.0.0}AdresseBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rep.oio.dk/xkom.dk/xml/schemas/2006/01/06/}AddressComplete" minOccurs="0"/>
 *         &lt;element ref="{http://rep.oio.dk/bbr.dk/xml/schemas/2006/09/30/}AddressPoint" minOccurs="0"/>
 *         &lt;element name="SpecielVejkodeIndikator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SocialDistriktTekst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SkoleDistriktTekst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostDistriktTekst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SogneDistriktTekst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValgkredsDistriktTekst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolitiDistriktTekst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DanskAdresseType", propOrder = {
    "addressComplete",
    "addressPoint",
    "specielVejkodeIndikator",
    "socialDistriktTekst",
    "skoleDistriktTekst",
    "postDistriktTekst",
    "sogneDistriktTekst",
    "valgkredsDistriktTekst",
    "politiDistriktTekst"
})
public class DanskAdresseType
    extends AdresseBaseType
{

    @XmlElement(name = "AddressComplete", namespace = "http://rep.oio.dk/xkom.dk/xml/schemas/2006/01/06/")
    protected AddressCompleteType addressComplete;
    @XmlElement(name = "AddressPoint", namespace = "http://rep.oio.dk/bbr.dk/xml/schemas/2006/09/30/")
    protected AddressPointType addressPoint;
    @XmlElement(name = "SpecielVejkodeIndikator")
    protected Boolean specielVejkodeIndikator;
    @XmlElement(name = "SocialDistriktTekst")
    protected String socialDistriktTekst;
    @XmlElement(name = "SkoleDistriktTekst")
    protected String skoleDistriktTekst;
    @XmlElement(name = "PostDistriktTekst")
    protected String postDistriktTekst;
    @XmlElement(name = "SogneDistriktTekst")
    protected String sogneDistriktTekst;
    @XmlElement(name = "ValgkredsDistriktTekst")
    protected String valgkredsDistriktTekst;
    @XmlElement(name = "PolitiDistriktTekst")
    protected String politiDistriktTekst;

    /**
     * Gets the value of the addressComplete property.
     * 
     * @return
     *     possible object is
     *     {@link AddressCompleteType }
     *     
     */
    public AddressCompleteType getAddressComplete() {
        return addressComplete;
    }

    /**
     * Sets the value of the addressComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressCompleteType }
     *     
     */
    public void setAddressComplete(AddressCompleteType value) {
        this.addressComplete = value;
    }

    /**
     * Gets the value of the addressPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPointType }
     *     
     */
    public AddressPointType getAddressPoint() {
        return addressPoint;
    }

    /**
     * Sets the value of the addressPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPointType }
     *     
     */
    public void setAddressPoint(AddressPointType value) {
        this.addressPoint = value;
    }

    /**
     * Gets the value of the specielVejkodeIndikator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecielVejkodeIndikator() {
        return specielVejkodeIndikator;
    }

    /**
     * Sets the value of the specielVejkodeIndikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecielVejkodeIndikator(Boolean value) {
        this.specielVejkodeIndikator = value;
    }

    /**
     * Gets the value of the socialDistriktTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialDistriktTekst() {
        return socialDistriktTekst;
    }

    /**
     * Sets the value of the socialDistriktTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialDistriktTekst(String value) {
        this.socialDistriktTekst = value;
    }

    /**
     * Gets the value of the skoleDistriktTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkoleDistriktTekst() {
        return skoleDistriktTekst;
    }

    /**
     * Sets the value of the skoleDistriktTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkoleDistriktTekst(String value) {
        this.skoleDistriktTekst = value;
    }

    /**
     * Gets the value of the postDistriktTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostDistriktTekst() {
        return postDistriktTekst;
    }

    /**
     * Sets the value of the postDistriktTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostDistriktTekst(String value) {
        this.postDistriktTekst = value;
    }

    /**
     * Gets the value of the sogneDistriktTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSogneDistriktTekst() {
        return sogneDistriktTekst;
    }

    /**
     * Sets the value of the sogneDistriktTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSogneDistriktTekst(String value) {
        this.sogneDistriktTekst = value;
    }

    /**
     * Gets the value of the valgkredsDistriktTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValgkredsDistriktTekst() {
        return valgkredsDistriktTekst;
    }

    /**
     * Sets the value of the valgkredsDistriktTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValgkredsDistriktTekst(String value) {
        this.valgkredsDistriktTekst = value;
    }

    /**
     * Gets the value of the politiDistriktTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolitiDistriktTekst() {
        return politiDistriktTekst;
    }

    /**
     * Sets the value of the politiDistriktTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolitiDistriktTekst(String value) {
        this.politiDistriktTekst = value;
    }

}