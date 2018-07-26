package com.telusko;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

public class DocDel extends HttpServlet {

    static final String SAVE_DIR = "G://JavaProject/FileUploadDemo/";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Delete");
        String fileName = request.getHeader("fileName");
        File file = new File(SAVE_DIR + fileName);
        if (file.delete()){
            response.getWriter().print("File is delete");
        }else {
            response.getWriter().print("File is not delete");
        }
    }
}
