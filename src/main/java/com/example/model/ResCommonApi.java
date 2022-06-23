package com.example.model;

public class ResCommonApi extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String userSkillId;
	String username;
	Integer skillId;
	Integer skillLevelid;
	
	public String getUserSkillId() {
		return userSkillId;
	}
	public void setUserSkillId(String userSkillId) {
		this.userSkillId = userSkillId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getSkillId() {
		return skillId;
	}
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}
	public Integer getSkillLevelid() {
		return skillLevelid;
	}
	public void setSkillLevelid(Integer skillLevelid) {
		this.skillLevelid = skillLevelid;
	}
	
}
