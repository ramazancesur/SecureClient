
package PaymentServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Undertaking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Undertaking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CommitmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CommitmentType" type="{DeptorServices}commitmentType" minOccurs="0"/>
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
@XmlType(name = "Undertaking", propOrder = {
    "id",
    "sortId",
    "commitmentDate",
    "amount",
    "commitmentType",
    "commitmentStatus"
})
public class Undertaking {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "SortId")
    protected int sortId;
    @XmlElement(name = "CommitmentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commitmentDate;
    @XmlElement(name = "Amount")
    protected Double amount;
    @XmlElement(name = "CommitmentType")
    protected CommitmentType commitmentType;
    @XmlElement(name = "CommitmentStatus")
    protected CommitmentStatus commitmentStatus;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the sortId property.
     * 
     */
    public int getSortId() {
        return sortId;
    }

    /**
     * Sets the value of the sortId property.
     * 
     */
    public void setSortId(int value) {
        this.sortId = value;
    }

    /**
     * Gets the value of the commitmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitmentDate() {
        return commitmentDate;
    }

    /**
     * Sets the value of the commitmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitmentDate(XMLGregorianCalendar value) {
        this.commitmentDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the commitmentType property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentType }
     *     
     */
    public CommitmentType getCommitmentType() {
        return commitmentType;
    }

    /**
     * Sets the value of the commitmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentType }
     *     
     */
    public void setCommitmentType(CommitmentType value) {
        this.commitmentType = value;
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
