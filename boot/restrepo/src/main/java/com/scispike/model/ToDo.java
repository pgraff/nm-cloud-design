package com.scispike.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class ToDo {
	@Id private String id;

	private String title;
	private String description;
	private Date whenDue;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getWhenDue() {
		return whenDue;
	}
	public void setWhenDue(Date whenDue) {
		this.whenDue = whenDue;
	}
}