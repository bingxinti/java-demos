package demo;

import news.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Demon on 16/12/11.
 */
@WebServlet(name = "demoServlet")
public class demoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String TimeString = time.format(new java.util.Date());
        out.println("date-time: "+TimeString);


//        refreshServlet(request,response);
        test();

    }



    public static  void test()
    {
//        ibatis CURD 测试
//        NewsTest.test();
        JDBCForMysql.main(null);

    }


    public   void  refreshServlet(HttpServletRequest request, HttpServletResponse response)
    {

    }
}
