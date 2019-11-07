package com.carson.service.weixin;

import com.carson.entity.weixin.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface AppService {

	/**
	 * 获取app应用信息
	 * 
	 * @return
	 */
	@GetMapping("/getApp")
	public AppEntity getApp();

}
