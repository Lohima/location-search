package model;

import java.util.List;

public class Prediction {

	private String description;
	private int distance_meters;
	private String id;
	private List<Matched_substrings> matched_substrings;
	private String place_id;
	private String reference;
	private List<Terms> terms;
	private List<String> types;

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDistance_meters(int distance_meters) {
		this.distance_meters = distance_meters;
	}

	public int getDistance_meters() {
		return this.distance_meters;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setMatched_substrings(List<Matched_substrings> matched_substrings) {
		this.matched_substrings = matched_substrings;
	}

	public List<Matched_substrings> getMatched_substrings() {
		return this.matched_substrings;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public String getPlace_id() {
		return this.place_id;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getReference() {
		return this.reference;
	}

	public void setTerms(List<Terms> terms) {
		this.terms = terms;
	}

	public List<Terms> getTerms() {
		return this.terms;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public List<String> getTypes() {
		return this.types;
	}
}