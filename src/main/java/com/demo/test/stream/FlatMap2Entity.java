package com.demo.test.stream;

import java.util.List;

public class FlatMap2Entity {
private String id;
private String name;
private List<String> companyHeadquater;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public List<String> getCompanyHeadquater() {
	return companyHeadquater;
}
public void setCompanyHeadquater(List<String> companyHeadquater) {
	this.companyHeadquater = companyHeadquater;
}
@Override
public String toString() {
	return "FlatMap2Entity [id=" + id + ", name=" + name + ", companyHeadquater=" + companyHeadquater + "]";
}
public FlatMap2Entity(String id, String name, List<String> companyHeadquater) {
	super();
	this.id = id;
	this.name = name;
	this.companyHeadquater = companyHeadquater;
}

}
