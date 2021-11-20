# billManagementSystem

It is rest api application, deployed at heroku -> https://billmanagementsystem.herokuapp.com

GET Request : (to fetch all the bill data from database)
* https://billmanagementsystem.herokuapp.com/bills

GET Request : (to fetch a bill from database)
* https://billmanagementsystem.herokuapp.com/bills/{billID}

POST Request : (to save a bill in the database)
* https://billmanagementsystem.herokuapp.com/add_bill

Request Body : 
  {
    "billedTo" : "firstName2 LastName2",
    "billDueDate" : "14-12-2021",
    "billedPrice" : 230.67,
    "taxPrice" : 45.99
  }
  
Response from application on successful insertion of bill to the database :

{
    "success": true,
    "message": "bill successfully created"
}
