package com.grwt.file.zafar;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUpload extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
			//PrintWriter pw = response.getWriter();
//			DiskFileItemFactory factory=new DiskFileItemFactory();
//			factory.setRepository(new File("C:\\Users\\91844\\Desktop\\Zafar 4-1-2021"));
			//ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
			//List<FileItem> lfile=upload.parseRequest(request);
			//pw.println(lfile);
		
//			for(FileItem item:listFile)
//			{
//				item.write(new File("C:\\Users\\91844\\Desktop\\Zafar 4-1-2021"));
//			}
//		
	}

}
