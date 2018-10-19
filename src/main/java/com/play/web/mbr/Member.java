package com.play.web.mbr;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Lazy @Data
@Component
public class Member {
	String member_id, name, password, birthdate, joindate, gender, phone, customer_grade, nickname, address, zipcode, profileimg;
	int age, customer_no, point;
}
