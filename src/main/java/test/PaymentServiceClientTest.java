package test;



import PaymentServices.*;
import soaphandler.PaymentUsernameTokenHandler;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesur on 16.4.2016.
 */

public class PaymentServiceClientTest {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        final PaymentUsernameTokenHandler paymentUsernameTokenHandler = new PaymentUsernameTokenHandler();
        paymentService.setHandlerResolver(new HandlerResolver() {
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler>handlerList = new ArrayList<Handler>();
                handlerList.add(paymentUsernameTokenHandler);
                return  handlerList;
            }
        });

        PaymentWebServiceImp paymentWebServiceImp = paymentService.getPaymentServicePort();

        /*****
         * GetLoan (Borç Sorgulama)
         */
        GetLoanRequest getLoanRequest = new GetLoanRequest();
        getLoanRequest.setSubscriberId("1058956");

        PaymentInfoResponse paymentInfoResponse = paymentWebServiceImp.getLoan(getLoanRequest);

        if(paymentInfoResponse.getResponse()!=null)
        System.out.println(paymentInfoResponse.getResponse().toString());

        System.out.println(paymentInfoResponse.getErrorDescription());

        /*****
         * PayCommitment (Taahhüt Ödeme)
         */

        PayCommitmentRequest payCommitmentRequest = new PayCommitmentRequest();
        payCommitmentRequest.setCommitmentId("");
        payCommitmentRequest.setCommitmentStatus(CommitmentStatus.NOT_PAID);
        payCommitmentRequest.setCurrencyType(CurrencyType.TL);
        payCommitmentRequest.setPaymentType(PaymentType.AUTO);

        ResponseMessage responseMessage = paymentWebServiceImp.payCommitment(payCommitmentRequest);
        System.out.println(responseMessage.getResponse());
        /*****
         * PayLoan (Borç Ödeme)
         */

        PayLoanRequest payLoanRequest = new PayLoanRequest();
        payLoanRequest.setFileId(0);
        payLoanRequest.setPaymentType(PaymentType.AUTO);
        payLoanRequest.setCurrencyType(CurrencyType.TL);
        payLoanRequest.setPaymentAmount(123);
        ResponseMessage responseMessage1 = paymentWebServiceImp.payLoan(payLoanRequest);
        System.out.println(responseMessage1.getResponse());

    }

}
