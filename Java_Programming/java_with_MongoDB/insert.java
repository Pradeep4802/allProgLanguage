import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import org.bson.Document;

public class insert {
    public static void main(String args[]) {
        MongoClient mongo = new MongoClient("localhost", 27017);
        System.out.println("Connected to DataBase Sucessfully ");
        MongoDatabase database = mongo.getDatabase("TYITDB1");

        MongoCollection<Document> Collection = database.getCollection("TYITCOL");
        System.out.println("Collection Sample Collection Selected Successfully ");

        Document document = new Document();
        document.append("ID", 3);
        document.append("Description", "database 2");
        document.append("Likes", 300);
        document.append("URL", "https://www.mongoDb.com");
        document.append("by", "NOSQL");
        Collection.insertOne(document);
        System.out.println("Document inserted Successfully");
    }
}
