package com.book.exception;

import com.zxq.exception.ResultJsonException;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler{

	
	@ExceptionHandler(Exception.class)
	public JSONObject tryException(Exception e) {
		e.printStackTrace();
		return addJsonData("1", "系统异常",null);
	}

	@ExceptionHandler(ResultJsonException.class)
	public JSONObject resultJson(ResultJsonException e) {
		System.out.println("this is result json execeee"+e);
		e.printStackTrace();
		return addJsonData(e.getResult(), e.getMsg(), e.getData());
	}

	private JSONObject addJsonData(String code,String msg,Object data) {
		JSONObject json = new JSONObject();
		json.put("result",code);
		json.put("msg",msg);
		json.put("data",data);
		return json;
	}
}
