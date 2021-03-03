package pagamento;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {

	private Date dateCreated;
	private double totalValue;
	private String clientName;
	private ArrayList<Payment> paymentList;
	private InvoiceStatus status;

	public Invoice() {
		super();
	}

	public Invoice(Date dateCreated, double totalValue, String clientName) {
		super();
		this.dateCreated = dateCreated;
		this.totalValue = totalValue;
		this.clientName = clientName;
		this.paymentList = new ArrayList<Payment>();
		this.status = InvoiceStatus.OPEN;
	}

	public Invoice(Date dateCreated, double totalValue, String clientName, ArrayList<Payment> paymentList,
			InvoiceStatus status) {
		super();
		this.dateCreated = dateCreated;
		this.totalValue = totalValue;
		this.clientName = clientName;
		this.paymentList = paymentList;
		this.status = status;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public ArrayList<Payment> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(ArrayList<Payment> paymentList) {
		this.paymentList = paymentList;
	}

	public InvoiceStatus getStatus() {
		return status;
	}

	public void setStatus(InvoiceStatus status) {
		this.status = status;
	}
	
	
}