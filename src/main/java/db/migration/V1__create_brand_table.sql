--
-- brand
--
CREATE TABLE `brand` (
  `id` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `thumbnail` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;