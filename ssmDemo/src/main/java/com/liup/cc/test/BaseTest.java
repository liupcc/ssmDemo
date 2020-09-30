/**    
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liup_cc     
 * @date:   2020年9月24日 下午10:56:43   //2020年9月24日
 * @version V1.0 
 * 不积跬步无以至千里
 */
package com.liup.cc.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**     
 * @author: liup_cc 
 * @date:   2020年9月24日 下午10:56:43   
 *     
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
