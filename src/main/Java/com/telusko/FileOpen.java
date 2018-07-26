package com.telusko;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FileOpen extends HttpServlet {

    static final String SAVE_DIR = "G://JavaProject/FileUploadDemo/";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getHeader("fileName");
        Process process = Runtime.getRuntime().exec("cmd /c "
                + SAVE_DIR + fileName);
        response.getWriter().print("File is open");
    }
}
