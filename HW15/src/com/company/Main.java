import java.io.File;

import java.util.ArrayList;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        SearchEngineImpl searchEngine = new SearchEngineImpl();
        List<ITextProvider> textProviderList = new ArrayList<>();
        textProviderList.add(new SimpleTextProviderImpl("вчера не было дождя"));
        textProviderList.add(new SimpleTextProviderImpl("сегодня был град"));
        textProviderList.add(new SimpleTextProviderImpl("вчера не было града"));
        textProviderList.add(new SimpleTextProviderImpl("не было дождя"));
        ITextProvider query = new SimpleTextProviderImpl("был снег");
        List<ITextProvider> sortList = searchEngine.getSortedByRelevanceList(new CosineSimilarityImpl(), query, textProviderList);
        for (ITextProvider textProvider: sortList) {
            System.out.println(textProvider.getText());
        }
    }
}