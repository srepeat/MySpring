package cn.school.bean;

public class Menu {
	/*
	  `mid` BIGINT(20) NOT NULL AUTO_INCREMENT,
	  `menu_name` VARCHAR(255) DEFAULT NULL,
	  `menu_state` INT(11) DEFAULT NULL,
	  `menu_url` VARCHAR(255) DEFAULT NULL,
	 */
	
	private Integer mid;
	private String menuName;
	private Integer menuState;
	private String menuUrl;
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Integer getMenuState() {
		return menuState;
	}
	public void setMenuState(Integer menuState) {
		this.menuState = menuState;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	
}
