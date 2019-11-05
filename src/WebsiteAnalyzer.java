public class WebsiteAnalyzer {
    public String wordFinder(String message) {
        try
        {
            int lineAbove = message.indexOf("<span class=\"mop - ratings - wrap__icon meter - tomato icon big medium - xs certified_fresh\"></span>");
            while (message.charAt(lineAbove) != '%')
                lineAbove++;
            return message.substring(lineAbove, lineAbove + 4);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            return "No Rotten Tomatoes";
        }
    }
}
