
package PaymentServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Loan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Loan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{DeptorServices}SubscriberInfo" minOccurs="0"/>
 *         &lt;element name="Commitments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{DeptorServices}Commitment" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Loan", propOrder = {
    "fileId",
    "subscriberInfo",
    "commitments",
    "totalAmount"
})
public class Loan {

    @XmlElement(name = "FileId")
    protected long fileId;
    @XmlElement(name = "SubscriberInfo", namespace = "DeptorServices")
    protected SubscriberInfo subscriberInfo;
    @XmlElement(name = "Commitments")
    protected Loan.Commitments commitments;
    @XmlElement(name = "TotalAmount")
    protected Double totalAmount;

    /**
     * Gets the value of the fileId property.
     * 
     */
    public long getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     */
    public void setFileId(long value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the subscriberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberInfo }
     *     
     */
    public SubscriberInfo getSubscriberInfo() {
        return subscriberInfo;
    }

    /**
     * Sets the value of the subscriberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberInfo }
     *     
     */
    public void setSubscriberInfo(SubscriberInfo value) {
        this.subscriberInfo = value;
    }

    /**
     * Gets the value of the commitments property.
     * 
     * @return
     *     possible object is
     *     {@link Loan.Commitments }
     *     
     */
    public Loan.Commitments getCommitments() {
        return commitments;
    }

    /**
     * Sets the value of the commitments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loan.Commitments }
     *     
     */
    public void setCommitments(Loan.Commitments value) {
        this.commitments = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
        this.totalAmount = value;
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
     *         &lt;element ref="{DeptorServices}Commitment" maxOccurs="unbounded" minOccurs="0"/>
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
        "commitment"
    })
    public static class Commitments {

        @XmlElement(name = "Commitment", namespace = "DeptorServices")
        protected List<Undertaking> commitment;

        /**
         * Gets the value of the commitment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commitment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommitment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Undertaking }
         * 
         * 
         */
        public List<Undertaking> getCommitment() {
            if (commitment == null) {
                commitment = new ArrayList<Undertaking>();
            }
            return this.commitment;
        }

    }

}
