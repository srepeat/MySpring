package cn.school.bean;

public class User {
	/*uid` BIGINT(20) NOT NULL AUTO_INCREMENT,
	  `nick_name` VARCHAR(255) NOT NULL,
	  `password` VARCHAR(255) NOT NULL,
	  `person_instructions` VARCHAR(255) DEFAULT NULL,
	  `photo_url` VARCHAR(255) DEFAULT NULL,
	  `username` VARCHAR(255) NOT NULL,
	  `history` VARCHAR(255) DEFAULT NULL,*/
	
	private Integer uid;
	private String nickName;
	private String password;
	private String personInstructions;
	private String photoUrl;
	private String username;
	private String history;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPersonInstructions() {
		return personInstructions;
	}
	public void setPersonInstructions(String personInstructions) {
		this.personInstructions = personInstructions;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	
}
