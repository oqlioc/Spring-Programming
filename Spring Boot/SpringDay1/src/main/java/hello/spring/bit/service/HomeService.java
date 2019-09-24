package hello.spring.bit.service;

import java.util.List;

import hello.spring.bit.dto.UserDTO;

public interface HomeService {
	
	boolean login(UserDTO userDTO);
	String join(UserDTO userDTO);
	public List<UserDTO> list(UserDTO userDTO);
	public UserDTO info(String id);
	public void delete(String id);
}
