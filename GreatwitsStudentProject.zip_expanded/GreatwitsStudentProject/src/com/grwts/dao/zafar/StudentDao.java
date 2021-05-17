package com.grwts.dao.zafar;

import java.util.ArrayList;
import java.util.Iterator;

import com.grwts.Pojo.zafar.StudentVo;
import com.grwts.query.excute.zafar.QuerryExcutor;

public class StudentDao {
	final static String sql="select *from StudentProject";
	
	public ArrayList<StudentVo>  display() {
		QuerryExcutor wobj=new QuerryExcutor();
		 ArrayList<StudentVo> arobj=wobj.executeQuerry(sql);
		 
		
		 return arobj;
	}
	
		
		
	
	public boolean insert(StudentVo sobj)
	{
		System.out.println(sobj.getCity());
		String sql="insert into StudentProject values(\""+sobj.getStudent_Name()+"\",\""+sobj.getCity()+"\",\""+sobj.getPhoneNumber()+"\",\""+sobj.getEmail()+"\",\""+sobj.getDeparment()+"\")";
		System.out.println(sql);
		QuerryExcutor wobj=new QuerryExcutor();
		boolean validate= wobj.executeInseart(sql);
		return validate;

	}

}