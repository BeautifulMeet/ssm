package com.cwj.dao;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cwj.pojo.Student;

@Repository
public class  StudentDao {
	
	
	
	@Resource
	private NamedParameterJdbcTemplate namedjdbctemp;
	

	@Transactional
	public Student queryStuById(String id){
		String sql = "select * from student where id =:id";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		return namedjdbctemp.queryForObject(sql, map,new BeanPropertyRowMapper<Student>(Student.class));
	}
	
//	public Student queryStuById(String id);
}
