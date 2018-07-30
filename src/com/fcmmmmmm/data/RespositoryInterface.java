/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.fcmmmmmm.data 
 * @author: FCmmmmmm   
 * @date: 2018年7月30日 下午5:54:53 
 */
package com.fcmmmmmm.data;

import java.util.List;

/**
 * @author FCmmmmmm
 *
 */
public interface RespositoryInterface {
	/* List<Respository> lis=new ArrayList<>();//接口中创建的都是常量 */
	List<Respository> findDataByIndex(int statIndex,int endIndex);
}
