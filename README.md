# ecomm_java_spring

**Modules**
Login, Logout Module
Seller Module
Customer Module
Product Module
Cart Module
Order Module

**Features:**

**Authentication & Validation:**
Customer and seller authentication with session tokens valid for 1 hour to ensure security.

**Seller Features:**
Administrator access to manage the entire application.
Only registered sellers with a valid session token can add, update, or delete products in the main database.
Sellers can view details of various customers and orders.

**Customer Features:**
Register and log in to obtain a valid session token.
Browse products, add them to the cart, and place orders.
Access personal orders, cart, and other features only when logged in.
