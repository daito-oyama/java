

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/kadai2")
public class kadai2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public kadai2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字コードの設定
				response.setContentType("text/html; charset=UTF-8");

				//ブラウザに表示されるHTMLの中身を書いていく
				PrintWriter printWriter = response.getWriter();

			    printWriter.println("<html>");
			    printWriter.println("<head>");
			    printWriter.println("<title>Hello World!</title>");
			    printWriter.println("</head>");
			    printWriter.println("<body>");

			    for(int i = 0; i < 100; i++) {
			    printWriter.println("<h1>国家試験の勉強は順調ですか?</h1>");
			    }

			    printWriter.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
