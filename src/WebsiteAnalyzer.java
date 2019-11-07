public class WebsiteAnalyzer {
    public String wordFinder(String message) {
        try
        {
            if ( !message.contains("<span class=\"mop-ratings-wrap__icon meter-tomato icon big medium-xs fresh\"></span>")){
                int lineAbove = message.indexOf("<span class=\"mop-ratings-wrap__icon meter-tomato icon big medium-xs certified_fresh\"></span>");
                while (message.charAt(lineAbove) != '%')
                    lineAbove++;
                return message.substring(lineAbove - 2, lineAbove + 1);
            }else{
            int lineAbove = message.indexOf("<span class=\"mop-ratings-wrap__icon meter-tomato icon big medium-xs fresh\"></span>");
            while (message.charAt(lineAbove) != '%')
                lineAbove++;
            return "Rotten Tomatoes Score:" + message.substring(lineAbove - 2, lineAbove + 1);
            }
        }
        catch (StringIndexOutOfBoundsException e)
        {
            return "No Rotten Tomatoes";
        }
    }
}
