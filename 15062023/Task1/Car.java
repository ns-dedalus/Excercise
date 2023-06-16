package com.dal.setter;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Car {
@Value("Hyndai")
private String name;
@Value("Verna")
private String model;
@Value("1690")
private int carnumber;
public String getName() {
	return name;
}
public int getCarnumber() {
	return carnumber;
}
@Override
public String toString() {
	return "Car [name=" + name + ", model=" + model + ", carnumber=" + carnumber+"]";
}
public void setName(String name) {
	this.name = name;
}
public void setCarnumber(int carnumber) {
	this.carnumber = carnumber;
	
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
//public Car(String name, String model) {
//	super();
//	this.name = name;
//	this.model = model;
//}
}
