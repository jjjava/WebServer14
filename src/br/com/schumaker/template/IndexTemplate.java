package br.com.schumaker.template;

import java.util.Calendar;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 */
public class IndexTemplate {

    public static String getHtmlPart1() {
        Calendar calendar = Calendar.getInstance();
        String data = String.format("%1$tA, %1$tB %1$td, %1$tY\n", calendar);
        return ""
                + "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "    <head>\n"
                + "        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"/>\n"
                + "        <meta name=\"Intranet 2014\" content=\"Hudson Schumaker\"/> \n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" media=\"screen\"/>\n"
                + "        <title>Intranet</title>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <div class=\"outer-container\">\n"
                + "            <div class=\"inner-container\">\n"
                + "                <div class=\"header\">\n"
                + "                    <div class=\"title\">\n"
                + "                        <span class=\"sitename\"><a href=\"index.html\">Intranet</a></span>\n"
                + "                        <div class=\"slogan\">HStudio</div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "                <div class=\"path\">\n"
                + "                    <a href=\"index.html\">Home</a> &#8250; <a href=\"manual.html\">Manual</a>\n"
                + "                </div>\n"
                + "                <div class=\"main\">		\n"
                + "                    <div class=\"content\">\n"
                + "                        <h1>WebServer 2014</h1>\n"
                + "                        <div class=\"descr\">" + data + "</div>\n"
                + "                    </div>\n"
                + "                    <div class=\"navigation\">\n"
                + "                        <h2>Conteu&#769do:</h2>\n"
                + "                        <ul>";
    }

    public static String getHtmlPart1(String companyName) {
        Calendar calendar = Calendar.getInstance();
        String data = String.format("%1$tA, %1$tB %1$td, %1$tY\n", calendar);
        data = data.replaceAll("á", "a&#769;");
        data = data.replaceAll("ç", "&ccedil;");
        return ""
                + "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "    <head>\n"
                + "        <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"/>\n"
                + "        <meta name=\"Intranet 2014\" content=\"Hudson Schumaker\"/> \n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" media=\"screen\"/>\n"
                + "        <title>Intranet</title>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <div class=\"outer-container\">\n"
                + "            <div class=\"inner-container\">\n"
                + "                <div class=\"header\">\n"
                + "                    <div class=\"title\">\n"
                + "                        <span class=\"sitename\"><a href=\"index.html\">" + companyName + "</a></span>\n"
                + "                        <div class=\"slogan\">Intranet</div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "                <div class=\"path\">\n"
                + "                    <a href=\"index.html\">Home</a> &#8250; <a href=\"manual.html\">Manual</a>\n"
                + "                </div>\n"
                + "                <div class=\"main\">		\n"
                + "                    <div class=\"content\">\n"
                + "                        <h1>WebServer 2014</h1>\n"
                + "                        <div class=\"descr\">" + data + "</div>\n"
                + "                    </div>\n"
                + "                    <div class=\"navigation\">\n"
                + "                        <h2>Conteu&#769do:</h2>\n"
                + "                        <ul>";
    }

    public static String getHtmlPart3() {
        return ""
                + "</ul>\n"
                + "                    </div>\n"
                + "                    <div class=\"clearer\">&nbsp;</div>\n"
                + "                </div>\n"
                + "                <div class=\"footer\">\n"
                + "                    <span class=\"left\">\n"
                + "                        &copy; 2014 <a href=\"index.html\">HStudio</a>. Valid <a href=\"http://jigsaw.w3.org/css-validator/check/referer\">CSS</a> &amp; <a href=\"http://validator.w3.org/check?uri=referer\">XHTML</a>\n"
                + "                    </span>\n"
                + "                    <span class=\"right\"><a href=\"#\">Website</a> by <a href=\"#\">HStudio</a></span>\n"
                + "                    <div class=\"clearer\"></div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "    </body>\n"
                + "</html>";
    }
}
