
package oio.sagdok.person._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LivStatusKodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LivStatusKodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Prenatal"/>
 *     &lt;enumeration value="Foedt"/>
 *     &lt;enumeration value="Forsvundet"/>
 *     &lt;enumeration value="Doed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LivStatusKodeType")
@XmlEnum
public enum LivStatusKodeType {

    @XmlEnumValue("Prenatal")
    PRENATAL("Prenatal"),
    @XmlEnumValue("Foedt")
    FOEDT("Foedt"),
    @XmlEnumValue("Forsvundet")
    FORSVUNDET("Forsvundet"),
    @XmlEnumValue("Doed")
    DOED("Doed");
    private final String value;

    LivStatusKodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LivStatusKodeType fromValue(String v) {
        for (LivStatusKodeType c: LivStatusKodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}