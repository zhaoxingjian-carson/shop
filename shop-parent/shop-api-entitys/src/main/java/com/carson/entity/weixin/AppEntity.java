package com.carson.entity.weixin;

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

	public AppEntity(String appId, String appSecret) {
		this.appId = appId;
		this.appSecret = appSecret;
	}
}