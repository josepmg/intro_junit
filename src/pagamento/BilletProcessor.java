package pagamento;

import java.util.ArrayList;
import java.util.Date;

public class BilletProcessor {
	
	public Invoice processPayment(Invoice invoice, ArrayList<Billet> billets) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Payment> getPaymentList(ArrayList<Billet> billetList) {
		ArrayList<Payment> paymentList = new ArrayList<Payment>();
		
		paymentList.add(new Payment(new Billet("0010001111001001000001", new Date(), 1500.00), new Date(), 1500.00, PaymentMethod.BILLET));
		
		return paymentList;
	}
	
	public double getSumPaymentsValue(ArrayList<Payment> paymentList) {
		throw new UnsupportedOperationException();
	}
}