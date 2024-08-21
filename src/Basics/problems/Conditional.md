# Java Conditional Statements Problems

## Normal Conditional Problems

1. **Grade Calculator**
   Write a program that calculates a student's letter grade based on their numeric score using simple `if-else` statements.

   **Sample Outputs:**
    - **Input:** Score = 92
        - **Output:** "Grade: A."
    - **Input:** Score = 75
        - **Output:** "Grade: C."

2. **Age Group Classification**
   Write a program that classifies a person into age groups (Child, Teen, Adult, Senior) based on their age using `if-else` statements.

   **Sample Outputs:**
    - **Input:** Age = 8
        - **Output:** "Category: Child."
    - **Input:** Age = 30
        - **Output:** "Category: Adult."

3. **Tax Calculation**
   Write a program to calculate tax based on income brackets using simple `if-else` statements.

   **Sample Outputs:**
    - **Input:** Income = $50,000
        - **Output:** "Tax: $7,500."
    - **Input:** Income = $120,000
        - **Output:** "Tax: $22,000."

4. **Discount Calculation**
   Write a program that calculates a discount based on the total purchase amount using `if-else` statements.

   **Sample Outputs:**
    - **Input:** Purchase amount = $200
        - **Output:** "Discount: 15%."
    - **Input:** Purchase amount = $40
        - **Output:** "Discount: 5%."

5. **Login Validation**
   Write a program to validate login credentials with `if-else` statements that check if the username and password are correct.

   **Sample Outputs:**
    - **Input:** Username = "admin", Password = "password123"
        - **Output:** "Login successful."
    - **Input:** Username = "user", Password = "pass"
        - **Output:** "Login failed. Incorrect username or password."

6. **Loan Approval**
   Write a program to determine loan approval based on credit score and income using `if-else` statements.

   **Sample Outputs:**
    - **Input:** Credit score = 750, Income = $60,000
        - **Output:** "Loan approved."
    - **Input:** Credit score = 650, Income = $30,000
        - **Output:** "Loan denied."

7. **Shipping Cost Calculation**
   Write a program to calculate shipping cost based on the weight of the package using `if-else` statements.

   **Sample Outputs:**
    - **Input:** Weight = 3 kg
        - **Output:** "Shipping cost: $15."
    - **Input:** Weight = 8 kg
        - **Output:** "Shipping cost: $40."

8. **Weather Advisory**
   Write a program that provides weather advisory based on temperature ranges using `if-else` statements.

   **Sample Outputs:**
    - **Input:** Temperature = 85°F
        - **Output:** "Advisory: Wear light clothing."
    - **Input:** Temperature = 32°F
        - **Output:** "Advisory: Dress warmly."

9. **Body Mass Index (BMI)**
   Write a program that calculates BMI and categorizes the result (Underweight, Normal, Overweight, Obese) using `if-else` statements.

   **Sample Outputs:**
    - **Input:** BMI = 22
        - **Output:** "Category: Normal weight."
    - **Input:** BMI = 30
        - **Output:** "Category: Obese."

10. **Seasonal Clothing Recommendation**
    Write a program that recommends clothing based on the season using `if-else` statements.

    **Sample Outputs:**
    - **Input:** Season = Summer
        - **Output:** "Recommendation: Shorts and t-shirts."
    - **Input:** Season = Winter
        - **Output:** "Recommendation: Warm coats and sweaters."

## Nested `if` Problems

1. **Eligibility for Scholarship**
   Write a program that checks if a student is eligible for a scholarship. The eligibility criteria are:
    - The student must be at least 18 years old.
    - The student must have a GPA of at least 3.5.
    - If the GPA is at least 3.8, the student gets an additional bonus.

   **Sample Outputs:**
    - **Input:** Age = 20, GPA = 3.9
        - **Output:** "Eligible for scholarship with bonus."
    - **Input:** Age = 19, GPA = 3.4
        - **Output:** "Not eligible for scholarship."

