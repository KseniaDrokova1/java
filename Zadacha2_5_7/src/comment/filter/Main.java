package comment.filter;

public class Main {
    private static String[] spamWords = {"Бесплатный", "777", "Без вложений"};
    private static int maxLength = 10;

    public static comment.filter.Label checkLabels(comment.filter.TextAnalyzer[] analyzers, String text) {
        for (comment.filter.TextAnalyzer analyzer : analyzers) {
            if(analyzer.processText(text) != comment.filter.Label.OK){
                return analyzer.processText(text);
            }
        }
        return comment.filter.Label.OK;
    }

    public static void main(String[] args) {
        String text = "Бесплатный курс по Java за регистрацию на 777.ru ";
        comment.filter.TextAnalyzer[] textAnalyzers = {
                new comment.filter.SpamAnalyzer(spamWords),
                new comment.filter.NegativeTextAnalyzer(),
                new comment.filter.TooLongTextAnalyzer(maxLength),
        };
        System.out.println(checkLabels(textAnalyzers,text));
    }
}