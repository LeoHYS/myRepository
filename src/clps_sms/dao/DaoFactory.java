 
/**  
 * All rights Reserved, Designed By Android_Robot   
 * @Title:  DaoFactory.java   
 * @Package clps_sms.dao   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: Android_Robot     
 * @date:   Aug 16, 2017 9:54:44 PM   
 * @version V1.0     
 */    
  
package clps_sms.dao;   
/**   
 * @ClassName:  DaoFactory   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Android_Robot  
 * @date:   Aug 16, 2017 9:54:44 PM   
 *      
 */

import clps_sms.dao.impl.AccountDaoImpl;
import clps_sms.dao.impl.MenuDaoImpl;
import clps_sms.dao.impl.RoleDaoImpl;

public class DaoFactory {
	
	public AccountDao getAccountDaoInstance() {
		return new AccountDaoImpl();
		
	}
	public RoleDao getRoleDaoInstance() {
		return new RoleDaoImpl();
	}
	public MenuDao getMenuDaoInstance() {
		return new MenuDaoImpl();
	}
	

}
  