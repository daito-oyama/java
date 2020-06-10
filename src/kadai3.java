

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
@WebServlet("/kadai3")
public class kadai3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public kadai3() {
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
			    printWriter.println("<h1>今日の運勢は...</h1>");
			    int fortune = new java.util.Random().nextInt(3);
			    if(fortune == 0){
			    	printWriter.println("<h2>凶です。</h2>");
			    	printWriter.println("<h3>バナナの皮に注意!</h3>");
			    	printWriter.println("<h4>ラッキーカラーは黄色!</h4>");
			    }else if(fortune == 1){
			    	printWriter.println("<h2>吉です。</h2>");
			    	printWriter.println("<h3>特になにも起きません。</h3>");
			    	printWriter.println("<h4>ラッキーカラーは無色。</h4>");
			    }else if(fortune == 2){
			    	printWriter.println("<h2>大吉です。</h2>");
			    	printWriter.println("<h3>空からお金が降ってくるかも!</h3>");
			    	printWriter.println("<h4>ラッキーカラーは青!</h4>");
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
