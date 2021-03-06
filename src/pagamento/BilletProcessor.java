package pagamento;

import java.util.ArrayList;
import java.util.Date;

public class BilletProcessor {

	public Invoice processPayment(Invoice invoice, ArrayList<Billet> billets) {
		invoice.setPaymentList(getPaymentList(billets));

		invoice.setStatus(
				getSumPaymentsValue(invoice.getPaymentList()) >= invoice.getTotalValue() ? InvoiceStatus.CLOSED
						: InvoiceStatus.OPEN);

		return invoice;
	}

	public ArrayList<Payment> getPaymentList(ArrayList<Billet> billetList) {
		ArrayList<Payment> paymentList = new ArrayList<Payment>();

		for (Billet billet : billetList)
			paymentList.add(new Payment(billet, new Date(), billet.getValue(), PaymentMethod.BILLET));

		return paymentList;
	}

	public double getSumPaymentsValue(ArrayList<Payment> paymentList) {
		double totalValue = 0;

		for (Payment payment : paymentList)
			totalValue += payment.getValuePayed();

		return totalValue;
	}
}