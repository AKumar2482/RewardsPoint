# RewardsPoint
This is a Spring Boot application that calculates customer reward points based on their monthly transactions. Points are awarded as follows:

2 points for every dollar spent over $100 in a single transaction.

1 point for every dollar spent between $50 and $100 in a single transaction.

Example:
If a customer spends $120 in one transaction:
2 points for each dollar over $100 → 2 x 20 = 40 points
1 point for each dollar between $50 and $100 → 50 points
Total: 90 points

#API Endpoints

Get Rewards by Customer ID

GET /rewards/{customerId}

#Path Variable:
customerId {example 11,12,13}

Response:

{
    "cname": "Rahul",
    "monthly": {
        "JANUARY": 90
    },
    "cutomerId": 12,
    "totalPoints": 90
}

#Access the endpoint in Postman or your browser:

http://localhost:8080/rewards/12


#Testing with Postman

Method: GET

URL: http://localhost:8080/rewards/{customerId}


