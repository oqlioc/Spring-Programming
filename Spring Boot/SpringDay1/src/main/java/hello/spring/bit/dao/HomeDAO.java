package hello.spring.bit.dao;

import java.util.List;

import hello.spring.bit.dto.UserDTO;

public interface HomeDAO {

	
	//String info();
	boolean login(UserDTO userDTO);
	String join(UserDTO userDTO);
	public List<UserDTO> memberlist(UserDTO userDTO);
	public UserDTO memberinfo(String id);
	public void delete(String id);

}
