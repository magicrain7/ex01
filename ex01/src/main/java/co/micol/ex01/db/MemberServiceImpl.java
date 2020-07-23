package co.micol.ex01.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public  class MemberServiceImpl implements Service<MemberVo> {

	private Connection conn; //= DbConnect.getConnection();
	private PreparedStatement psmt;
	private ResultSet rs;
	
	private final String SELECT_ALL = "select * from member";
	
	@Override
	public MemberVo selectMember(MemberVo vo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int insertMember(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int updateMember(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int deleteMember(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public List<MemberVo> selectAllMember() {
		return null;
	}
	
	private void close()  throws SQLException{ // connection을 종료한다.
		
		if(rs != null) rs.close();
		if(psmt != null) psmt.close();
		if(conn != null) conn.close();
		
	}

}
