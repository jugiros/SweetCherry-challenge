
CREATE DATABASE `sweetcherry`;

USE `sweetcherry`;

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `sku` varchar(50) NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO product (titulo, precio, sku, cantidad) VALUES
    ('Producto 1', 10.50, 'SKU-001', 100),
    ('Producto 2', 15.75, 'SKU-002', 150),
    ('Producto 3', 20.00, 'SKU-003', 200),
    ('Producto 4', 8.25, 'SKU-004', 75),
    ('Producto 5', 12.99, 'SKU-005', 120),
    ('Producto 6', 18.50, 'SKU-006', 180),
    ('Producto 7', 25.75, 'SKU-007', 220),
    ('Producto 8', 9.95, 'SKU-008', 90),
    ('Producto 9', 16.00, 'SKU-009', 170),
    ('Producto 10', 22.50, 'SKU-010', 250),
    ('Producto 11', 11.25, 'SKU-011', 110),
    ('Producto 12', 14.99, 'SKU-012', 130),
    ('Producto 13', 19.75, 'SKU-013', 160),
    ('Producto 14', 5.50, 'SKU-014', 50),
    ('Producto 15', 7.99, 'SKU-015', 80),
    ('Producto 16', 24.50, 'SKU-016', 210),
    ('Producto 17', 17.25, 'SKU-017', 140),
    ('Producto 18', 21.00, 'SKU-018', 190),
    ('Producto 19', 6.75, 'SKU-019', 60),
    ('Producto 20', 13.49, 'SKU-020', 100),
    ('Producto 21', 28.50, 'SKU-021', 270),
    ('Producto 22', 23.25, 'SKU-022', 230),
    ('Producto 23', 9.00, 'SKU-023', 95),
    ('Producto 24', 14.50, 'SKU-024', 125),
    ('Producto 25', 19.99, 'SKU-025', 165),
    ('Producto 26', 8.25, 'SKU-026', 70),
    ('Producto 27', 11.99, 'SKU-027', 120),
    ('Producto 28', 16.75, 'SKU-028', 150),
    ('Producto 29', 22.00, 'SKU-029', 200),
    ('Producto 30', 27.50, 'SKU-030', 250),
    ('Producto 31', 12.75, 'SKU-031', 110),
    ('Producto 32', 14.99, 'SKU-032', 130),
    ('Producto 33', 19.25, 'SKU-033', 160),
    ('Producto 34', 6.50, 'SKU-034', 50),
    ('Producto 35', 8.99, 'SKU-035', 80),
    ('Producto 36', 23.50, 'SKU-036', 210),
    ('Producto 37', 17.75, 'SKU-037', 140),
    ('Producto 38', 21.50, 'SKU-038', 190),
    ('Producto 39', 5.25, 'SKU-039', 60),
    ('Producto 40', 13.99, 'SKU-040', 100),
    ('Producto 41', 28.00, 'SKU-041', 270),
    ('Producto 42', 22.75, 'SKU-042', 230),
    ('Producto 43', 9.50, 'SKU-043', 95),
    ('Producto 44', 15.50, 'SKU-044', 125),
    ('Producto 45', 20.99, 'SKU-045', 165),
    ('Producto 46', 7.25, 'SKU-046', 70),
    ('Producto 47', 10.99, 'SKU-047', 120),
    ('Producto 48', 15.25, 'SKU-048', 150),
    ('Producto 49', 20.50, 'SKU-049', 200),
    ('Producto 50', 26.00, 'SKU-050', 250);