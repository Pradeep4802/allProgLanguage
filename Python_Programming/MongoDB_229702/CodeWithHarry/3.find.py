import pymongo

if __name__ == "__main__":
    print("Welcome to pyMongo")
    client = pymongo.MongoClient("mongodb://localhost:27017/")
    print(client)
    db = client["harry"]
    collection = db["mySample"]
    # one = collection.find_one({"name": "Harry"})


    # allDocs = collection.find({"name": "Lovish"}, {"name": 0}).limit(1)
    allDocs = collection.find({"name": "Lovish", "Marks":{"$lte": 80}}, {"name": 0})
    # print(allDocs.count_documents({}))

    for item in allDocs:
        print(item)
    # print(allDocs)