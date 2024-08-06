INSERT INTO color_DB.vibe (id, vibe_name) VALUES
(1, 'edgy'),
(2, 'earthy'),
(3, 'bold'),
(4, 'loud'),
(5, 'sunny'),
(6, 'natural'),
(7, 'fresh'),
(8, 'rich'),
(9, 'deep'),
(10, 'stylish'),
(11, 'soft'),
(12, 'cool'),
(13, 'royal'),
(14, 'girly'),
(15, 'flirty'),
(16, 'intimidating'),
(17, 'inviting'),
(18, 'luxurious'),
(19, 'calm'),
(20, 'sophisticated'),
(21, 'simple'),
(22, 'gloomy'),
(23, 'lively'),
(24, 'rustic'),
(25, 'stylish'),
(26, 'muddy'),
(27, 'drab'),
(28, 'cheerful'),
(29, 'autumnal'),
(30, 'plant-like'),
(31, 'watery'),
(32, 'hot'),
(33, 'dusty'),
(34, 'sandy'),
(35, 'strong'),
(36, 'creamy'),
(37, 'faded'),
(38, 'dull');





INSERT INTO color_DB.style (id, style_name) VALUES
(1, 'Neutral'),
(2, 'Cool'),
(3, 'Warm'),
(4, 'Metallic'),
(5, 'Neon');



INSERT INTO color_DB.space (id, space_name) VALUES
(1, 'office'),
(2, 'kitchen'),
(3, 'bathroom'),
(4, 'living room'),
(5, 'bedroom');


INSERT INTO color_DB.color_vibe_list (color_id, vibe_list_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5),
(6, 6), (7, 7), (8, 8), (9, 9), (10, 10),
(11, 11), (12, 12), (13, 13), (14, 14), (15, 15),
(16, 16), (17, 17), (18, 18), (19, 19), (20, 20),
(21, 21), (22, 22), (23, 23), (24, 24), (25, 25),
(26, 26), (27, 27), (28, 28), (29, 29), (30, 30),
(31, 31), (32, 32), (33, 33), (34, 34), (35, 35),
(36, 36), (37, 1), (38, 2), (39, 3), (40, 4),
(41, 5), (42, 6), (43, 7), (44, 8), (45, 9),
(46, 10), (47, 11), (48, 12), (49, 13), (50, 14),
(51, 15), (52, 16), (53, 17), (54, 18), (55, 19),
(56, 20), (57, 21), (58, 22), (59, 23), (60, 24),
(61, 25), (62, 26), (63, 27), (64, 28), (65, 29),
(66, 30), (67, 31), (68, 32), (69, 33), (70, 34),
(71, 35), (72, 36), (73, 1), (74, 2), (75, 3),
(76, 4), (77, 5), (78, 6), (79, 7), (80, 8),
(81, 9), (82, 10), (83, 11), (84, 12), (85, 13),
(86, 14), (87, 15), (88, 16), (89, 17), (90, 18),
(91, 19);



