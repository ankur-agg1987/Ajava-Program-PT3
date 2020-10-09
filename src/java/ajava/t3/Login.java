package ajava.t3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ankur-Agg
 */
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //Code1: complete the below statement to access Student Name form user request object
       String S_name = //Write your code1 here;
       
       //Code2: complete the below statement to access Student Roll form user request object
       String S_rollno = //Write your code12 here;
       
       InetAddress ip = InetAddress.getLocalHost();
       
       PrintWriter out = response.getWriter();
       response.setContentType("text/html");
       
       out.println("<HTML><HEAD><TITLE>"+S_name+" / "+S_rollno+"</TITLE></HEAD>");
       out.println("Thanks for submitting your information <br>Student Name: "+S_name+"<br>");
       out.println("Student RollNo: "+S_rollno+"");
       out.println("<br>Host Name: " + ip.getHostName()); 
       out.println("<br>Host Address : " +ip.getHostAddress());
       out.println("<br><br>You are requested to take the snapshot of output window and with paste the code "
               + "<br>(java file and index.html file and web.xml file) in document"
               + "<br>file and upload same to MS-Form link<br>");
        
       out.println("<br><br>MS-Form link to upload PT3 program document\n");
       out.println("<br>MS-From Link :   https://forms.microsoft.com/Pages/ResponsePage.aspx?id=yyqzuFjxP0GQva1EeaKKzWRdQ7BDttRNri-mrqI4nyBUOTdLSkRSM05WWkNEQUgxMDNRWkZISUtNSC4u");
       out.println("</BODY></HTML>");
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
