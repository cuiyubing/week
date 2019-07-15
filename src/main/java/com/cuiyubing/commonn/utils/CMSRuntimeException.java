package com.cuiyubing.commonn.utils;
/**
 * 
 * @ClassName: CMSRuntimeException 
 * @Description: 在工具包工程中编写自定义运行时异常类
 * @author:cyb 
 * @date: 2019年7月15日 上午8:47:08
 */
public class CMSRuntimeException extends RuntimeException {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	public CMSRuntimeException() {
		super();
	}
	public CMSRuntimeException(String message) {
		super(message);
	}

}
