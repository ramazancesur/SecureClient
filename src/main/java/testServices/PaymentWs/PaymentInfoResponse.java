
package testServices.PaymentWs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{DeptorServices}ResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Loans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="loans" type="{DeptorServices}Loan" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfoResponse", propOrder = {
    "referenceId",
    "loans"
})
public class PaymentInfoResponse
    extends ResponseMessage
{

    @XmlElement(name = "ReferenceId")
    protected String referenceId;
    @XmlElement(name = "Loans")
    protected PaymentInfoResponse.Loans loans;

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the loans property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoResponse.Loans }
     *     
     */
    public PaymentInfoResponse.Loans getLoans() {
        return loans;
    }

    /**
     * Sets the value of the loans property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoResponse.Loans }
     *     
     */
    public void setLoans(PaymentInfoResponse.Loans value) {
        this.loans = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="loans" type="{DeptorServices}Loan" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "loans"
    })
    public static class Loans {

        @XmlElement(nillable = true)
        protected List<Loan> loans;

        /**
         * Gets the value of the loans property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loans property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoans().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Loan }
         * 
         * 
         */
        public List<Loan> getLoans() {
            if (loans == null) {
                loans = new ArrayList<Loan>();
            }
            return this.loans;
        }

    }

}
