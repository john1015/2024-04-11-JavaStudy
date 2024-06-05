package com.sist.temp;

import java.util.*;
import lombok.Data;

/*
	ZIPCODE VARCHAR2(7),
	SIDO VARCHAR2(50),
	GUGUN VARCHAR2(50),
	DONG VARCHAR2(100),
	BUNJI VARCHAR2(100));
 */
@Data
public class ZipcodeVO {
	private String zipcode;
	private String sido;
	private String gugun;
	private String dong;
	private String bunji;

}
