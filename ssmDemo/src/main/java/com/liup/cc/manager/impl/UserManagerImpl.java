/**    
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: liup_cc     
 * @date:   2020��9��24�� ����12:14:34   //2020��9��24��
 * @version V1.0 
 *  
 * �����Ͳ�������ǧ��
 */
package com.liup.cc.manager.impl;

import org.springframework.stereotype.Service;

import com.liup.cc.domain.User;
import com.liup.cc.manager.IUserManager;
import com.liup.cc.manager.base.impl.BaseManagerImpl;
import com.liup.cc.mapper.UserMapper;

/**     
 * @author: liup_cc 
 * @date:   2020��9��24�� ����12:14:34   
 *     
 * 
 */

@Service
public class UserManagerImpl extends BaseManagerImpl<User, UserMapper> implements IUserManager {

}
