package com.carson.weixin.entity;

import lombok.Data;

import java.text.MessageFormat;

@Data
public class AppEntity {

	/**
	 * 应用id
	 */
	private String appId;
	/**
	 * 应用密钥
	 */
	private String appSecret;

	public AppEntity() {

	}

	public static void main(String[] args) {
		System.out.println(MessageFormat.format("A good news for you! Download BoC Pay now to get HK${0} Rewards upon every successful registration/binding, you can also enjoy extra rewards at different merchants. Download BoC Pay at https://www.bochk.com/creditcard/BOCPAY/download_app/eng/ right away! Don''t forget to input my Invitation Code{1}. ", "123", "123123"));
	}
	public AppEntity(String appId, String appSecret) {
		this.appId = appId;
		this.appSecret = appSecret;
	}
}