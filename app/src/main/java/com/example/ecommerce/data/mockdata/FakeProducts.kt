package com.example.ecommerce.data.mockdata

import com.google.gson.Gson

class FakeProducts {

    val responseStr = """
            
            [
                {
                    "id": 40,
                    "title": "Futuristic Silver and Gold High-Top Sneaker",
                    "price": 68,
                    "description": "Step into the future with this eye-catching high-top sneaker, designed for those who dare to stand out. The sneaker features a sleek silver body with striking gold accents, offering a modern twist on classic footwear. Its high-top design provides support and style, making it the perfect addition to any avant-garde fashion collection. Grab a pair today and elevate your shoe game!",
                    "images": [
                        "https://i.imgur.com/npLfCGq.jpeg",
                        "https://i.imgur.com/vYim3gj.jpeg",
                        "https://i.imgur.com/HxuHwBO.jpeg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 4,
                        "name": "Shoes",
                        "image": "https://i.imgur.com/qNOjJje.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 41,
                    "title": "Futuristic Chic High-Heel Boots",
                    "price": 36,
                    "description": "Elevate your style with our cutting-edge high-heel boots that blend bold design with avant-garde aesthetics. These boots feature a unique color-block heel, a sleek silhouette, and a versatile light grey finish that pairs easily with any cutting-edge outfit. Crafted for the fashion-forward individual, these boots are sure to make a statement.",
                    "images": [
                        "https://i.imgur.com/HqYqLnW.jpeg",
                        "https://i.imgur.com/RlDGnZw.jpeg",
                        "https://i.imgur.com/qa0O6fg.jpeg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 4,
                        "name": "Shoes",
                        "image": "https://i.imgur.com/qNOjJje.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 42,
                    "title": "Elegant Patent Leather Peep-Toe Pumps with Gold-Tone Heel",
                    "price": 53,
                    "description": "Step into sophistication with these chic peep-toe pumps, showcasing a lustrous patent leather finish and an eye-catching gold-tone block heel. The ornate buckle detail adds a touch of glamour, perfect for elevating your evening attire or complementing a polished daytime look.",
                    "images": [
                        "https://i.imgur.com/AzAY4Ed.jpeg",
                        "https://i.imgur.com/umfnS9P.jpeg",
                        "https://i.imgur.com/uFyuvLg.jpeg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 4,
                        "name": "Shoes",
                        "image": "https://i.imgur.com/qNOjJje.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 43,
                    "title": "Elegant Purple Leather Loafers",
                    "price": 17,
                    "description": "Step into sophistication with our Elegant Purple Leather Loafers, perfect for making a bold statement. Crafted from high-quality leather with a vibrant purple finish, these shoes feature a classic loafer silhouette that's been updated with a contemporary twist. The comfortable slip-on design and durable soles ensure both style and functionality for the modern man.",
                    "images": [
                        "https://i.imgur.com/Au8J9sX.jpeg",
                        "https://i.imgur.com/gdr8BW2.jpeg",
                        "https://i.imgur.com/KDCZxnJ.jpeg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 4,
                        "name": "Shoes",
                        "image": "https://i.imgur.com/qNOjJje.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 44,
                    "title": "Classic Blue Suede Casual Shoes",
                    "price": 39,
                    "description": "Step into comfort with our Classic Blue Suede Casual Shoes, perfect for everyday wear. These shoes feature a stylish blue suede upper, durable rubber soles for superior traction, and classic lace-up fronts for a snug fit. The sleek design pairs well with both jeans and chinos, making them a versatile addition to any wardrobe.",
                    "images": [
                        "https://i.imgur.com/sC0ztOB.jpeg",
                        "https://i.imgur.com/Jf9DL9R.jpeg",
                        "https://i.imgur.com/R1IN95T.jpeg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 4,
                        "name": "Shoes",
                        "image": "https://i.imgur.com/qNOjJje.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 45,
                    "title": "Sleek Futuristic Electric Bicycle",
                    "price": 22,
                    "description": "This modern electric bicycle combines style and efficiency with its unique design and top-notch performance features. Equipped with a durable frame, enhanced battery life, and integrated tech capabilities, it's perfect for the eco-conscious commuter looking to navigate the city with ease.",
                    "images": [
                        "https://i.imgur.com/BG8J0Fj.jpg",
                        "https://i.imgur.com/ujHBpCX.jpg",
                        "https://i.imgur.com/WHeVL9H.jpg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 5,
                        "name": "Miscellaneous",
                        "image": "https://i.imgur.com/BG8J0Fj.jpg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 46,
                    "title": "Sleek All-Terrain Go-Kart",
                    "price": 37,
                    "description": "Experience the thrill of outdoor adventures with our Sleek All-Terrain Go-Kart, featuring a durable frame, comfortable racing seat, and robust, large-tread tires perfect for handling a variety of terrains. Designed for fun-seekers of all ages, this go-kart is an ideal choice for backyard racing or exploring local trails.",
                    "images": [
                        "https://i.imgur.com/Ex5x3IU.jpg",
                        "https://i.imgur.com/z7wAQwe.jpg",
                        "https://i.imgur.com/kc0Dj9S.jpg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 5,
                        "name": "Miscellaneous",
                        "image": "https://i.imgur.com/BG8J0Fj.jpg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 47,
                    "title": "Radiant Citrus Eau de Parfum",
                    "price": 73,
                    "description": "Indulge in the essence of summer with this vibrant citrus-scented Eau de Parfum. Encased in a sleek glass bottle with a bold orange cap, this fragrance embodies freshness and elegance. Perfect for daily wear, it's an olfactory delight that leaves a lasting, zesty impression.",
                    "images": [
                        "https://i.imgur.com/xPDwUb3.jpg",
                        "https://i.imgur.com/3rfp691.jpg",
                        "https://i.imgur.com/kG05a29.jpg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 5,
                        "name": "Miscellaneous",
                        "image": "https://i.imgur.com/BG8J0Fj.jpg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 48,
                    "title": "Sleek Olive Green Hardshell Carry-On Luggage",
                    "price": 48,
                    "description": "Travel in style with our durable hardshell carry-on, perfect for weekend getaways and business trips. This sleek olive green suitcase features smooth gliding wheels for easy airport navigation, a sturdy telescopic handle, and a secure zippered compartment to keep your belongings safe. Its compact size meets most airline overhead bin requirements, ensuring a hassle-free flying experience.",
                    "images": [
                        "https://i.imgur.com/jVfoZnP.jpg",
                        "https://i.imgur.com/Tnl15XK.jpg",
                        "https://i.imgur.com/7OqTPO6.jpg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 5,
                        "name": "Miscellaneous",
                        "image": "https://i.imgur.com/BG8J0Fj.jpg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 49,
                    "title": "Chic Transparent Fashion Handbag",
                    "price": 61,
                    "description": "Elevate your style with our Chic Transparent Fashion Handbag, perfect for showcasing your essentials with a clear, modern edge. This trendy accessory features durable acrylic construction, luxe gold-tone hardware, and an elegant chain strap. Its compact size ensures you can carry your day-to-day items with ease and sophistication.",
                    "images": [
                        "https://i.imgur.com/Lqaqz59.jpg",
                        "https://i.imgur.com/uSqWK0m.jpg",
                        "https://i.imgur.com/atWACf1.jpg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 5,
                        "name": "Miscellaneous",
                        "image": "https://i.imgur.com/BG8J0Fj.jpg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 50,
                    "title": "Trendy Pink-Tinted Sunglasses",
                    "price": 38,
                    "description": "Step up your style game with these fashionable black-framed, pink-tinted sunglasses. Perfect for making a statement while protecting your eyes from the glare. Their bold color and contemporary design make these shades a must-have accessory for any trendsetter looking to add a pop of color to their ensemble.",
                    "images": [
                        "https://i.imgur.com/0qQBkxX.jpg",
                        "https://i.imgur.com/I5g1DoE.jpg",
                        "https://i.imgur.com/myfFQBW.jpg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 5,
                        "name": "Miscellaneous",
                        "image": "https://i.imgur.com/BG8J0Fj.jpg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 51,
                    "title": "Elegant Glass Tumbler Set",
                    "price": 50,
                    "description": "Enhance your drinkware collection with our sophisticated set of glass tumblers, perfect for serving your favorite beverages. This versatile set includes both clear and subtly tinted glasses, lending a modern touch to any table setting. Crafted with quality materials, these durable tumblers are designed to withstand daily use while maintaining their elegant appeal.",
                    "images": [
                        "https://i.imgur.com/TF0pXdL.jpg",
                        "https://i.imgur.com/BLDByXP.jpg",
                        "https://i.imgur.com/b7trwCv.jpg"
                    ],
                    "creationAt": "2024-02-28T02:48:01.000Z",
                    "updatedAt": "2024-02-28T02:48:01.000Z",
                    "category": {
                        "id": 5,
                        "name": "Miscellaneous",
                        "image": "https://i.imgur.com/BG8J0Fj.jpg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 100,
                    "title": "apple",
                    "price": 50,
                    "description": "apple is not sweet, why?",
                    "images": [
                        "[\"https://www.shutterstock.com/image-photo/red-apple-isolated-on-white-600nw-1727544364.jpg\"]"
                    ],
                    "creationAt": "2024-02-28T05:08:18.000Z",
                    "updatedAt": "2024-02-28T08:41:25.000Z",
                    "category": {
                        "id": 5,
                        "name": "Miscellaneous",
                        "image": "https://i.imgur.com/BG8J0Fj.jpg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 114,
                    "title": "Puma Shoes",
                    "price": 10000,
                    "description": "A description",
                    "images": [
                        "[\"https://images.unsplash.com/photo-1549298916-b41d501d3772?q=80&w=1412&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D\"]"
                    ],
                    "creationAt": "2024-02-28T05:49:38.000Z",
                    "updatedAt": "2024-02-28T05:49:38.000Z",
                    "category": {
                        "id": 1,
                        "name": "Clothes",
                        "image": "https://i.imgur.com/QkIa5tT.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 119,
                    "title": "Puma Shoes 2",
                    "price": 5000,
                    "description": "A description",
                    "images": [
                        "[\"https://images.unsplash.com/photo-1549298916-b41d501d3772?q=80&w=1412&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D\"",
                        "\"https://images.unsplash.com/photo-1549298916-b41d501d3772?q=80&w=1412&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D\"",
                        "\"https://images.unsplash.com/photo-1549298916-b41d501d3772?q=80&w=1412&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D\"]"
                    ],
                    "creationAt": "2024-02-28T05:59:41.000Z",
                    "updatedAt": "2024-02-28T05:59:41.000Z",
                    "category": {
                        "id": 1,
                        "name": "Clothes",
                        "image": "https://i.imgur.com/QkIa5tT.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 123,
                    "title": "Puma Shoes 2",
                    "price": 5000,
                    "description": "A description",
                    "images": [
                        "[\"https://images.unsplash.com/photo-1549298916-b41d501d3772?q=80&w=1412&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D\"",
                        "\"https://images.unsplash.com/photo-1549298916-b41d501d3772?q=80&w=1412&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D\"",
                        "\"https://images.unsplash.com/photo-1549298916-b41d501d3772?q=80&w=1412&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D\"]"
                    ],
                    "creationAt": "2024-02-28T06:07:10.000Z",
                    "updatedAt": "2024-02-28T06:07:10.000Z",
                    "category": {
                        "id": 1,
                        "name": "Clothes",
                        "image": "https://i.imgur.com/QkIa5tT.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 124,
                    "title": "New Product",
                    "price": 10,
                    "description": "A description",
                    "images": [
                        "[\"https://placeimg.com/640/480/any\"]"
                    ],
                    "creationAt": "2024-02-28T06:07:52.000Z",
                    "updatedAt": "2024-02-28T06:07:52.000Z",
                    "category": {
                        "id": 1,
                        "name": "Clothes",
                        "image": "https://i.imgur.com/QkIa5tT.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 125,
                    "title": "New Product",
                    "price": 10,
                    "description": "A description",
                    "images": [
                        "[\"https://placeimg.com/640/480/any\"]"
                    ],
                    "creationAt": "2024-02-28T06:10:53.000Z",
                    "updatedAt": "2024-02-28T06:10:53.000Z",
                    "category": {
                        "id": 1,
                        "name": "Clothes",
                        "image": "https://i.imgur.com/QkIa5tT.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 126,
                    "title": "New Product",
                    "price": 10,
                    "description": "A description",
                    "images": [
                        "[\"https://placeimg.com/640/480/any\"]"
                    ],
                    "creationAt": "2024-02-28T06:13:52.000Z",
                    "updatedAt": "2024-02-28T06:13:52.000Z",
                    "category": {
                        "id": 1,
                        "name": "Clothes",
                        "image": "https://i.imgur.com/QkIa5tT.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 127,
                    "title": "New Product",
                    "price": 10,
                    "description": "A description",
                    "images": [
                        "[\"https://placeimg.com/640/480/any\"]"
                    ],
                    "creationAt": "2024-02-28T06:16:52.000Z",
                    "updatedAt": "2024-02-28T06:16:52.000Z",
                    "category": {
                        "id": 1,
                        "name": "Clothes",
                        "image": "https://i.imgur.com/QkIa5tT.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 128,
                    "title": "New Product",
                    "price": 10,
                    "description": "A description",
                    "images": [
                        "[\"https://placeimg.com/640/480/any\"]"
                    ],
                    "creationAt": "2024-02-28T06:19:52.000Z",
                    "updatedAt": "2024-02-28T06:19:52.000Z",
                    "category": {
                        "id": 1,
                        "name": "Clothes",
                        "image": "https://i.imgur.com/QkIa5tT.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 129,
                    "title": "Apple iPhone 15 Pro Max",
                    "price": 600,
                    "description": "FORGED IN TITANIUM — iPhone 15 Pro Max has a strong and light aerospace-grade titanium design with a textured matt-glass back. It also features a super-tough Ceramic Shield front. And it’s splash, water and dust resistant.",
                    "images": [
                        "[\"https://m.media-amazon.com/images/I/71oFF+CnEKL._AC_SL1500_.jpg\"",
                        "\"https://m.media-amazon.com/images/I/51Rbxqpvh7L._AC_SL1500_.jpg\"",
                        "\"https://m.media-amazon.com/images/I/61Te+l80CxL._AC_SL1500_.jpg\"",
                        "\"https://m.media-amazon.com/images/I/41X+Q5-MGZL._AC_.jpg\"",
                        "\"https://m.media-amazon.com/images/I/51OzvrUbUOL._AC_.jpg\"]"
                    ],
                    "creationAt": "2024-02-28T06:20:49.000Z",
                    "updatedAt": "2024-02-28T06:20:49.000Z",
                    "category": {
                        "id": 2,
                        "name": "Electronics",
                        "image": "https://i.imgur.com/ZANVnHE.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 130,
                    "title": "New Product",
                    "price": 10,
                    "description": "A description",
                    "images": [
                        "[\"https://placeimg.com/640/480/any\"]"
                    ],
                    "creationAt": "2024-02-28T06:22:52.000Z",
                    "updatedAt": "2024-02-28T06:22:52.000Z",
                    "category": {
                        "id": 1,
                        "name": "Clothes",
                        "image": "https://i.imgur.com/QkIa5tT.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                },
                {
                    "id": 132,
                    "title": "New Product",
                    "price": 10,
                    "description": "A description",
                    "images": [
                        "[\"https://placeimg.com/640/480/any\"]"
                    ],
                    "creationAt": "2024-02-28T06:25:53.000Z",
                    "updatedAt": "2024-02-28T06:25:53.000Z",
                    "category": {
                        "id": 1,
                        "name": "Clothes",
                        "image": "https://i.imgur.com/QkIa5tT.jpeg",
                        "creationAt": "2024-02-28T02:48:01.000Z",
                        "updatedAt": "2024-02-28T02:48:01.000Z"
                    }
                }
            ]
        """.trimIndent()

    val gson = Gson()



}