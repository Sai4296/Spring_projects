package com.sai.Book.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServicesProducts {
    private String selection;
    private boolean enableInventoryTracking;
    private boolean multipleWarehouses;
    private boolean enableUnits;
    private String inventoryScheme;
    private boolean chargeOrTrackTax;
    private String taxItemSelection;
    private boolean enableTrackingTaxPaid;
	public String getSelection() {
		return selection;
	}
	public void setSelection(String selection) {
		this.selection = selection;
	}
	public boolean isEnableInventoryTracking() {
		return enableInventoryTracking;
	}
	public void setEnableInventoryTracking(boolean enableInventoryTracking) {
		this.enableInventoryTracking = enableInventoryTracking;
	}
	public boolean isMultipleWarehouses() {
		return multipleWarehouses;
	}
	public void setMultipleWarehouses(boolean multipleWarehouses) {
		this.multipleWarehouses = multipleWarehouses;
	}
	public boolean isEnableUnits() {
		return enableUnits;
	}
	public void setEnableUnits(boolean enableUnits) {
		this.enableUnits = enableUnits;
	}
	public String getInventoryScheme() {
		return inventoryScheme;
	}
	public void setInventoryScheme(String inventoryScheme) {
		this.inventoryScheme = inventoryScheme;
	}
	public boolean isChargeOrTrackTax() {
		return chargeOrTrackTax;
	}
	public void setChargeOrTrackTax(boolean chargeOrTrackTax) {
		this.chargeOrTrackTax = chargeOrTrackTax;
	}
	public String getTaxItemSelection() {
		return taxItemSelection;
	}
	public void setTaxItemSelection(String taxItemSelection) {
		this.taxItemSelection = taxItemSelection;
	}
	public boolean isEnableTrackingTaxPaid() {
		return enableTrackingTaxPaid;
	}
	public void setEnableTrackingTaxPaid(boolean enableTrackingTaxPaid) {
		this.enableTrackingTaxPaid = enableTrackingTaxPaid;
	}
}
