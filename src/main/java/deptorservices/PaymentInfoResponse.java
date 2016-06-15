
package deptorservices;

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
 *         &lt;element name="Loans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{DeptorServices}Loan" maxOccurs="unbounded" minOccurs="0"/>
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
    "loans"
})
public class PaymentInfoResponse
    extends ResponseMessage
{

    @XmlElement(name = "Loans")
    protected PaymentInfoResponse.Loans loans;

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
     *         &lt;element ref="{DeptorServices}Loan" maxOccurs="unbounded" minOccurs="0"/>
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
        "loan"
    })
    public static class Loans {

        @XmlElement(name = "Loan", namespace = "DeptorServices")
        protected List<Loan> loan;

        /**
         * Gets the value of the loan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Loan }
         * 
         * 
         */
        public List<Loan> getLoan() {
            if (loan == null) {
                loan = new ArrayList<Loan>();
            }
            return this.loan;
        }

    }

}
