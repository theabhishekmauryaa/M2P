# M2P
# 🧪 Selenium Test Automation Project with TestNG

This project demonstrates automated testing of real-world scenarios using **Selenium WebDriver** with **Java** and **TestNG** framework. The following test cases are implemented inside the `M2P` folder:

- **DemoWebShop.java**: Automates features of [Demo Web Shop](http://demowebshop.tricentis.com/)
  - Register a new user
  - Search for a product
  - Add a product to the cart

- **PageTitle.java**: 
  - Opens the Selenium homepage
  - Validates the page title using `if` condition

- **SeleniumDownloadLinkTest.java**: 
  - Clicks the "Downloads" link on the Selenium site
  - Validates that the URL contains `/downloads`

- **DemoQAHandleAlert.java**: 
  - Triggers a simple alert on [DemoQA Alerts](https://demoqa.com/alerts)
  - Validates the alert text and accepts it

- **DemoQAHandleFrame.java**: 
  - Switches to the first iframe on [DemoQA Frames](https://demoqa.com/frames)
  - Validates the heading inside the frame

### 💡 Tech Stack
- Java
- Selenium WebDriver
- TestNG
- ChromeDriver

### ▶️ How to Run
1. Clone the repository
2. Open in Eclipse/IntelliJ
3. Ensure ChromeDriver is set up with WebDriver 
4. Right-click any test file and run with TestNG

Each test includes `if` condition validations and prints a clear  success or failure message.

---
