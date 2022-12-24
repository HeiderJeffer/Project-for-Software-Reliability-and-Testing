package com.wuerth.phoenix.cis.university.example2.util;

import java.util.ArrayList;

import com.wuerth.phoenix.cis.university.example2.adapters.Company;

public class Scenario {

	public ArrayList<Company> companyList = new ArrayList<>();
	public Combination combination;
	public Settings settings;
	
	
	public Scenario(ArrayList<Company> companyList, Combination combination, Settings settings) {
		getCompanyList().addAll(companyList);
		setCombination(combination);
		setSettings(settings);
	}
	
	
	public ArrayList<Company> getCompanyList() {
		return companyList;
	}

	public Combination getCombination() {
		return combination;
	}
	
	public void setCombination(Combination combination) {
		this.combination = combination;
	}
	
	public Settings getSettings() {
		return settings;
	}
	
	public void setSettings(Settings settings) {
		this.settings = settings;
	}
}
