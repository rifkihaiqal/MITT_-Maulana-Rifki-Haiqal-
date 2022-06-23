package com.example.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import com.example.model.ReqCommonApi;

@Mapper
public interface RestMapper {
	
	@Insert("insert into userSkills"
			+ "userSkillId,"
			+ "username,"
			+ "skillId,"
			+ "skillLevelId"
			+ "values"
			+"(#{userSkillId, jdbcType = VARCHAR}, "
			+ "#{username, jdbcType = VARCHAR}, "
			+ "#{skillId, jdbcType = NUMERIC}, "
			+ "#{skillLevelId, jdbcType = NUMERIC}, ")
	void apiCreate(ReqCommonApi reqCommonApi) throws DataAccessException;
}