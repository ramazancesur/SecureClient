
package testServices.PaymentWs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayCommitmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayCommitmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommitmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyType" type="{DeptorServices}currencyType" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{DeptorServices}paymentType" minOccurs="0"/>
 *         &lt;element name="CommitmentStatus" type="{DeptorServices}commitmentStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayCommitmentRequest", propOrder = {
    "commitmentId",
    "currencyType",
    "paymentType",
    "commitmentStatus"
})
public class PayCommitmentRequest {

    @XmlElement(name = "CommitmentId", required = true)
    protected String commitmentId;
    @XmlElement(name = "CurrencyType", defaultValue = "TL")
    protected CurrencyType currencyType;
    @XmlElement(name = "PaymentType")
    protected PaymentType paymentType;
    @XmlElement(name = "CommitmentStatus")
    protected CommitmentStatus commitmentStatus;

    /**
     * Gets the value of the commitmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentId() {
        return commitmentId;
    }

    /**
     * Sets the value of the commitmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentId(String value) {
        this.commitmentId = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrencyType(CurrencyType value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the commitmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentStatus }
     *     
     */
    public CommitmentStatus getCommitmentStatus() {
        return commitmentStatus;
    }

    /**
     * Sets the value of the commitmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentStatus }
     *     
     */
    public void setCommitmentStatus(CommitmentStatus value) {
        this.commitmentStatus = value;
    }

}
