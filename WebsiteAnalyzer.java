package MovieReviews;

public class WebsiteAnalyzer {
    public class RottenTomatoes {
        public String wordFinder(String message) {
            int lineAbove = message.indexOf("<span class=\"mop - ratings - wrap__icon meter - tomato icon big medium - xs certified_fresh\"></span>");
            try {
                while (message.charAt(lineAbove) != '%')
                    lineAbove++;
                return message.substring(lineAbove, lineAbove + 4);
            } catch (StringIndexOutOfBoundsException e) {
                return "no rotten tomatoes score";
            }
        }
    }
}
