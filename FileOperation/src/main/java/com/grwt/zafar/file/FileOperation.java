package com.grwt.zafar.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.multi.MultiButtonUI;

import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

import com.oreilly.servlet.MultipartRequest;

import org.apache.commons.fileupload.FileItem;

public class FileOperation extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("<h1>hello this is first is my mavwn project</h1>");
//	 try {
//	// DiskFileItemFactory factory=
//	 //factory.setRepository(new File("C:\\Users\\91844\\Desktop\\Zafar 4-1-2021"));
//	 FileUpload opr=new FileUpload(new DiskFileItemFactory());
//	
//		
//		List<FileItem> fobj=opr.parseRequest(request);
//		for(FileItem item:fobj)
//		{
//			item.write(new File("C:\\Users\\91844\\Desktop\\Zafar 4-1-2021"));
//		}
//	} catch (Exception e) {
//		
//		e.printStackTrace();
//	}
     MultipartRequest sobj=new MultipartRequest(request,"C:\\Users\\91844\\Desktop\\Zafar 4-1-2021");
     pw.println("<h1> file uploaded SucessFully<h1>");
     }

}
