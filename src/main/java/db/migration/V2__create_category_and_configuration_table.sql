--
-- category
--
CREATE TABLE `category` (
  `id` int NOT NULL,
  `name` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- configuration
--
CREATE TABLE `configuration` (
  `id` bigint NOT NULL,
  `obo_choices` json DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;