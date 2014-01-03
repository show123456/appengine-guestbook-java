package com.bosboy.entity;

import com.googlecode.objectify.annotation.Id;

public class BaseEntity implements java.io.Serializable {
	@Id
	protected Long id;
}
