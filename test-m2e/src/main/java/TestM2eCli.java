

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class TestM2eCli {

	public static void main(String[] args) throws ParseException {
		Options options = new Options();
		options.addOption("t", false, "display current time");
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);
		Date date = new Date();
		if (cmd.hasOption("t")) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			System.out.println(dateFormat.format(date));
		} else {
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			System.out.println(dateFormat.format(date));
		}

	}

}
