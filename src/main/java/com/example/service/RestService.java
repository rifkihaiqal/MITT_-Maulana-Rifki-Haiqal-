package com.example.service;

import javax.servlet.http.HttpServletRequest;

import com.example.model.ReqCommonApi;
import com.example.model.ResCommonApi;


public interface RestService {

	//User Skills
	public ResCommonApi apiCreate (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiUpdate (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiDelete (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiGetUserSkillUsername (ReqCommonApi reqCommonApi, HttpServletRequest request);
	
	//User
	public ResCommonApi apiLogin (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiLogout (ReqCommonApi reqCommonApi, HttpServletRequest request);
	
	//Skill Level
	public ResCommonApi apiGetSkillsLevel (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiCreateSkillLevelId (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiUpdateSkillLevel (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiDeleteSkillLevel (ReqCommonApi reqCommonApi, HttpServletRequest request);
	
	//Skill
	public ResCommonApi apiGetSkills (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiGetSkillsId (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiCreateSkill (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiUpdateSkilId (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiDeleteSkillId (ReqCommonApi reqCommonApi, HttpServletRequest request);
	
	//User Profile
	public ResCommonApi apiRegisterUserProfile (ReqCommonApi reqCommonApi, HttpServletRequest request);
	public ResCommonApi apiUpdateUserProfile (ReqCommonApi reqCommonApi, HttpServletRequest request);
	
}
