import pymongo

if __name__ == "__main__":
    print("Welcome to pyMongo")
    client = pymongo.MongoClient("mongodb://localhost:27017/")
    print(client)
    db = client['harry']
    collection = db['mySample']

    # update_one
    # prev = {"name": "Shubham"}
    # nextt = {"$set": {"Location": "Mumbai"}}
    # collection.update_one(prev, nextt)

    # update_many
    prev = {"name": "Shubham"}
    nextt = {"$set": {"Location": "Mumbai"}}
    up = collection.update_many(prev, nextt)
    print(up.modified_count)