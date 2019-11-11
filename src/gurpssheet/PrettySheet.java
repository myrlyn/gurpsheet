package gurpssheet;

import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

/**
 * Servlet implementation class PrettySheet
 */
@WebServlet(description = "provides a formatted sheet for the character", urlPatterns = { "/PrettySheet" })
public class PrettySheet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected static  ConnectionSource dbsrc = RestServices.getDbsrc();  
	private static Dao<CharacterSheet, Long> csheetDao = null;
    static {
    	try {
			csheetDao = DaoManager.createDao(RestServices.dbsrc, CharacterSheet.class);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	/**
     * @see HttpServlet#HttpServlet()
     */
    public PrettySheet() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		CharacterSheet cs = null;
		if ( idString == null ) {
			cs = new Sheets().newSheet();
		}else {
			try {
				cs = csheetDao.queryForId(Long.parseLong(idString));
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				cs = new Sheets().newSheet();
			}
		}
		Writer w = response.getWriter();
		//w.write(new GsonBuilder().setLenient().setPrettyPrinting().create().toJson(cs));
		w.write("<html><head><title>"+cs.getName()+"</title></head><body>");
		w.write("TEST");
		
		w.write("</body></html>");
		w.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
