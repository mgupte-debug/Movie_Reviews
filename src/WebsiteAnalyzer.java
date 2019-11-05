public class WebsiteAnalyzer {
    public String wordFinder(String message) {
        int lineAbove = message.indexOf("<span class=\"mop - ratings - wrap__icon meter - tomato icon big medium - xs certified_fresh\"></span>");
        while (message.charAt(lineAbove) != '%')
            lineAbove++;
        return message.substring(lineAbove, lineAbove + 4);
    }
}
