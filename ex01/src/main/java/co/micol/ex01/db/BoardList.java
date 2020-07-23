package co.micol.ex01.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardList implements Service<BoardMember> {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	private final String BOARD_LIST = "select rno, name, title, contents" + 
									" from member , board" + 
									" where member.id= board.id";
	
	@Override
	public List<BoardMember> selectAllMember() {
		List<BoardMember> list = new ArrayList<BoardMember>();
		BoardMember vo;
		try {
			conn = DbConnect.getConnection();
			psmt = conn.prepareStatement(BOARD_LIST);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new BoardMember();
				vo.setRno(rs.getInt("rno"));
				vo.setName(rs.getString("name"));
				vo.setTitle(rs.getString("title"));
				vo.setContents(rs.getString("contents"));
				list.add(vo);
			}
			close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insertMember(BoardMember vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMember(BoardMember vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(BoardMember vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardMember selectMember(BoardMember vo) {
		// TODO Auto-generated method stub
		return null;
	}
	private void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
