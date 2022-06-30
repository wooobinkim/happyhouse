package com.ssafy.dto;

public class FacilityCategorySearchDTO {
	private String dongcode;
	private String category;
	private String categoryvalue;
	
	public FacilityCategorySearchDTO() {
		super();
	}
	public FacilityCategorySearchDTO(String dongcode, String category, String categoryvalue) {
		super();
		this.dongcode = dongcode;
		this.category = category;
		this.categoryvalue = categoryvalue;
	}
	public String getDongcode() {
		return dongcode;
	}
	public void setDongcode(String dongcode) {
		this.dongcode = dongcode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategoryvalue() {
		return categoryvalue;
	}
	public void setCategoryvalue(String categoryvalue) {
		this.categoryvalue = categoryvalue;
	}
	@Override
	public String toString() {
		return "FacilityCategorySearchDTO [dongcode=" + dongcode + ", category=" + category + ", categoryvalue="
				+ categoryvalue + "]";
	}

	
	
		
	
	

}
