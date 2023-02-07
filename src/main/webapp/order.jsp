<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Week 4 assessment - Pizza order app -- order page</title>
	</head>
	<body>
		<header>
		<h1 style="text-align:center;">Sylwia's Pizza!</h1>
		</header>
		<main>
			<div class="container">
				<h2 style="text-align:center;">Please select two toppings for your large pizza. </h2>
				<div></div>
				<div class="forms" style="display:flex;justify-content:center;">
					<form action="getPizzaOrder" method="post">
					<label for="toppingsMeat">Choose a topping (meat):</label>
					<select name="toppingsMeat" id="meat">
					  <option value="15">sausage</option>
					  <option value="14">pepperoni</option>
					  <option value="13">chicken</option>
					  <option value="5">None</option>
					</select>
					<div></div>
					<label for="toppingsVeggies">Choose a topping (veggies):</label>
					<select name="toppingsVeggies" id="veggies">
					  <option value="15">tomato</option>
					  <option value="14">artichoke</option>
					  <option value="13">spinach</option>
					  <option value="5">None</option>
					</select>
					<div style="display:flex; justify-content:center; padding:20px;">
						<input type="submit" value="Place Order"/>
					</div>
					</form>
				</div>
			</div>
		</main>
	</body>
</html>