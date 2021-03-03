package pagamento;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BilletProcessorTest {

	BilletProcessor billetProcessor;
	Invoice invoice;
	ArrayList<Billet> billetList;

	@BeforeEach
	public void init() {
		System.out.println("iniciando");
		billetProcessor = new BilletProcessor();

		invoice = new Invoice(new Date(), 1500.00, "José");

		billetList = new ArrayList<Billet>();
	}

	@DisplayName("Testa geração de pagamentos a partir de uma lista de boletos")
	@Test
	public void testGetPaymentList() {
		double expected = 0;
		billetList.add(new Billet("0010001111001001000001", new Date(), 1500.00));
		
		for (Billet billet: billetList) {
			expected += billet.getValue();
		}

		ArrayList<Payment> list = billetProcessor.getPaymentList(billetList);

		double totalValue = 0;
		for (Payment payment : list) {
			System.out.println(payment.getValuePayed());
			totalValue += payment.getValuePayed();
		}

		Assertions.assertEquals(expected, totalValue);
	}
	
	@DisplayName("Testa o somatório da lista de pagamentos")
	@Test
	public void testGetSumPaymentsValue() {
		double expected = 0;
		billetList.add(new Billet("0010001111001001000001", new Date(), 1500.00));
		billetList.add(new Billet("0010001111001001000001", new Date(), 1000.00));
		
		for (Billet billet: billetList) {
			expected += billet.getValue();
		}
		
		ArrayList<Payment> paymentList = billetProcessor.getPaymentList(billetList);
		
		
		Assertions.assertEquals(expected, billetProcessor.getSumPaymentsValue(paymentList));
	}
	

}
