
package oio.sagdok.person._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CivilStatusKodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CivilStatusKodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ugift"/>
 *     &lt;enumeration value="Gift"/>
 *     &lt;enumeration value="RegistreretPartner"/>
 *     &lt;enumeration value="Separeret"/>
 *     &lt;enumeration value="Skilt"/>
 *     &lt;enumeration value="OphaevetPartnerskab"/>
 *     &lt;enumeration value="Enke"/>
 *     &lt;enumeration value="Laengstlevende"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CivilStatusKodeType")
@XmlEnum
public enum CivilStatusKodeType {

    @XmlEnumValue("Ugift")
    UGIFT("Ugift"),
    @XmlEnumValue("Gift")
    GIFT("Gift"),
    @XmlEnumValue("RegistreretPartner")
    REGISTRERET_PARTNER("RegistreretPartner"),
    @XmlEnumValue("Separeret")
    SEPARERET("Separeret"),
    @XmlEnumValue("Skilt")
    SKILT("Skilt"),
    @XmlEnumValue("OphaevetPartnerskab")
    OPHAEVET_PARTNERSKAB("OphaevetPartnerskab"),
    @XmlEnumValue("Enke")
    ENKE("Enke"),
    @XmlEnumValue("Laengstlevende")
    LAENGSTLEVENDE("Laengstlevende");
    private final String value;

    CivilStatusKodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CivilStatusKodeType fromValue(String v) {
        for (CivilStatusKodeType c: CivilStatusKodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}