package com.spring.dao.menu;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.dto.MenuVO;

public interface MenuDAO {

	// 메인메뉴
	List<MenuVO> selectMainMenu() throws SQLException;

	// 서브메뉴
	List<MenuVO> selectSubMenu(String mCode) throws SQLException;

	// 메뉴정보
	MenuVO selectMenuByMcode(String mCode) throws SQLException;
	MenuVO selectMenuByMname(String mName) throws SQLException;
}







