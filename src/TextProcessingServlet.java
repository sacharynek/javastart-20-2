import logic.TextProcessor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/process")
public class TextProcessingServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text = request.getParameter("text");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println(text);
        writer.println("Ilość słów: "+TextProcessor.getWordCount(text));
        writer.println("Ilość znaków: "+TextProcessor.getCharAmount(text));
        writer.println("Ilość znaków (bez spacji): "+TextProcessor.getCharAmountWithoutSpace(text));
        writer.println("Palindrom: "+TextProcessor.isPalindrome(text));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
