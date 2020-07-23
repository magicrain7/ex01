package co.micol.ex01.view;

import java.util.ArrayList;
import java.util.List;

import co.micol.ex01.db.BoardList;
import co.micol.ex01.db.BoardMember;
import co.micol.ex01.db.MemberServiceImpl;
import co.micol.ex01.db.MemberVo;

public class MemberView { // 모든 멤버의 리스트를 보여주는 class
	private MemberServiceImpl ms = new MemberServiceImpl();
	
	public void memberView() {
		List<MemberVo> member = new ArrayList<MemberVo>();
		member = ms.selectAllMember();
		for(MemberVo vo : member) {
			vo.toString();
		}
	}
	public void boardList() {
		List<BoardMember> list = new ArrayList<BoardMember>();
		BoardList bm = new BoardList(); //crud class 호출
		list = bm.selectAllMember();
		for(BoardMember vo : list) {
			vo.toString();
		}
	}
}