package com.play.web.mbr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.play.web.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper mbrmap;
	@Override
	public String countAll() {
		return mbrmap.countAll();
	}

}
