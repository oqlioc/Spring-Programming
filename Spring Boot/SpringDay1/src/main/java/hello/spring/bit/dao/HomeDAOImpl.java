package hello.spring.bit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hello.spring.bit.dto.UserDTO;

@Repository
public class HomeDAOImpl implements HomeDAO {

	@Autowired
	SqlSession session;

	/*
	 * @Override public String info() { // TODO Auto-generated method stub String
	 * name = "하나"; String result = session.selectOne("info.selectGrade", name); //
	 * selectOne(mapper의 select id, String 이름)
	 * 
	 * return "result"; }
	 */

	@Override
	public boolean login(UserDTO userDTO) {

		String login_res = session.selectOne("info.select_user", userDTO);

		if (login_res != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String join(UserDTO userDTO) {

		int join_res = session.insert("info.insert_user", userDTO);
		// insert 성공시 int 1을 리턴한다.
		if (join_res > 0) {
			System.out.println("HomeDAOImpl >> after insert "+join_res);
			return userDTO.getId();

		} else {
			System.out.println("HomeDAOImpl >> after insert "+join_res);
			return null;
		}
			
	}

	@Override
	public List<UserDTO> memberlist(UserDTO userDTO) {
		return session.selectList("info.selectMemberList", userDTO);
	}

	@Override
	public UserDTO memberinfo(String id) {
		return session.selectOne("info.selectMemberInfo", id);
	}

	@Override
	public void delete(String id) {
		session.delete("info.deleteMember", id);
	}

}
