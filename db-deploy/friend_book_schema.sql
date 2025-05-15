-- 创建数据库（如果不存在）
CREATE DATABASE IF NOT EXISTS friend_book;
USE friend_book;

-- 创建联系人表
CREATE TABLE IF NOT EXISTS friends (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50),
    phone_number VARCHAR(20),
    email VARCHAR(100),
    birthday DATETIME,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
