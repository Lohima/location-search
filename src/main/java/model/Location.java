package model;

import java.util.List;

public class Location {

	private String status;
	private List<Prediction> prediction;
	
	public Location() {

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPrediction(List<Prediction> prediction){
        this.prediction = prediction;
    }
    public List<Prediction> getPrediction(){
        return this.prediction;
    }

	@Override
	public String toString() {
		return "Location [status=" + status + ", prediction=" + prediction + "]";
	}
}
