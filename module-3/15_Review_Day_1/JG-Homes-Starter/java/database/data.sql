BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

-- SAMPLE DATA

--House 1
INSERT INTO address (addressId, addressLine, city, state, zip) VALUES (1, '123 Elm Street', 'Columbus', 'Ohio', 43323);
INSERT INTO home ( mlsNumber, addressId, numberOfBathrooms, numberOfBedrooms, price, shortDescription) values('MLS5123', 1, 4, 3, 30000.00,'Freddies Nightmare will come to your life in the classic home. Sweet dreams!');



COMMIT TRANSACTION;
