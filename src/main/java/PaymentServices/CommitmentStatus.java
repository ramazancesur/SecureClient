
package PaymentServices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commitmentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="commitmentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAID"/>
 *     &lt;enumeration value="NOT_PAID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "commitmentStatus")
@XmlEnum
public enum CommitmentStatus {

    PAID,
    NOT_PAID;

    public String value() {
        return name();
    }

    public static CommitmentStatus fromValue(String v) {
        return valueOf(v);
    }

}
