package com.play.web.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	public String countAll();
}