INSERT INTO color_DB.color (id, name, hex_number, space_id, style_id) VALUES
(1, 'Sunset Orange', '#FD5E53', 1, 1),
(2, 'Ocean Blue', '#0077BE', 1, 2),
(3, 'Forest Green', '#228B22', 1, 3),
(4, 'Bright Yellow', '#FFEA00', 1, 4),
(5, 'Passion Red', '#FF0000', 1, 5),
(6, 'Calm Beige', '#D8C3A5', 2, 1),
(7, 'Elegant Purple', '#800080', 2, 2),
(8, 'Mellow Pink', '#FFB6C1', 2, 3),
(9, 'Mystic Cyan', '#00FFFF', 2, 4),
(10, 'Royal Blue', '#4169E1', 2, 5),
(11, 'Golden Sand', '#F5D06F', 3, 1),
(12, 'Lavender Blush', '#FFF0F5', 3, 2),
(13, 'Seafoam Green', '#9FE2BF', 3, 3),
(14, 'Sunny Lime', '#E4FF1A', 3, 4),
(15, 'Frosty Mint', '#98FF98', 3, 5),
(16, 'Turquoise Dream', '#40E0D0', 4, 1),
(17, 'Blazing Red', '#FF2400', 4, 2),
(18, 'Peach Fuzz', '#FFDAB9', 4, 3),
(19, 'Cool Gray', '#8C92AC', 4, 4),
(20, 'Midnight Blue', '#003366', 4, 5),
(21, 'Amber Glow', '#FFBF00', 5, 1),
(22, 'Cherry Blossom', '#FFB7C5', 5, 2),
(23, 'Emerald Isle', '#50C878', 5, 3),
(24, 'Golden Rod', '#DAA520', 5, 4),
(25, 'Ivory White', '#FFFFF0', 5, 5),
(26, 'Jade Green', '#00A86B', 1, 2),
(27, 'Candy Apple', '#FF0800', 1, 3),
(28, 'Lavender Field', '#E6E6FA', 1, 4),
(29, 'Neon Pink', '#FF6FFF', 1, 5),
(30, 'Onyx Black', '#353839', 2, 1),
(31, 'Periwinkle', '#CCCCFF', 2, 2),
(32, 'Ruby Red', '#9B111E', 2, 3),
(33, 'Salmon Pink', '#FF91A4', 2, 4),
(34, 'Teal Blue', '#367588', 2, 5),
(35, 'Ultra Violet', '#3F00FF', 3, 1),
(36, 'Velvet Purple', '#800080', 3, 2),
(37, 'Wheat Field', '#F5DEB3', 3, 3),
(38, 'Yellow Brick', '#FFD700', 3, 4),
(39, 'Zinc Gray', '#7F7F7F', 3, 5),
(40, 'Almond Cream', '#EFDECD', 4, 1),
(41, 'Berry Purple', '#800080', 4, 2),
(42, 'Blush Pink', '#FFB6C1', 4, 3),
(43, 'Cerulean Blue', '#007BA7', 4, 4),
(44, 'Dandelion Yellow', '#F0E130', 4, 5),
(45, 'Ebony Black', '#555D50', 5, 1),
(46, 'Fuchsia', '#FF00FF', 5, 2),
(47, 'Granite Gray', '#676767', 5, 3),
(48, 'Hibiscus Red', '#C04000', 5, 4),
(49, 'Icy Blue', '#AFEEEE', 5, 5),
(50, 'Jungle Green', '#29AB87', 1, 1),
(51, 'Kiwi Green', '#8EE53F', 1, 2),
(52, 'Lemon Yellow', '#FFF700', 1, 3),
(53, 'Mahogany', '#C04000', 1, 4),
(54, 'Navy Blue', '#000080', 1, 5),
(55, 'Olive Green', '#808000', 2, 1),
(56, 'Pine Green', '#01796F', 2, 2),
(57, 'Quicksilver', '#A6A6A6', 2, 3),
(58, 'Royal Purple', '#7851A9', 2, 4),
(59, 'Sky Blue', '#87CEEB', 2, 5),
(60, 'Tomato Red', '#FF6347', 3, 1),
(61, 'Umber Brown', '#635147', 3, 2),
(62, 'Vanilla Cream', '#F3E5AB', 3, 3),
(63, 'Wisteria', '#C9A0DC', 3, 4),
(64, 'Xanadu Gray', '#738678', 3, 5),
(65, 'Yankees Blue', '#1C2841', 4, 1),
(66, 'Zesty Orange', '#FFA500', 4, 2),
(67, 'Azure Blue', '#007FFF', 4, 3),
(68, 'Burnt Sienna', '#E97451', 4, 4),
(69, 'Carmine Red', '#960018', 4, 5),
(70, 'Denim Blue', '#1560BD', 5, 1),
(71, 'Electric Lime', '#CCFF00', 5, 2),
(72, 'Firebrick Red', '#B22222', 5, 3),
(73, 'Grape Purple', '#6F2DA8', 5, 4),
(74, 'Hot Pink', '#FF69B4', 5, 5),
(75, 'Iris Blue', '#5A4FCF', 1, 1),
(76, 'Jasper Red', '#D73B3E', 1, 2),
(77, 'Key Lime', '#E8F48C', 1, 3),
(78, 'Lime Green', '#32CD32', 1, 4),
(79, 'Mulberry', '#C54B8C', 1, 5),
(80, 'Navajo White', '#FFDEAD', 2, 1),
(81, 'Orchid Purple', '#DA70D6', 2, 2),
(82, 'Plum', '#DDA0DD', 2, 3),
(83, 'Quartz Pink', '#E7C9DB', 2, 4),
(84, 'Rose Red', '#C21E56', 2, 5),
(85, 'Sea Green', '#2E8B57', 3, 1),
(86, 'Tangerine', '#F28500', 3, 2),
(87, 'Ube Purple', '#8878C3', 3, 3),
(88, 'Verdigris Green', '#43B3AE', 3, 4),
(89, 'Wild Strawberry', '#FF43A4', 3, 5),
(90, 'Xanthic Yellow', '#EEED09', 4, 1),
(91, 'Zinc White', '#FAFAFA', 4, 2),
(92, 'Aqua Blue', '#00FFFF', 4, 3),
(93, 'Brick Red', '#B22222', 4, 4),
(94, 'Coral Pink', '#F88379', 4, 5),
(95, 'Daisy Yellow', '#FFFACD', 5, 1),
(96, 'Eggplant Purple', '#614051', 5, 2),
(97, 'Flamingo Pink', '#FC8EAC', 5, 3),
(98, 'Gold', '#FFD700', 5, 4),
(99, 'Harlequin Green', '#3FFF00', 5, 5);
