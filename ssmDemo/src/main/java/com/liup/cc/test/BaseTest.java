/**    
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: liup_cc     
 * @date:   2020��9��24�� ����10:56:43   //2020��9��24��
 * @version V1.0 
 * �����Ͳ�������ǧ��
 */
package com.liup.cc.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**     
 * @author: liup_cc 
 * @date:   2020��9��24�� ����10:56:43   
 *     
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
