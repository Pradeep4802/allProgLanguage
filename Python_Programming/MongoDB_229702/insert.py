from logging import exception
from pymongo import MongoClient
client = MongoClient('localhost',27017)
db = client.MCCP
def insert():
    try:
        name1 = input("Enter the name: ")
        age1 = int(input("Enter the age: "))
        db.mcc.insert({
            "Name": name1,
            "Age": age1
        })
        print("Data inserted successfully")
    except Exception:
        print(str(e))
insert()