2. **Event Ticket Pricing**
   Write a program that determines the price of a ticket based on age and membership status:
    - If the age is less than 12 or greater than 65, the ticket is free.
    - If the age is between 12 and 65, check if the person is a member. Members get a discount.

   **Sample Outputs:**
    - **Input:** Age = 30, Membership = true
        - **Output:** "Ticket price: $10 (discount applied)."
    - **Input:** Age = 70
        - **Output:** "Ticket price: Free."

3. **Library Fine Calculation**
   Write a program that calculates the fine for overdue books:
    - If the book is overdue by less than 5 days, the fine is $1 per day.
    - If overdue by 5-10 days, the fine is $2 per day.
    - If overdue by more than 10 days, calculate the fine as $3 per day plus a $10 penalty.

   **Sample Outputs:**
    - **Input:** Overdue days = 3
        - **Output:** "Fine: $3."
    - **Input:** Overdue days = 7
        - **Output:** "Fine: $14."
    - **Input:** Overdue days = 12
        - **Output:** "Fine: $46."

4. **Login Validation**
   Write a program to validate a user's login attempt:
    - The username must be at least 6 characters long.
    - The password must contain at least one uppercase letter, one lowercase letter, and one digit.
    - If the password is weak (doesn't contain all required characters), prompt the user to create a stronger password.

   **Sample Outputs:**
    - **Input:** Username = "user123", Password = "Pass1"
        - **Output:** "Login successful."
    - **Input:** Username = "usr", Password = "password"
        - **Output:** "Password too weak. Please include uppercase letters, lowercase letters, and digits."

5. **Discount Eligibility**
   Write a program to determine discount eligibility in a store:
    - If the purchase amount is greater than $100, check if the customer has a membership card. Members get an additional discount.
    - If the amount is between $50 and $100, offer a standard discount.

   **Sample Outputs:**
    - **Input:** Purchase amount = $120, Membership = true
        - **Output:** "Total discount: 20%."
    - **Input:** Purchase amount = $80
        - **Output:** "Total discount: 10%."

6. **Student Grade**
   Write a program that assigns a letter grade based on a numeric score:
    - If the score is 90 or above, the grade is A.
    - If the score is between 80 and 89, check if the student has completed extra credit for an A-.
    - If the score is below 80, assign grades B, C, D, or F based on ranges.

   **Sample Outputs:**
    - **Input:** Score = 85, Extra Credit = true
        - **Output:** "Grade: A-."
    - **Input:** Score = 75
        - **Output:** "Grade: C."

7. **Shipping Cost**
   Write a program to calculate shipping cost based on weight and destination:
    - If the weight is less than 5 kg, check if the destination is domestic or international. International shipments cost more.
    - If the weight is 5 kg or more, calculate shipping cost based on weight and destination.

   **Sample Outputs:**
    - **Input:** Weight = 4 kg, Destination = International
        - **Output:** "Shipping cost: $25."
    - **Input:** Weight = 6 kg, Destination = Domestic
        - **Output:** "Shipping cost: $30."

8. **Job Eligibility**
   Write a program to determine job eligibility:
    - If the candidate is at least 21 years old, check if they have the required degree.
    - If the candidate is under 21 but has significant work experience, they might still be considered.

   **Sample Outputs:**
    - **Input:** Age = 22, Degree = true
        - **Output:** "Eligible for job."
    - **Input:** Age = 19, Experience = true
        - **Output:** "Considered based on experience."

9. **Vacation Package**
   Write a program to recommend a vacation package based on age and budget:
    - If the budget is high, offer luxury packages. Check if the age is suitable for specific activities.
    - If the budget is moderate, offer standard packages with age-specific activities.

   **Sample Outputs:**
    - **Input:** Budget = High, Age = 30
        - **Output:** "Luxury beach resort package."
    - **Input:** Budget = Moderate, Age = 65
        - **Output:** "Standard city tour package."

10. **Game Level Access**
    Write a program to determine access to game levels:
    - If the player has completed previous levels, check if they have the required experience points.
    - If the player hasn’t completed previous levels, restrict access to advanced levels.

    **Sample Outputs:**
    - **Input:** Previous levels completed = true, Experience points = 500
        - **Output:** "Access granted to advanced levels."
    - **Input:** Previous levels completed = false
        - **Output:** "Access restricted to basic levels."