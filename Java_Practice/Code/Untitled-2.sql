

#### **1. users**

| Column Name | Data Type                 | Constraints                  |
| ----------- | ------------------------- | ---------------------------- |
| id          | BIGINT                    | PRIMARY KEY, AUTO\_INCREMENT |
| name        | VARCHAR(100)              | NOT NULL                     |
| email       | VARCHAR(100)              | UNIQUE, NOT NULL             |
| password    | VARCHAR(255)              | NOT NULL                     |
| role        | ENUM('CUSTOMER', 'ADMIN') | DEFAULT 'CUSTOMER'           |
| created\_at | TIMESTAMP                 | DEFAULT CURRENT\_TIMESTAMP   |

---

#### **2. categories**

| Column Name | Data Type    | Constraints                  |
| ----------- | ------------ | ---------------------------- |
| id          | BIGINT       | PRIMARY KEY, AUTO\_INCREMENT |
| name        | VARCHAR(100) | UNIQUE, NOT NULL             |
| description | TEXT         | NULLABLE                     |

---

#### **3. books**

| Column Name  | Data Type     | Constraints                  |
| ------------ | ------------- | ---------------------------- |
| id           | BIGINT        | PRIMARY KEY, AUTO\_INCREMENT |
| title        | VARCHAR(255)  | NOT NULL                     |
| author       | VARCHAR(100)  | NOT NULL                     |
| isbn         | VARCHAR(13)   | UNIQUE, NOT NULL             |
| price        | DECIMAL(10,2) | NOT NULL                     |
| stock        | INT           | NOT NULL                     |
| category\_id | BIGINT        | FOREIGN KEY → categories(id) |
| created\_at  | TIMESTAMP     | DEFAULT CURRENT\_TIMESTAMP   |

---

#### **4. orders** *(optional extension)*

| Column Name  | Data Type     | Constraints                  |
| ------------ | ------------- | ---------------------------- |
| id           | BIGINT        | PRIMARY KEY, AUTO\_INCREMENT |
| user\_id     | BIGINT        | FOREIGN KEY → users(id)      |
| order\_date  | TIMESTAMP     | DEFAULT CURRENT\_TIMESTAMP   |
| total\_price | DECIMAL(10,2) | NOT NULL                     |

---

#### **5. order\_items** *(optional extension)*

| Column Name | Data Type     | Constraints                  |
| ----------- | ------------- | ---------------------------- |
| id          | BIGINT        | PRIMARY KEY, AUTO\_INCREMENT |
| order\_id   | BIGINT        | FOREIGN KEY → orders(id)     |
| book\_id    | BIGINT        | FOREIGN KEY → books(id)      |
| quantity    | INT           | NOT NULL                     |
| price       | DECIMAL(10,2) | price at time of purchase    |

---

Would you like me to start generating the **JPA entity classes** based on this schema now?
