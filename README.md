 <h1>Meal Builder: Changes & Effects</h1>
<h2>1️⃣ Added Diet Versions of Beverages</h2>
    <p>
        <strong>What I did:</strong> I added two new classes:
    </p>
    <ul>
        <li><code>DietCoke</code></li>
        <li><code>DietPepsi</code></li>
    </ul>
    <p>
        <strong>Why:</strong> This allows customers to choose a diet version of Coke or Pepsi.
    </p>
    <p>
        <strong>Effect:</strong> Now, when the user selects a diet option, the system can include the diet drink in their meal without changing the existing <code>MealBuilder</code> or <code>Meal</code> classes.
    </p>
    <hr>
    <h2>2️⃣ Added a New Hot Drink: Tea</h2>
    <p>
        <strong>What I did:</strong> I introduced:
    </p>
    <ul>
        <li><code>HotDrink</code> (abstract class)</li>
        <li><code>Tea</code> (concrete class)</li>
        <li><code>Cup</code> (implements <code>Packing</code>)</li>
    </ul>
    <p>
        <strong>Why:</strong> To add a new hot drink option, modeled similarly to how cold drinks work.
    </p>
    <p>
        <strong>Effect:</strong> This allows Tea to be treated as a standard <code>Item</code> and added easily to any meal, with packaging type <code>Cup</code>.
    </p>
    <hr>
    <h2>3️⃣ Made Tea Decoratable (Sweetness & Cream)</h2>
    <p>
        <strong>What I did:</strong> Implemented the <em>Decorator Pattern</em> with:
    </p>
    <ul>
        <li><code>TeaDecorator</code> (abstract decorator)</li>
        <li><code>SweetnessDecorator</code></li>
        <li><code>CreamDecorator</code></li>
    </ul>
    <p>
        <strong>Why:</strong> To allow dynamic customization of Tea (add sugar, honey, cream).
    </p>
    <p>
        <strong>Effect:</strong> This makes Tea flexible; customers can add custom sweetness or cream, and the system updates both the name and price automatically (e.g., "Tea + 2 spoons of Sugar + Cream").
    </p>
    <hr>
    <h2>4️⃣ Made the Demo Interactive</h2>
    <p>
        <strong>What I did:</strong> Modified the <code>BuilderPatternDemo</code> to:
    </p>
    <ul>
        <li>Prompt the user for Veg/Non-Veg meal selection</li>
        <li>Ask if they want a Diet drink</li>
        <li>Offer Tea, and let them customize it (sweetness type, spoons, cream)</li>
    </ul>
    <p>
        <strong>Why:</strong> To move from a static demo to an interactive experience, making it feel like a real ordering system.
    </p>
    <p>
        <strong>Effect:</strong> Users can now build their meal step-by-step with personalized choices. Only the <code>BuilderPatternDemo</code> was changed to achieve this; no need to touch other core classes.
    </p>
    <hr>
    <h2>✅ Overall Benefits</h2>
    <ul>
        <li><strong>Extensibility:</strong> New drinks (like Tea) and decorators (like sweetness) are easy to add in the future.</li>
        <li><strong>Reusability:</strong> The Decorator pattern lets us reuse the same <code>Tea</code> base class with different combinations of add-ons.</li>
        <li><strong>Single Responsibility:</strong> Each class has a clear purpose, keeping the design clean and maintainable.</li>
    </ul>


