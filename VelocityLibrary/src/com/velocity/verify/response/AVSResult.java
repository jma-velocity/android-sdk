package com.velocity.verify.response;

import com.velocity.gson.annotations.SerializedName;



public class AVSResult {
	@SerializedName("ActualResult")
	private String actualResult;
	@SerializedName("CityResult")
	private String cityResult;
	@SerializedName("AddressResult")
    private String addressResult;
	@SerializedName("CountryResult")
	private String countryResult;
	@SerializedName("StateResult")
	private String stateResult;
	@SerializedName("PostalCodeResult")
	private String postalCodeResult;
	@SerializedName("PhoneResult")
	private String phoneResult;
	@SerializedName("CardholderNameResult")
    private String cardholderNameResult;
	
	
	public String getAddressResult() {
		return addressResult;
	}

	public void setAddressResult(String addressResult) {
		this.addressResult = addressResult;
	}

	public String getCountryResult() {
		return countryResult;
	}

	public void setCountryResult(String countryResult) {
		this.countryResult = countryResult;
	}

	public String getStateResult() {
		return stateResult;
	}

	public void setStateResult(String stateResult) {
		this.stateResult = stateResult;
	}

	public String getPostalCodeResult() {
		return postalCodeResult;
	}

	public void setPostalCodeResult(String postalCodeResult) {
		this.postalCodeResult = postalCodeResult;
	}

	public String getPhoneResult() {
		return phoneResult;
	}

	public void setPhoneResult(String phoneResult) {
		this.phoneResult = phoneResult;
	}

	public String getCardholderNameResult() {
		return cardholderNameResult;
	}

	public void setCardholderNameResult(String cardholderNameResult) {
		this.cardholderNameResult = cardholderNameResult;
	}

	public String getActualResult() {
		return actualResult;
	}

	public void setActualResult(String actualResult) {
		this.actualResult = actualResult;
	}

	public String getCityResult() {
		return cityResult;
	}

	public void setCityResult(String cityResult) {
		this.cityResult = cityResult;
	}
	
}
