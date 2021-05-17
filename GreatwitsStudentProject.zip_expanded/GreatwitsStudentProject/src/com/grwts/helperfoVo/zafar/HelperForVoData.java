package com.grwts.helperfoVo.zafar;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.grwts.Pojo.zafar.StudentVo;

public class HelperForVoData {
	public StudentVo convertRsultsetToVo(ResultSet rst) throws SQLException {
		
		StudentVo stdvo = new StudentVo();
			 stdvo.setStudent_Name(rst.getString(1));
			 stdvo.setCity(rst.getString(2));
			 stdvo.setPhoneNumber(rst.getString(3));
			 stdvo.setEmail(rst.getString(4));
			 stdvo.setDeparment(rst.getString(5));
		

		return stdvo;
	}

}
