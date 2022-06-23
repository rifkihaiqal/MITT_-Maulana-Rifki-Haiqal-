package com.example.controller;

import java.util.concurrent.Callable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.ReqCommonApi;
import com.example.model.ResCommonApi;
import com.example.model.ResponseCode;
import com.example.service.RestService;


	@Controller
	public class RestController {
		
		private RestService restService;

		@RequestMapping(value = "/api/create", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiCreate(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiCreate(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/update", method = RequestMethod.PUT, produces = "application/json")
		public Callable<ResCommonApi> apiUpdate(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiUpdate(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/delete", method = RequestMethod.DELETE, produces = "application/json")
		public Callable<ResCommonApi> apiDelete(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiDelete(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/getUserSkill/username", method = RequestMethod.GET, produces = "application/json")
		public Callable<ResCommonApi> apiGetUserSkillUsername(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiGetUserSkillUsername	(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/login", method = RequestMethod.GET, produces = "application/json")
		public Callable<ResCommonApi> apiLogin(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiLogin(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		

		@RequestMapping(value = "/api/logout", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiLogout(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiLogout(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/getSkillLevel", method = RequestMethod.GET, produces = "application/json")
		public Callable<ResCommonApi> apiGetSkillsLevel(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiGetSkillsLevel(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/createSkillLevelId", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiCreateSkillLevelId(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiCreateSkillLevelId(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/update/SkillLevelId", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiUpdateSkillLevel(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiUpdateSkillLevel(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/delete/skillLevelId", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiDeleteSkillLevel(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiDeleteSkillLevel(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/getSkills", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiGetSkills(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiGetSkills(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/get/skillsId", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiGetSkillsId(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiGetSkillsId(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/createSkill", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiCreateSkill(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiCreateSkill(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/update/skilId", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiUpdateSkilId(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiUpdateSkilId(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
		@RequestMapping(value = "/api/delete/skilId", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiDeleteSkilId(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiDeleteSkillId(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		@RequestMapping(value = "/api/register", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiRegisterUserProfile(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiDeleteSkillId(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		@RequestMapping(value = "/api/update", method = RequestMethod.POST, produces = "application/json")
		public Callable<ResCommonApi> apiUpdateUserProfile(HttpServletRequest request,
				@RequestBody ReqCommonApi reqCommonApi){
			
			Callable<ResCommonApi> callable = null;
			try {
				callable = () -> restService.apiDeleteSkillId(reqCommonApi, request);
			} catch (Exception e) {
				ResCommonApi response=new ResCommonApi();
				response.setResponseCode(ResponseCode.SYSTEM_ERROR);
				response.setResponseMessage(e.toString());
				callable = () -> response;
			}
			return callable ;
		}
		
}
