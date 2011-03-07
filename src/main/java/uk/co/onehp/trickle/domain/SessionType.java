package uk.co.onehp.trickle.domain;

public enum SessionType {
	
	EXCHANGE("exchange"),
	
	GLOBAL("global");
	
	private final String type;
	
	SessionType(String type){
		this.type = type;
	}

	public String getType() {
		return type;
	}

}