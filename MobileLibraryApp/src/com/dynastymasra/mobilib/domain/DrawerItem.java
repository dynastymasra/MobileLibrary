package com.dynastymasra.mobilib.domain;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class DrawerItem {

	private String ItemName;
	private Integer imgResID;
	private String title;
	private Boolean isUser;

	public DrawerItem(String itemName, Integer imgResID) {
		this.ItemName = itemName;
		this.imgResID = imgResID;
        this.isUser = false;
	}

	public DrawerItem(Boolean isUser) {
		this.isUser = isUser;
	}

	public DrawerItem(String title) {
        this.isUser = false;
		this.title = title;
	}

	public String getItemName() {
		return ItemName;
	}

	public Integer getImgResID() {
		return imgResID;
	}

	public String getTitle() {
		return title;
	}

	public Boolean isUser() {
		return isUser;
	}
}
