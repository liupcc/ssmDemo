/**    
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liup_cc     
 * @date:   2020年9月24日 上午12:14:34   //2020年9月24日
 * @version V1.0 
 *  
 * 不积跬步无以至千里
 */
package com.liup.cc.manager.impl;

import org.springframework.stereotype.Service;

import com.liup.cc.domain.User;
import com.liup.cc.manager.IUserManager;
import com.liup.cc.manager.base.impl.BaseManagerImpl;
import com.liup.cc.mapper.UserMapper;

/**     
 * @author: liup_cc 
 * @date:   2020年9月24日 上午12:14:34   
 *     
 * 
 */

@Service
public class UserManagerImpl extends BaseManagerImpl<User, UserMapper> implements IUserManager {

}
