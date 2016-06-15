
package testServices.PaymentWs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commitmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="commitmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADMINISTRATIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "commitmentType")
@XmlEnum
public enum CommitmentType {

    ADMINISTRATIVE;

    public String value() {
        return name();
    }

    public static CommitmentType fromValue(String v) {
        return valueOf(v);
    }

}
