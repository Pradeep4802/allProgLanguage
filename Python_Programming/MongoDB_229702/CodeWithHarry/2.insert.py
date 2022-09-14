import pymongo

if __name__ == "__main__":
    print("Welcome to pyMongo")
    client = pymongo.MongoClient("mongodb://localhost:27017/")
    print(client)
    db = client['harry']
    collection = db['mySample']
    # dictionary = {'name': 'Harry2', 'marks': 150};
    # collection.insert_one(dictionary)

    insertThese = [
        {'_id':1, 'Name': 'Harry', 'Location': 'Delhi', 'Marks': 34},
        {'_id':2, 'Name': 'Rahul', 'Location': 'Chennai', 'Marks': 24},
        {'_id':3, 'Name': 'Shubham', 'Location': 'Bangalore', 'Marks': 36},
        {'_id':4, 'Name': 'Lovish', 'Location': 'Kolkata', 'Marks': 24}
    ]

    collection.insert_many(insertThese)
 