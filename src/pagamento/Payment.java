package pagamento;

import java.util.Date;

public class Payment {
	
	private Billet billet;
	private Date paymentDate;
	private double valuePayed;
	private PaymentMethod paymentMethod;
	
	public Payment() {
		super();
	}
	
	public Payment(Billet billet, Date paymentDate, double valuePayed, PaymentMethod paymentMethod) {
		super();
		this.billet = billet;
		this.paymentDate = paymentDate;
		this.valuePayed = valuePayed;
		this.paymentMethod = paymentMethod;
	}

	public Billet getBillet() {
		return billet;
	}
	public void setBillet(Billet billet) {
		this.billet = billet;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getValuePayed() {
		return valuePayed;
	}
	public void setValuePayed(double valuePayed) {
		this.valuePayed = valuePayed;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
}