package co.micol.ex01.db;

import java.util.List;

public interface Service<T>{
		public List<T> selectAllMember();
		public T selectMember(T vo);
		public int insertMember(T vo);
		public int updateMember(T vo);
		public int deleteMember(T vo);

		
}
