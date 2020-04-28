/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CalcOperation;
import service.CalcService;

/**
 *
 * @author pcc
 */
@WebServlet(name = "CalcServlet", urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CalcOperation op=new CalcOperation();
        CalcService cal=new CalcService();
        PrintWriter out=response.getWriter();
        try{
            int a;
            int b;
            String c;
            a=Integer.parseInt(request.getParameter("a"));
            b=Integer.parseInt(request.getParameter("b"));
            c=request.getParameter("c");
            op.setV1(a);
            op.setV2(b);
            op.setChoice(c);
            
            out.println("Result is : "+cal.calculate(op.getV1(),op.getV2(),op.getChoice()));
        }
        catch(Exception e)
                {
                    out.println("Invalid Input");
                }
                    
    }

}
