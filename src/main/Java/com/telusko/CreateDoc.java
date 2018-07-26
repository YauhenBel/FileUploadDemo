package com.telusko;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CreateDoc extends HttpServlet {
    static final String SAVE_DIR = "G://JavaProject/FileUploadDemo/";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getHeader("fileName");
        System.out.println("CreateDoc: " + fileName);
        OutputStream output = new FileOutputStream(SAVE_DIR + fileName);
        output.flush();
        output.close();

        Process process = Runtime.getRuntime().exec("cmd /c "
                + SAVE_DIR + fileName);

        response.getWriter().print("File was create");

    }
}
