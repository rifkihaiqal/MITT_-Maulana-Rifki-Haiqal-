package com.example.service.serviceimpl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.transaction.interceptor.TransactionInterceptor;

import com.example.dao.RestMapper;
import com.example.model.ReqCommonApi;
import com.example.model.ResCommonApi;
import com.example.model.ResponseCode;

public class RestServiceImpl {
	private RestMapper restMapper;

	public ResCommonApi apiCreate(ReqCommonApi reqCommonApi, HttpServletRequest request){
		ResCommonApi response = new ResCommonApi();
		try {
			
			restMapper.apiCreate(reqCommonApi);
			
		}catch(Exception e) {
			e.printStackTrace();
			response.setResponseCode(ResponseCode.INVALID_DATA);
			response.setResponseMessage(ResponseCode.INVALID_DATA);
			TransactionInterceptor.currentTransactionStatus().setRollbackOnly();
		}
		return response;
	}
	public ResCommonApi apiUpdate(ReqCommonApi reqCommonApi, HttpServletRequest request){
		ResCommonApi response = new ResCommonApi();
		try {
			
			restMapper.apiUpdate(reqCommonApi);
			
		}catch(Exception e) {
			e.printStackTrace();
			response.setResponseCode(ResponseCode.INVALID_DATA);
			response.setResponseMessage(ResponseCode.INVALID_DATA);
			TransactionInterceptor.currentTransactionStatus().setRollbackOnly();
		}
		return response;
	}
	public ResCommonApi apiDelete(ReqCommonApi reqCommonApi, HttpServletRequest request){
		ResCommonApi response = new ResCommonApi();
		try {
			
			restMapper.apiCreate(reqCommonApi);
			
		}catch(Exception e) {
			e.printStackTrace();
			response.setResponseCode(ResponseCode.INVALID_DATA);
			response.setResponseMessage(ResponseCode.INVALID_DATA);
			TransactionInterceptor.currentTransactionStatus().setRollbackOnly();
		}
		return response;
	}
	public ResCommonApi apiGetUserSkillUsername(ReqCommonApi reqCommonApi, HttpServletRequest request){
		ResCommonApi response = new ResCommonApi();
		try {
			
			restMapper.apiCreate(reqCommonApi);
			
		}catch(Exception e) {
			e.printStackTrace();
			response.setResponseCode(ResponseCode.INVALID_DATA);
			response.setResponseMessage(ResponseCode.INVALID_DATA);
			TransactionInterceptor.currentTransactionStatus().setRollbackOnly();
		}
		return response;
	}
}
