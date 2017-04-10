/**
 * 
 */
package org.platform.services.api1.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.platform.services.api1.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Brook
 *
 */
@Service
public class UserService {
	
	private List<User> allUserList ;
	
	@Value("${api1.user.count}")
	private int userCount;
	
	@PostConstruct
	public void init(){
		allUserList = new ArrayList<>();
		for(int i = 1 ; i < userCount+1 ; i ++){
			allUserList.add(
					new User().setAddress("user address "+i)
						.setEmail(i+"@test.com")
						.setGender("Female")
						.setMobileNo(""+i)
						.setUserName("username"+i));
		}
	}
	
	
	public List<User> getUserList(){		
		return allUserList;
	}
	
	
	public User getUser(String username){		
		List<User> list = allUserList.stream().filter((ele)->ele.getUserName().equals(username)).collect(Collectors.toList());
		return list.size()>0?list.get(0):null;
	}

}
