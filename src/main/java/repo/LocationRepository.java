package repo;

import org.bson.BsonArray;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.*;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;


public class LocationRepository  {
	public LocationRepository(){

	}

	public void storeMongodb(String locationName) {
		MongoClient mongoDB = new MongoClient("localhost", 27017);
		try {
			MongoDatabase db = mongoDB.getDatabase("LocationSearchdb");
			DBCollection collection = (DBCollection) db.getCollection("dummyColl");

			// convert JSON to DBObject directly
			BsonArray parse = BsonArray.parse(locationName);
			BasicDBList dbList = new BasicDBList();
			dbList.addAll(parse);
			DBObject dbObject = dbList;

			collection.insert(dbObject);

			DBCursor cursorDoc = collection.find();
			while (cursorDoc.hasNext()) {
				System.out.println(cursorDoc.next());
			}

			System.out.println("Done");
		} catch (MongoException e) {
			e.printStackTrace();
		}
	}

}