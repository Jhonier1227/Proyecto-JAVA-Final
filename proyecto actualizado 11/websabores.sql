

CREATE TABLE platos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(255),
    precio DECIMAL(10, 2) NOT NULL,
    imagen VARCHAR(255)
);

INSERT INTO platos (nombre, descripcion, precio, imagen)
VALUES 
('Pozole', 'Sopa mexicana de maíz con cerdo', 15000, 'images/plato1.png'),
('Enchiladas verdes', 'Tortillas rellenas con pollo y salsa verde', 30000, 'images/plato2.png'),
('Tacos al pastor', 'Tacos de carne adobada con piña', 20000, 'images/plato3.png'),
('Nachos', 'Tortillas con queso y jalapeños', 20000, 'images/plato4.png'),
('Enchiladas suizas', 'Tortillas gratinadas con queso y crema', 13000, 'images/plato5.png'),
('Fajitas', 'Tiras de carne con pimientos y cebolla', 14000, 'images/plato6.png');

CREATE TABLE ventas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_plato VARCHAR(50),
    cantidad INT,
    total DECIMAL(10, 2),
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);



