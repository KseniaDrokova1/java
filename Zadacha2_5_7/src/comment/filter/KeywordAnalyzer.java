package comment.filter;

abstract public class KeywordAnalyzer implements comment.filter.TextAnalyzer {
    public comment.filter.Label processText(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        comment.filter.TextAnalyzer[] textAnalyzers = {new comment.filter.NegativeTextAnalyzer(), new comment.filter.SpamAnalyzer(getKeywords())};
        for (int i = 0; i < textAnalyzers.length; i++) {
            for (String spam : getKeywords()) {
                if (stringBuilder.indexOf(spam) != -1) {
                    return getLabel();
                }
            }
        }
        return comment.filter.Label.OK;
    }
    abstract protected comment.filter.Label getLabel();
    abstract protected String[] getKeywords();
}
