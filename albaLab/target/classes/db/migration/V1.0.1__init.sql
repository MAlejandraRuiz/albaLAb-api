CREATE TABLE contactos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    email VARCHAR(255),
    telefono VARCHAR(255),
    asunto VARCHAR(255),
    mensaje VARCHAR(255),
    estado VARCHAR(255) DEFAULT 'Pendiente'
);

INSERT INTO contactos (nombre, email, telefono, asunto, mensaje, estado) VALUES
('Camila Soto', 'camila.soto@duoc.cl','912345678', 'Programa de Intermediación Laboral', 'Programa de Intermediación Laboral', 'Pendiente'),
('Matías Rojas', 'matias.rojas@gmail.com','987654321', 'Programa Taller Sociolaboral', 'Programa Taller Sociolaboral', 'Contestado'),
('Valentina Silva', 'v.silva@corpaliv.cl','924681357', 'Ley de Inclusión Laboral', 'me gusta ver que tienen como ver los valores uf y utm', 'Rechazado'),
('Jorge Silva', 'jsilva@gmail.cl','913572468', 'Quiero colaborar', 'Quiero colaborar con ustedes soy de santiago', 'Pendiente'),
('Cleo Patra', 'cpatra@outlook.cl','998855667', 'Quiero colaborar', 'Quiero colaborar con ustedes soy de regiones', 'Contestado');