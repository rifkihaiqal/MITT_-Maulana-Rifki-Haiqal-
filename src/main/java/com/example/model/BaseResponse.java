package com.example.model;

import java.io.Serializable;

public class BaseResponse implements Serializable, BaseResponseInterface {
		
		private static final long serialVersionUID = 6103609191672960935L;
		
		private String responseCode;
		
		private String responseMessage;
		
		public String getResponseCode() {
			return responseCode;
		}
		public void setResponseCode(String responseCode) {
			this.responseCode = responseCode;
		}
		public String getResponseMessage() {
			return responseMessage;
		}
		public void setResponseMessage(String responseMessage) {
			this.responseMessage = responseMessage;
		}

}
