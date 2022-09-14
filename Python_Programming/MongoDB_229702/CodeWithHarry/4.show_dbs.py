import pymongo

if __name__ == "__main__":
    print("Welcome to pyMongo")
    client = pymongo.MongoClient("mongodb://localhost:27017/")
    print(client)
    allDBs = client.list_database_names()
    print(allDBs)
    col = client['harry']
    print(col.list_collection_names())