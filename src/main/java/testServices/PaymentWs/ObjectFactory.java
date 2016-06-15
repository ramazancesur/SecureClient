
package testServices.PaymentWs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the testServices.PaymentWs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PayLoanResponse_QNAME = new QName("DeptorServices", "PayLoanResponse");
    private final static QName _PayCommitmentRequest_QNAME = new QName("DeptorServices", "PayCommitmentRequest");
    private final static QName _SubscriberInfo_QNAME = new QName("DeptorServices", "SubscriberInfo");
    private final static QName _PayCommitmentResponse_QNAME = new QName("DeptorServices", "PayCommitmentResponse");
    private final static QName _Commitment_QNAME = new QName("DeptorServices", "Commitment");
    private final static QName _GetLoanResponse_QNAME = new QName("DeptorServices", "GetLoanResponse");
    private final static QName _PayLoanRequest_QNAME = new QName("DeptorServices", "PayLoanRequest");
    private final static QName _GetLoanRequest_QNAME = new QName("DeptorServices", "GetLoanRequest");
    private final static QName _Loan_QNAME = new QName("DeptorServices", "Loan");
    private final static QName _PaymentInfoResponse_QNAME = new QName("DeptorServices", "PaymentInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: testServices.PaymentWs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Loan }
     * 
     */
    public Loan createLoan() {
        return new Loan();
    }

    /**
     * Create an instance of {@link PaymentInfoResponse }
     * 
     */
    public PaymentInfoResponse createPaymentInfoResponse() {
        return new PaymentInfoResponse();
    }

    /**
     * Create an instance of {@link Undertaking }
     * 
     */
    public Undertaking createUndertaking() {
        return new Undertaking();
    }

    /**
     * Create an instance of {@link GetLoanRequest }
     * 
     */
    public GetLoanRequest createGetLoanRequest() {
        return new GetLoanRequest();
    }

    /**
     * Create an instance of {@link PayLoanRequest }
     * 
     */
    public PayLoanRequest createPayLoanRequest() {
        return new PayLoanRequest();
    }

    /**
     * Create an instance of {@link ResponseMessage }
     * 
     */
    public ResponseMessage createResponseMessage() {
        return new ResponseMessage();
    }

    /**
     * Create an instance of {@link SubscriberInfo }
     * 
     */
    public SubscriberInfo createSubscriberInfo() {
        return new SubscriberInfo();
    }

    /**
     * Create an instance of {@link PayCommitmentRequest }
     * 
     */
    public PayCommitmentRequest createPayCommitmentRequest() {
        return new PayCommitmentRequest();
    }

    /**
     * Create an instance of {@link Loan.Commitments }
     * 
     */
    public Loan.Commitments createLoanCommitments() {
        return new Loan.Commitments();
    }

    /**
     * Create an instance of {@link PaymentInfoResponse.Loans }
     * 
     */
    public PaymentInfoResponse.Loans createPaymentInfoResponseLoans() {
        return new PaymentInfoResponse.Loans();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DeptorServices", name = "PayLoanResponse")
    public JAXBElement<ResponseMessage> createPayLoanResponse(ResponseMessage value) {
        return new JAXBElement<ResponseMessage>(_PayLoanResponse_QNAME, ResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayCommitmentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DeptorServices", name = "PayCommitmentRequest")
    public JAXBElement<PayCommitmentRequest> createPayCommitmentRequest(PayCommitmentRequest value) {
        return new JAXBElement<PayCommitmentRequest>(_PayCommitmentRequest_QNAME, PayCommitmentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriberInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DeptorServices", name = "SubscriberInfo")
    public JAXBElement<SubscriberInfo> createSubscriberInfo(SubscriberInfo value) {
        return new JAXBElement<SubscriberInfo>(_SubscriberInfo_QNAME, SubscriberInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DeptorServices", name = "PayCommitmentResponse")
    public JAXBElement<ResponseMessage> createPayCommitmentResponse(ResponseMessage value) {
        return new JAXBElement<ResponseMessage>(_PayCommitmentResponse_QNAME, ResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Undertaking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DeptorServices", name = "Commitment")
    public JAXBElement<Undertaking> createCommitment(Undertaking value) {
        return new JAXBElement<Undertaking>(_Commitment_QNAME, Undertaking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DeptorServices", name = "GetLoanResponse")
    public JAXBElement<PaymentInfoResponse> createGetLoanResponse(PaymentInfoResponse value) {
        return new JAXBElement<PaymentInfoResponse>(_GetLoanResponse_QNAME, PaymentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayLoanRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DeptorServices", name = "PayLoanRequest")
    public JAXBElement<PayLoanRequest> createPayLoanRequest(PayLoanRequest value) {
        return new JAXBElement<PayLoanRequest>(_PayLoanRequest_QNAME, PayLoanRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoanRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DeptorServices", name = "GetLoanRequest")
    public JAXBElement<GetLoanRequest> createGetLoanRequest(GetLoanRequest value) {
        return new JAXBElement<GetLoanRequest>(_GetLoanRequest_QNAME, GetLoanRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Loan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DeptorServices", name = "Loan")
    public JAXBElement<Loan> createLoan(Loan value) {
        return new JAXBElement<Loan>(_Loan_QNAME, Loan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DeptorServices", name = "PaymentInfoResponse")
    public JAXBElement<PaymentInfoResponse> createPaymentInfoResponse(PaymentInfoResponse value) {
        return new JAXBElement<PaymentInfoResponse>(_PaymentInfoResponse_QNAME, PaymentInfoResponse.class, null, value);
    }

}
