-- Create Users table 
CREATE TABLE Users ( 
  user_id INTEGER PRIMARY KEY, 
  username TEXT NOT NULL, 
  email TEXT, 
  city TEXT 
); 
 
-- Create LoginAttempts table 
CREATE TABLE LoginAttempts ( 
  attempt_id INTEGER PRIMARY KEY, 
  user_id INTEGER, 
  status TEXT, 
  timestamp TEXT, 
  FOREIGN KEY(user_id) REFERENCES Users(user_id) 
); 
 
-- Create Orders table 
CREATE TABLE Orders ( 
  order_id INTEGER PRIMARY KEY, 
  user_id INTEGER, 
  total_amount REAL, 
  order_date TEXT, 
  FOREIGN KEY(user_id) REFERENCES Users(user_id) 
); 
 
-- Insert sample data 
INSERT INTO Users (user_id, username, email, city) VALUES 
(1, 'abinisaac', 'abin@example.com', 'Bangalore'), 
(2, 'johndoe', 'john@example.com', 'Mumbai'); 
 
INSERT INTO LoginAttempts (attempt_id, user_id, status, timestamp) VALUES 
(1, 1, 'Success', '2025-06-12 10:00:00'), 
(2, 1, 'Failed', '2025-06-12 10:05:00'), 
(3, 2, 'Failed', '2025-06-12 11:00:00'); 
 
INSERT INTO Orders (order_id, user_id, total_amount, order_date) VALUES 
(1001, 1, 499.99, '2025-06-11'), 
(1002, 2, 249.00, '2025-06-10'); 
 
-- Sample test queries 
SELECT * FROM Users; 
SELECT username FROM Users WHERE city = 'Bangalore'; 
SELECT Users.username, Orders.order_id, Orders.total_amount 
FROM Users 
JOIN Orders ON Users.user_id = Orders.user_id; 
SELECT user_id, COUNT(*) AS failed_attempts 
FROM LoginAttempts 
WHERE status = 'Failed' 
GROUP BY user_id; 
