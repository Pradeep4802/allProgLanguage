import pymongo

if __name__ == "__main__":
    print("Welcome to pyMongo")
    client = pymongo.MongoClient("mongodb://localhost:27017/")
    db = client['harry']
    collection = db['mySample']

    # Delete One
    # rec = {"name": "Shubham"}
    # collection.delete_one(rec)

    # Delete Many
    rec = {"name": "Shubham"}
    up = collection.delete_many(rec)
    print(up.deleted_count)