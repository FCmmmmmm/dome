/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.fcmmmmmm.data.imp 
 * @author: FCmmmmmm   
 * @date: 2018年7月30日 下午5:58:58 
 */
package com.fcmmmmmm.data.imp;

import java.util.ArrayList;
import java.util.List;

import com.fcmmmmmm.data.Respository;
import com.fcmmmmmm.data.RespositoryInterface;

/**
 * @author FCmmmmmm
 *
 */
public class ResImp implements RespositoryInterface {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.fcmmmmmm.data.RespositoryInterface#findDataByIndex(int, int)
	 */
	public static List<Respository> respositorys = new ArrayList<>();

	@Override
	public List<Respository> findDataByIndex(int statIndex, int endIndex) {
		for (int i = 0; i < 10; i++) {
			Respository respository = new Respository();
			respository.setId(i + "");
			respository.setDec("do");
			respositorys.add(respository);
		}
		try {
			//没有界限判断
			List<Respository> res = respositorys.subList(statIndex, endIndex);
			// 考虑多线程关系 这里可能会出现问题 但这是测试 忽略他们
			respositorys.clear();
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
