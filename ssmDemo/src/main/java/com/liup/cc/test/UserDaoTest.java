/**    
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: liup_cc     
 * @date:   2020��9��24�� ����10:59:34   //2020��9��24��
 * @version V1.0 
 * �����Ͳ�������ǧ��
 */
package com.liup.cc.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.liup.cc.domain.User;
import com.liup.cc.mapper.UserMapper;

/**     
 * @author: liup_cc 
 * @date:   2020��9��24�� ����10:59:34   
 *     
 * 
 */
public class UserDaoTest extends BaseTest{
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testQuery(){
		User user = new User();
		List<User> list = userMapper.getList(user);
		for(User u : list){
			System.out.println(u.getUserName());
		}
	}
	
}
