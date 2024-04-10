//example that uses some arrays
import java.util.Arrays; //to printout strings

public class Newsfeed {
    
    //declaring instances
    String[] topics = {"Opinion", "Tech", "Opinion", "Health"};
    int[] views = {0,0,0,0};
    //top 10 fav articles
    String[] favArticles;

    public Newsfeed(){
        favArticles = new String[10];
    }

    //returning form instance
    public String[] getTopics(){
        return topics;
    }

    public int[] getViews(){
        return views;
    }

    //get the first topic
    public String getTopTopic(){
        return topics[0];
    }

    //increment everytime a topic is chosen
    public void viewTopic(int topicIndex){
        views[topicIndex] += 1;
    }    

    public void setFavArticles(int favIndex, String newArticle){
        favArticles[favIndex] = newArticle;
    }

    public static void main(String[] args){

        Newsfeed sampleNews = new Newsfeed();
        Newsfeed favArts = new Newsfeed();

        String[] topics = sampleNews.getTopics();
        int[] views = sampleNews.getViews();

        String[] favs = favArts.favArticles;
        //print readable string not addresses
        String printTopics = Arrays.toString(topics);

        sampleNews.viewTopic(1);
        sampleNews.viewTopic(1);
        sampleNews.viewTopic(3);
        sampleNews.viewTopic(2);

        favArts.setFavArticles(0, "Bible");
        favArts.setFavArticles(1, "Hello");
        favArts.setFavArticles(2, "Try");
        favArts.setFavArticles(3, "okok");
        favArts.setFavArticles(4, "whowhatwhenwhere");
        favArts.setFavArticles(5, "huh");
        favArts.setFavArticles(9, "meeet");
        
        String printViews = Arrays.toString(views);
        String printfavArt = Arrays.toString(favs);

        System.out.println(printTopics);
        System.out.println(printViews);

        System.out.println(printfavArt);
        System.out.println(favs.length); // .length to get the length of array


    }
}
