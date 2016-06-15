
package testServices.PaymentWs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayLoanRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayLoanRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PaymentType" type="{DeptorServices}paymentType" minOccurs="0"/>
 *         &lt;element name="CurrencyType" type="{DeptorServices}currencyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayLoanRequest", propOrder = {
    "fileId",
    "paymentAmount",
    "paymentType",
    "currencyType"
})
public class PayLoanRequest {

    @XmlElement(name = "FileId")
    protected long fileId;
    @XmlElement(name = "PaymentAmount")
    protected double paymentAmount;
    @XmlElement(name = "PaymentType")
    protected PaymentType paymentType;
    @XmlElement(name = "CurrencyType", defaultValue = "TL")
    protected CurrencyType currencyType;

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
     * Gets the value of the paymentAmount property.
     * 
     */
    public double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     */
    public void setPaymentAmount(double value) {
        this.paymentAmount = value;
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

}
