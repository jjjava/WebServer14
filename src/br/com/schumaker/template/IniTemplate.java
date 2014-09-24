package br.com.schumaker.template;

/**
 *
 * @author Hudson Schumaker
 *
 */
public class IniTemplate {

    public static String getWWWini() {
        return "#Params WebSever\n"
                + "# = Comment line\n"
                + "#P = Port default (80)\n"
                + "#I = Index home page default (index.html)\n"
                + "#C = Company Name defalut (New Company)\n"
                + "P;80\n"
                + "I;index.html\n"
                + "C;New Company";

    }
}
