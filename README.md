
# URL Hit Counter

This is a small spring boot project created to count the number of times the url is been hit by particular user


## Resource used

**Framework:** SpringBoot

**Language:** Java

**Dependency:** Spring Boot DevTools , Spring Web

**Data Structure:** HashMap

## Data Flow

**Controller** 

**Service** 

**Repository** 
## API Reference

#### Get all items

```http
  GET /api/v1/visitor-count-app/urlcount/{username}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `count` | `string` | Return username and count |



## Features

- Count how many times the url has been hit by particular user



## Lessons Learned

The lesson that i have learned while building the project is importance of dependency injection, with the help of dependency injection I made my code more scalable and decoupled I have created differnet package of each function, because of this my code became scalable.


## Summary

This small springboot project helps to count how many times the user has hit the url, with the help of hashMap i have stored the username and count.

