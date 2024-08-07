INSERT INTO color_DB.vibe (id, vibe_name) VALUES
(1, 'bold'),
(2, 'cheerful'),
(3, 'calm'),
(4, 'warm'),
(5, 'relaxing'),
(6, 'vibrant'),
(7, 'cool'),
(8, 'energetic'),
(9, 'elegant'),
(10, 'sophisticated')

INSERT INTO color_DB.space (id, space_name) VALUES
(1, 'kitchen'),
(2, 'bathroom'),
(3, 'living room')

INSERT INTO color_DB.style (id, style_name) VALUES
(1, 'warm'),
(2, 'cool'),
(3, 'neutral')

INSERT INTO `color_DB`.`promotion` (`id`, `company_name`, `url`) VALUES ('1', 'Winners', 'https://www.google.ca');
INSERT INTO `color_DB`.`promotion` (`id`, `company_name`, `url`) VALUES ('2', 'Home Hardware', 'https://www.google.ca');
INSERT INTO `color_DB`.`promotion` (`id`, `company_name`, `url`) VALUES ('3', 'Leons', 'https://www.google.ca');

UPDATE `color_DB`.`space` SET `promotion_id` = '1' WHERE (`id` = '1');
UPDATE `color_DB`.`space` SET `promotion_id` = '2' WHERE (`id` = '2');
UPDATE `color_DB`.`space` SET `promotion_id` = '3' WHERE (`id` = '3');
