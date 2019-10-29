package gurpssheet;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

@ApplicationPath("rest")
public class RestServices extends ResourceConfig{
	protected static  ConnectionSource dbsrc = null;
	
	protected static  String dataBaseURL = "jdbc:sqlite:C:/Users/jwalker/sample.db";
	protected static java.util.logging.Logger logger = java.util.logging.Logger.getLogger("GurpsRestServices");  
	static {
		try {
			File file = new File("C:/Users/jwalker/sample.db");
	         file.createNewFile();
			dbsrc = new JdbcConnectionSource(dataBaseURL);
			TableUtils.createTableIfNotExists(dbsrc, SkillContainer.class);
			TableUtils.createTableIfNotExists(dbsrc, Skill.class);
			TableUtils.createTableIfNotExists(dbsrc, AdvantageContainer.class);
			TableUtils.createTableIfNotExists(dbsrc, Advantage.class);
			TableUtils.createTableIfNotExists(dbsrc, MeleeAttack.class);
			TableUtils.createTableIfNotExists(dbsrc, RangedAttack.class);
			TableUtils.createTableIfNotExists(dbsrc, CharacterSheet.class);
			
		} catch (SQLException | IOException e) {
			logger.log(Level.SEVERE, "Error opening SQLITE", e);
		}
		
		
	}
	public RestServices()  {
		packages("com.fasterxml.jackson.jaxrs.json");
		packages("gurpssheet");
		//TODO register all packages
	}

}
