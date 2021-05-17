package com.grwts.query.excute.zafar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.grwts.Pojo.zafar.StudentVo;
import com.grwts.dbcon.zafar.DataBaseConnection;
import com.grwts.helperfoVo.zafar.HelperForVoData;

public class QuerryExcutor {
	public ArrayList<StudentVo> executeQuerry(String sql)
	{
		ArrayList<StudentVo> arrstudentvo=null;
		ResultSet rst=null;
		Statement stm=null;
		DataBaseConnection dbs=new DataBaseConnection();
		Connection connection=dbs.dbConnection();
		try {
		 stm=connection.createStatement();
		rst=stm.executeQuery(sql);
		if(rst!=null)
		{
			StudentVo stdv=null;
			arrstudentvo=new ArrayList<StudentVo>();
			 HelperForVoData hobj=new HelperForVoData();
			while(rst.next())
			{
			 stdv=new StudentVo();
			 stdv=hobj.convertRsultsetToVo(rst);
			 arrstudentvo.add(stdv);
			 
				
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try {
		
		connection.close();
		stm.close();
		rst.close();
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

		return arrstudentvo;
	}
	public boolean executeInseart(String sql)
	{
		boolean check=false;
		DataBaseConnection dbs=new DataBaseConnection();
		Connection connection=dbs.dbConnection();
		Statement stm=null;
		try {
	     stm=connection.createStatement();
		int a=stm.executeUpdate(sql);
		if(a!=0)
		{
			check=true;
			
		}
		else
		{
			check=false;
		}
		}
		catch (Exception e) {
		}
		try {
			stm.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return check;
	}
}
