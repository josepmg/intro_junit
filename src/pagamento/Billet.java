package pagamento;

import java.util.Date;

public class Billet {
	
	private String barcode;
	private Date overdueDate;
	private double value;
		
	public Billet() {
		super();
	}

	public Billet(String barcode, Date overdueDate, double value) {
		super();
		this.barcode = barcode;
		this.overdueDate = overdueDate;
		this.value = value;
	}

	public String getBarcode() {
		return barcode;
	}
	
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	public Date getOverdueDate() {
		return overdueDate;
	}
	
	public void setOverdueDate(Date overdueDate) {
		this.overdueDate = overdueDate;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}

}