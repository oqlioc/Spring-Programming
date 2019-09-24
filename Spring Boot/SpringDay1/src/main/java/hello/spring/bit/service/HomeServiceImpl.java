package hello.spring.bit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hello.spring.bit.dao.HomeDAO;
import hello.spring.bit.dto.UserDTO;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeDAO dao;

	@Override
	public boolean login(UserDTO userDTO) {
		
		return dao.login(userDTO);
	}

	@Override
	public String join(UserDTO userDTO) {
		
		return dao.join(userDTO);
	}

	@Override
	public List<UserDTO> list(UserDTO userDTO) {
		return dao.memberlist(userDTO);
	}

	@Override
	public UserDTO info(String id) {
		return dao.memberinfo(id);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);
	}
	
	
}
