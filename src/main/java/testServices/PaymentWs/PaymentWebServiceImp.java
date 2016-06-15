
package testServices.PaymentWs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PaymentWebServiceImp", targetNamespace = "DeptorServices")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PaymentWebServiceImp {


    /**
     * 
     * @param getLoanRequest
     * @return
     *     returns testServices.PaymentWs.PaymentInfoResponse
     */
    @WebMethod(operationName = "GetLoan")
    @WebResult(name = "GetLoanResponse", targetNamespace = "DeptorServices", partName = "GetLoanResponse")
    @Action(input = "DeptorServices/PaymentWebServiceImp/GetLoanRequest", output = "DeptorServices/PaymentWebServiceImp/GetLoanResponse")
    public PaymentInfoResponse getLoan(
        @WebParam(name = "GetLoanRequest", targetNamespace = "DeptorServices", partName = "GetLoanRequest")
        GetLoanRequest getLoanRequest);

    /**
     * 
     * @param payLoanRequest
     * @return
     *     returns testServices.PaymentWs.ResponseMessage
     */
    @WebMethod(operationName = "PayLoan")
    @WebResult(name = "PayLoanResponse", targetNamespace = "DeptorServices", partName = "PayLoanResponse")
    @Action(input = "DeptorServices/PaymentWebServiceImp/PayLoanRequest", output = "DeptorServices/PaymentWebServiceImp/PayLoanResponse")
    public ResponseMessage payLoan(
        @WebParam(name = "PayLoanRequest", targetNamespace = "DeptorServices", partName = "PayLoanRequest")
        PayLoanRequest payLoanRequest);

    /**
     * 
     * @param payCommitmentRequest
     * @return
     *     returns testServices.PaymentWs.ResponseMessage
     */
    @WebMethod(operationName = "PayCommitment")
    @WebResult(name = "PayCommitmentResponse", targetNamespace = "DeptorServices", partName = "PayCommitmentResponse")
    @Action(input = "DeptorServices/PaymentWebServiceImp/PayCommitmentRequest", output = "DeptorServices/PaymentWebServiceImp/PayCommitmentResponse")
    public ResponseMessage payCommitment(
        @WebParam(name = "PayCommitmentRequest", targetNamespace = "DeptorServices", partName = "PayCommitmentRequest")
        PayCommitmentRequest payCommitmentRequest);

}
