package com.pluralsight.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.pluralsight.service.ProteinTrackingService;

public class EnterProteinAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5150728491684393188L;
	
	private int enteredProtein;

	@Override
	public String execute() throws Exception {
		
		ProteinTrackingService proteinTrackingService = new ProteinTrackingService();
		proteinTrackingService.AddProtein(enteredProtein);

		return SUCCESS;
	}

	public int getEnteredProtein() {
		return enteredProtein;
	}

	public void setEnteredProtein(int enteredProtein) {
		this.enteredProtein = enteredProtein;
	}
	
	public String getGoalText() {
		return getText("goal.text");
	}

}
